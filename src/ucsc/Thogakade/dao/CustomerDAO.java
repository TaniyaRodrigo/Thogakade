/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucsc.Thogakade.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import ucsc.Thogakade.entity.Customer;

/**
 *
 * @author Taniya
 */
public class CustomerDAO {
    private Session session;

    public void setSession(Session customerSession) throws Exception {
        this.session = customerSession;
    }

    public boolean addCustomer(Customer customer) throws Exception {
        Serializable save = session.save(customer);
        
        if (save!=null) {
            return true;
        } else {
            return false;

        }
    }

    public Customer getCustomerBYName(String text) throws Exception {
        Customer customer = (Customer) session.createQuery("from Customer where cname='" + text + "'").list().get(0);
        return customer;
    }

    public ArrayList<Customer> getAllCustomers() throws Exception {
        List<Customer> custList = session.createQuery("from Customer").list();
        return (ArrayList<Customer>) custList;
    }

    
}
