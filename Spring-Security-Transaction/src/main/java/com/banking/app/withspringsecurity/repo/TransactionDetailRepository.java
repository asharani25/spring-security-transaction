package com.banking.app.withspringsecurity.repo;

import com.banking.app.withspringsecurity.entity.TransactionDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionDetailRepository extends JpaRepository<TransactionDetail,Long> {
        List<TransactionDetail> findByAll();
}
