/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucsc.Thogakade.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Taniya
 */
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int cId;
    private String cname;
    private String contact;
    private double creditLimit;
    private int creditDays;

    public Customer() {
    }

    public Customer(int cId, String cname, String contact, double creditLimit, int creditDays) {
        this.cId = cId;
        this.cname = cname;
        this.contact = contact;
        this.creditLimit = creditLimit;
        this.creditDays = creditDays;
    }

    public int getcId() {
        return cId;
    }

    public String getCname() {
        return cname;
    }

    public String getContact() {
        return contact;
    }

    public int getCreditDays() {
        return creditDays;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setcId(int cId) {
        this.cId = cId;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public void setCreditDays(int creditDays) {
        this.creditDays = creditDays;
    }

    
   @Override

    @Override
    public String toString() {
        return "Customer{" + "cId=" + cId + ", cname=" + cname + ", contact=" + contact + ", creditLimit=" + creditLimit + ", creditDays=" + creditDays + '}';
    }
   
}
