package com.boot.mycafe.cafe.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "wallet_history")
public class WalletHistory {

    @Column(name = "his_id")
    private int his_id;
    @Column(name = "wallet_id")
    private int wallet_id;
    @Column(name = "type")
    private String type;
    @Column(name = "re_amount")
    private int re_amount;
    @Column(name = "payment")
    private int payment;
    @Column(name = "date")
    private int date;
    @Column(name = "time")
    private int time;

    public WalletHistory() {
    }

    public WalletHistory(int his_id, int wallet_id, String type, int re_amount, int payment, int date, int time) {
        this.setHis_id(his_id);
        this.setWallet_id(wallet_id);
        this.setType(type);
        this.setRe_amount(re_amount);
        this.setPayment(payment);
        this.setDate(date);
        this.setTime(time);
    }


    public int getHis_id() {
        return his_id;
    }

    public void setHis_id(int his_id) {
        this.his_id = his_id;
    }

    public int getWallet_id() {
        return wallet_id;
    }

    public void setWallet_id(int wallet_id) {
        this.wallet_id = wallet_id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getRe_amount() {
        return re_amount;
    }

    public void setRe_amount(int re_amount) {
        this.re_amount = re_amount;
    }

    public int getPayment() {
        return payment;
    }

    public void setPayment(int payment) {
        this.payment = payment;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}
