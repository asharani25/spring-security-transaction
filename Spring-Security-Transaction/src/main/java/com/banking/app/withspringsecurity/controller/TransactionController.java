package com.banking.app.withspringsecurity.controller;

import com.banking.app.withspringsecurity.entity.TransactionDetail;
import com.banking.app.withspringsecurity.service.TransactionDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TransactionController {
    @Autowired
    TransactionDetailService transactionDetailService;

    @GetMapping("/transactionDetails")
    @ResponseBody
    public List<TransactionDetail> getTransactions(){
        return transactionDetailService.getTransactions();
    }
}
