/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucsc.Thogakade.service;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import ucsc.Thogakade.dao.CustomerDAO;
import ucsc.Thogakade.dto.CustomerDTO;
import ucsc.Thogakade.entity.Customer;
import ucsc.Thogakade.util.SessionFactoryUtil;

/**
 *
 * @author Taniya
 */
public class CustomerService {
    CustomerDAO customerDAO = new CustomerDAO();

    public boolean saveCustomer(CustomerDTO customerDTO) throws Exception {

        SessionFactory sf = SessionFactoryUtil.getSessionFactory();
        Session customerSession = sf.openSession();

        Transaction tx = null;

        Customer customer = new Customer();
        customer.setCname(customerDTO.getcName());
        customer.setContact(customerDTO.getContact());
        customer.setCreditLimit(customerDTO.getCreditLimit());
        customer.setCreditDays(customerDTO.getCreditDays());

        try {
            tx = customerSession.beginTransaction();

            customerDAO.setSession(customerSession);
            boolean result = customerDAO.addCustomer(customer);

            if (result) {
                tx.commit();
                return true;

            } else {
                tx.rollback();
                return false;

            }

        } catch (HibernateException ex) {

            ex.printStackTrace();
            tx.rollback();
            return false;
        } finally {
            customerSession.close();
        }

    }

    public CustomerDTO getCustomerByName(String text) {
        SessionFactory sf = SessionFactoryUtil.getSessionFactory();
        Session customerSession = sf.openSession();
        Transaction tx = null;

        try {
            tx = customerSession.beginTransaction();

            try {
                customerDAO.setSession(customerSession);
            } catch (Exception ex) {
                Logger.getLogger(CustomerService.class.getName()).log(Level.SEVERE, null, ex);
            }
            Customer customer = customerDAO.getCustomerBYName(text);
            CustomerDTO cusDTO = new CustomerDTO(customer.getcId(), customer.getCname(), customer.getContact(),
                    customer.getCreditLimit(), customer.getCreditDays());
            tx.commit();
            return cusDTO;

        } catch (HibernateException ex) {

            ex.printStackTrace();
            tx.rollback();
            return null;
        } catch (Exception ex) {
            Logger.getLogger(CustomerService.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            customerSession.close();
        }
        return null;

    }

    public ArrayList<CustomerDTO> getAllCustomers() throws Exception {
        SessionFactory sf = SessionFactoryUtil.getSessionFactory();
        Session customerSession = sf.openSession();
        Transaction tx = null;

        try {
            tx = customerSession.beginTransaction();

            customerDAO.setSession(customerSession);
            ArrayList<Customer> custList = customerDAO.getAllCustomers();

            ArrayList<CustomerDTO> custDTOList = new ArrayList<>();
            for (Customer customer : custList) {
                CustomerDTO customerDTO = new CustomerDTO();
                customerDTO.setcId(customer.getcId());
                customerDTO.setcName(customer.getCname());
                customerDTO.setContact(customer.getContact());
                customerDTO.setCreditLimit(customer.getCreditLimit());
                customerDTO.setCreditDays(customer.getCreditDays());
                custDTOList.add(customerDTO);
            }

            tx.commit();
            return custDTOList;

        } catch (HibernateException ex) {

            ex.printStackTrace();
            tx.rollback();
            return null;
        } finally {
            customerSession.close();
        }

    }
}
