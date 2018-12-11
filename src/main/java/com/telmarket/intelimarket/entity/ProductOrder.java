package com.telmarket.intelimarket.entity;
// Generated Jul 8, 2018 3:59:47 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * ProductOrder generated by hbm2java
 */
public class ProductOrder  implements java.io.Serializable {


     private Integer orderId;
     private Product product;
     private Users users;
     private int deliveryId;
     private Date orderDate;
     private int orderQty;
     private double totalPrice;
     private String orderStatus;
     private Set productOrderDetailses = new HashSet(0);

    public ProductOrder() {
    }

	
    public ProductOrder(Product product, Users users, int deliveryId, Date orderDate, int orderQty, double totalPrice, String orderStatus) {
        this.product = product;
        this.users = users;
        this.deliveryId = deliveryId;
        this.orderDate = orderDate;
        this.orderQty = orderQty;
        this.totalPrice = totalPrice;
        this.orderStatus = orderStatus;
    }
    public ProductOrder(Product product, Users users, int deliveryId, Date orderDate, int orderQty, double totalPrice, String orderStatus, Set productOrderDetailses) {
       this.product = product;
       this.users = users;
       this.deliveryId = deliveryId;
       this.orderDate = orderDate;
       this.orderQty = orderQty;
       this.totalPrice = totalPrice;
       this.orderStatus = orderStatus;
       this.productOrderDetailses = productOrderDetailses;
    }
   
    public Integer getOrderId() {
        return this.orderId;
    }
    
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }
    public Product getProduct() {
        return this.product;
    }
    
    public void setProduct(Product product) {
        this.product = product;
    }
    public Users getUsers() {
        return this.users;
    }
    
    public void setUsers(Users users) {
        this.users = users;
    }
    public int getDeliveryId() {
        return this.deliveryId;
    }
    
    public void setDeliveryId(int deliveryId) {
        this.deliveryId = deliveryId;
    }
    public Date getOrderDate() {
        return this.orderDate;
    }
    
    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }
    public int getOrderQty() {
        return this.orderQty;
    }
    
    public void setOrderQty(int orderQty) {
        this.orderQty = orderQty;
    }
    public double getTotalPrice() {
        return this.totalPrice;
    }
    
    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
    public String getOrderStatus() {
        return this.orderStatus;
    }
    
    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }
    public Set getProductOrderDetailses() {
        return this.productOrderDetailses;
    }
    
    public void setProductOrderDetailses(Set productOrderDetailses) {
        this.productOrderDetailses = productOrderDetailses;
    }




}


