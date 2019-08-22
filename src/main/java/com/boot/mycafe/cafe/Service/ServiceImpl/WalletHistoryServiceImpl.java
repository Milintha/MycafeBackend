package com.boot.mycafe.cafe.Service.ServiceImpl;

import com.boot.mycafe.cafe.Model.WalletHistory;
import com.boot.mycafe.cafe.Repository.WalletHistoryRepository;
import com.boot.mycafe.cafe.Service.IWalletHistoryService;
import com.boot.mycafe.cafe.Service.IWalletService;
import org.springframework.stereotype.Service;

@Service
public class WalletHistoryServiceImpl implements IWalletHistoryService {

    private WalletHistoryRepository historyRepository;

    @Override
    public boolean addWalletHistory(WalletHistory walletHistory) {
        historyRepository.save(walletHistory);
        return true;
    }
}
