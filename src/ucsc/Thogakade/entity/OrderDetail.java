/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucsc.Thogakade.entity;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.ManyToOne;

/**
 *
 * @author Taniya
 */
public class OrderDetail implements Serializable{
    private int orderQuantity;
    private double unitPrice;
    
    @ManyToOne(cascade = CascadeType.ALL)
    private Orders orders;
    
    @ManyToOne(cascade = CascadeType.ALL)
    private Item item;
    
    @EmbeddedId
    private OrderDetail_PK orderDetail_PK;

    public OrderDetail() {
    }

    public OrderDetail(int orderQuantity, double unitPrice, Orders orders, Item item) {
        this.orderQuantity = orderQuantity;
        this.unitPrice = unitPrice;
        this.orders = orders;
        this.item = item;
    }

    public int getOrderQuantity() {
        return orderQuantity;
    }

    public void setOrderQuantity(int orderQuantity) {
        this.orderQuantity = orderQuantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public OrderDetail_PK getOrderDetail_PK() {
        return orderDetail_PK;
    }

    public void setOrderDetail_PK(OrderDetail_PK orderDetail_PK) {
        this.orderDetail_PK = orderDetail_PK;
    }

    @Override
    public String toString() {
        return "OrderDetail{" + "orderQuantity=" + orderQuantity + ", unitPrice=" + unitPrice + ", orders=" + orders + ", item=" + item + ", orderDetail_PK=" + orderDetail_PK + '}';
    }
    
    
    
}
