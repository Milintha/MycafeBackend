package com.boot.mycafe.cafe.Repository;

import com.boot.mycafe.cafe.Model.WalletHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WalletHistoryRepository extends JpaRepository<WalletHistory,Integer> {
}
