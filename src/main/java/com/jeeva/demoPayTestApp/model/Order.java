package com.jeeva.demoPayTestApp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table
public class Order {
    @Column
    Integer orderId;
    @Column
    Integer userId;
    @Column
    String productName;
    @Column
    Integer productQuantity;
    @Column
    double productPrice;
    @Column
    double taxOnProduct;
    @Column
    double netPrice;
    @Column
    OrderStatus orderStatus;
    @Column
    Date orderDate;
    @Column
    Date deliveryDate;
    @Column
    Date creationDate;
    @Column
    Date updationDate;

}
