/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucsc.Thogakade.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

/**
 *
 * @author Taniya
 */
@Entity
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int iId;
    private String description;
    private int qtyOnHand;
    private double unitPrice;

    public Item() {
    }

    public Item(int iId, String description, int qtyOnHand, double unitPrice) {
        this.iId = iId;
        this.description = description;
        this.qtyOnHand = qtyOnHand;
        this.unitPrice = unitPrice;
    }

    public int getiId() {
        return iId;
    }

    public String getDescription() {
        return description;
    }

    public int getQtyOnHand() {
        return qtyOnHand;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setiId(int iId) {
        this.iId = iId;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setQtyOnHand(int qtyOnHand) {
        this.qtyOnHand = qtyOnHand;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return "Item{" + "iId=" + iId + ", description=" + description + ", qtyOnHand=" + qtyOnHand + ", unitPrice=" + unitPrice + '}';
    }
    
    
    
    
}
