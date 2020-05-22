/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucsc.Thogakade.controller;

import java.util.ArrayList;
import ucsc.Thogakade.dto.CustomerDTO;
import ucsc.Thogakade.service.CustomerService;

/**
 *
 * @author Taniya
 */
public class CustomerController {
    CustomerService cs= new CustomerService();
    public boolean addCustomer(CustomerDTO customerDTO) throws Exception {
        return cs.saveCustomer(customerDTO);
    }

   
    public CustomerDTO getCustomerByName(String text) throws Exception {
        return cs.getCustomerByName(text);
    }

     
    public ArrayList<CustomerDTO> getAllCustomers() throws Exception {
        return cs.getAllCustomers();
    }
   
    
}
