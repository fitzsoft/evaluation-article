package com.evaluation.article.hexagonal.evaluation.cores.models;


import javax.persistence.GeneratedValue;
import javax.persistence.Id;


public class MobileMoneyTransfer {
    private static final long serialVersionUID = 425L;

    @Id
    @GeneratedValue
    private Integer Id;

    private String phoneNumber;
    private String amount;

    // Constructors , Getters/Setters etc.

    public MobileMoneyTransfer(Integer id, String phoneNumber, String amount) {
        Id = id;
        this.phoneNumber = phoneNumber;
        this.amount = amount;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
