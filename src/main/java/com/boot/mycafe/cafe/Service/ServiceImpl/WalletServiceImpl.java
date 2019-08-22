package com.boot.mycafe.cafe.Service.ServiceImpl;

import com.boot.mycafe.cafe.Model.Wallet;
import com.boot.mycafe.cafe.Repository.WalletRepository;
import com.boot.mycafe.cafe.Service.IWalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class WalletServiceImpl implements IWalletService {
    @Autowired
    private WalletRepository walletRepository;

    @Override
    public float getBalance(int id) {

        return walletRepository.getOne(id).getBalance();
    }

    @Override
    public List<Wallet> findAll() {
        return null;
    }

    @Override
    public boolean createNewWallet(int cust_id) {
        Wallet w1=new Wallet(cust_id,"2019-07-25",230);
        walletRepository.save(w1);
            return true;
    }

    @Override
    public boolean addWalletHistory(int id, float amount, boolean type, String date) {
        return false;
    }

    @Override
    public boolean updateWallet(int id, float amount, boolean type) {
        return false;
    }
}
