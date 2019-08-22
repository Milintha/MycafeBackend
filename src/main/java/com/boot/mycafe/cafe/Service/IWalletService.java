package com.boot.mycafe.cafe.Service;

import com.boot.mycafe.cafe.Model.Wallet;

import java.util.List;

public interface IWalletService {
    /*ok*/
    float getBalance(int id);
    /*ok*/
    List<Wallet> findAll();
    /*ok*/
    boolean createNewWallet(int cust_id);

    boolean addWalletHistory(int id,float amount,boolean type,String date);

    boolean updateWallet(int id,float amount,boolean type);

 }
