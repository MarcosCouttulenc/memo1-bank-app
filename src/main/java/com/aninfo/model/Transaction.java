package com.aninfo.model;
import javax.persistence.*;
import com.aninfo.model.TransactionType;

@Entity
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    private Long cbuAccount;

    private TransactionType type;

    private Double amount;

    public Transaction() {
    }

    public Transaction(Long cbuAccount, Double amount, TransactionType type) {
        //this.id = id;
        this.cbuAccount = cbuAccount;
        this.amount = amount;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public Long getCbuAccount() {
        return cbuAccount;
    }

    public void setCbuAccount(Long cbuAccount) {
        this.cbuAccount = cbuAccount;
    }

    public TransactionType getType() {
        return type;
    }

    public void setType(TransactionType type) {
        this.type = type;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
