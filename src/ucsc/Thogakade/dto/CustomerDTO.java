/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucsc.Thogakade.dto;

/**
 *
 * @author Taniya
 */
public class CustomerDTO {
    private int cId;
    private String cName;
    private String contact;
    private double creditLimit;
    private int creditDays;

    public CustomerDTO() {
    }

    public CustomerDTO(int cId, String cName, String contact, double creditLimit, int creditDays) {
        this.cId = cId;
        this.cName = cName;
        this.contact = contact;
        this.creditLimit = creditLimit;
        this.creditDays = creditDays;
    }

    public CustomerDTO(String cName, String contact, double creditLimit, int creditDays) {
        this.cName = cName;
        this.contact = contact;
        this.creditLimit = creditLimit;
        this.creditDays = creditDays;
    }

    public int getcId() {
        return cId;
    }

    public String getcName() {
        return cName;
    }

    public String getContact() {
        return contact;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public int getCreditDays() {
        return creditDays;
    }

    public void setcId(int cId) {
        this.cId = cId;
    }

    public void setcName(String cName) {
        this.cName = cName;
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
    
    
}
