package com.project20.money.Repository;

import com.project20.money.Entity.TransactionsModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<TransactionsModel,Long> {
}
