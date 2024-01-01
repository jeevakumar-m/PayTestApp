package com.jeeva.demoPayTestApp.model;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.CurrentTimestamp;
import org.hibernate.annotations.Formula;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Entity
@Table
public class Order {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer orderId;
    @Column
    Integer userId;
    @Column
    String productName;
    @Column
    Integer productQuantity;
    @Column
    Integer productPrice;
    @Column
    Integer taxOnProduct;
    @Column
    Integer netPrice;
    @Column
    @Enumerated(EnumType.STRING)
    OrderStatus orderStatus;
    @Column
    @CurrentTimestamp
    Date orderDate;
    @Column
    Date deliveryDate;
    @Column
    @CreationTimestamp
    Date creationDate;
    @Column
    @UpdateTimestamp
    Date updationDate;

}
