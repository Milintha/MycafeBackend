package com.boot.mycafe.cafe.Model;

import javax.persistence.*;

@Entity
@Table(name="wallet")
public class Wallet {

    @Id
    @Column(name = "wallet_id")
    private int wallet_id;
    @Column(name="cust_id")
    private int cust_id;
    @Column(name = "date")
    private String date;
    @Column(name = "balance")
    private float balance;

    public Wallet() {

    }

    public Wallet(int cust_id, String date, float balance) {
        this.cust_id = cust_id;
        this.date = date;
        this.balance = balance;
    }

    public int getWallet_id() {
        return wallet_id;
    }

    public void setWallet_id(int wallet_id) {
        this.wallet_id = wallet_id;
    }

    public int getCust_id() {    return cust_id;    }

    public void setCust_id(int cust_id) { this.cust_id = cust_id; }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }




}
