package com.banking.app.withspringsecurity.service.impl;

import com.banking.app.withspringsecurity.entity.TransactionDetail;
import com.banking.app.withspringsecurity.service.TransactionDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import com.banking.app.withspringsecurity.repo.TransactionDetailRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionDetailServiceImpl implements TransactionDetailService {

    @Autowired
    TransactionDetailRepository transactionRepo;

    @Override
    public List<TransactionDetail> getTransactions() {
        return transactionRepo.findAll();
    }
}
