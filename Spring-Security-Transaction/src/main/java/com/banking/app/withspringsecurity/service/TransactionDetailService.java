package com.banking.app.withspringsecurity.service;

import com.banking.app.withspringsecurity.entity.TransactionDetail;
import com.banking.app.withspringsecurity.repo.TransactionDetailRepository;

import java.util.List;

public interface TransactionDetailService {

    List<TransactionDetail> getTransactions();
}
