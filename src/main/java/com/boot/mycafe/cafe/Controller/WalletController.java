package com.boot.mycafe.cafe.Controller;

import com.boot.mycafe.cafe.Model.Wallet;
import com.boot.mycafe.cafe.Service.ServiceImpl.WalletServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/wallet")
public class WalletController {

    @Autowired
    private WalletServiceImpl walletService;

    /*Get customer current wallet balance*/
    @GetMapping("/balance/{id}")
    public float getBalance(@PathVariable Integer id) {
        return walletService.getBalance(id);
    }

    /*get all customers' wallet details*/
    @GetMapping("/all")
    public List<Wallet> getAllWallet() {
        return walletService.findAll();

    }
    @GetMapping("/create/{cust_id}")
    public boolean createNewWallet(@PathVariable Integer cust_id){
        return walletService.createNewWallet(cust_id);
    }


}
