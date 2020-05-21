/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucsc.Thogakade.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author Taniya
 */
@Entity
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) 
    private int oId;
    private String orderDate;
    @ManyToOne(cascade = CascadeType.ALL)
    private Customer customer;

    public Orders() {
    }

    public Orders(String orderDate, Customer customer) {
        this.orderDate = orderDate;
        this.customer = customer;
    }

    public Orders(int oId, String orderDate, Customer customer) {
        this.oId = oId;
        this.orderDate = orderDate;
        this.customer = customer;
    }
    
    

    public int getoId() {
        return oId;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setoId(int oId) {
        this.oId = oId;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Orders{" + "oId=" + oId + ", orderDate=" + orderDate + ", customer=" + customer + '}';
    }
    
    
    
}
