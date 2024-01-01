package com.jeeva.demoPayTestApp.model;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.CurrentTimestamp;

import java.util.Date;

@Entity
@Table
public class Transaction {
    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    Integer transactionId;
    @Column
    Integer userId;
    @Column
    String transactionDescription;
    @Column
    String transactionType;
    @Column

    double transactionAmount;
    @Column

    String transactionCurrency;
    @Column

    String destinationAccount;
    @Column

    String destinationMobileNumber;
    @CreationTimestamp
    @Column

    Date creationDate;
    @CurrentTimestamp
    @Column

    Date updatedDate;
    @Column
    @Enumerated(EnumType.STRING)
    TxnStatus transactionStatus;

    public Integer getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getTransactionDescription() {
        return transactionDescription;
    }

    public void setTransactionDescription(String transactionDescription) {
        this.transactionDescription = transactionDescription;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public double getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(double transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public String getTransactionCurrency() {
        return transactionCurrency;
    }

    public void setTransactionCurrency(String transactionCurrency) {
        this.transactionCurrency = transactionCurrency;
    }

    public String getDestinationAccount() {
        return destinationAccount;
    }

    public void setDestinationAccount(String destinationAccount) {
        this.destinationAccount = destinationAccount;
    }

    public String getDestinationMobileNumber() {
        return destinationMobileNumber;
    }

    public void setDestinationMobileNumber(String destinationMobileNumber) {
        this.destinationMobileNumber = destinationMobileNumber;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    public TxnStatus isTransactionStatus() {
        return transactionStatus;
    }

    public void setTransactionStatus(TxnStatus transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

    public String getFailureReason() {
        return failureReason;
    }

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    @Column

    String failureReason;
}
