package com.banking.app.withspringsecurity.entity;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "transactions")

public class TransactionDetail {
    @Id
    private Long id;
    private Long amount;
    private Long lastDepositedAmount;
    private Long lastWithdrawAmount;

    @Override
    public String toString() {
        return "TransactionDetail{" +
                "id=" + id +
                ", amount=" + amount +
                ", lastDepositedAmount=" + lastDepositedAmount +
                ", lastWithdrawAmount=" + lastWithdrawAmount +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public Long getLastDepositedAmount() {
        return lastDepositedAmount;
    }

    public void setLastDepositedAmount(Long lastDepositedAmount) {
        this.lastDepositedAmount = lastDepositedAmount;
    }

    public Long getLastWithdrawAmount() {
        return lastWithdrawAmount;
    }

    public void setLastWithdrawAmount(Long lastWithdrawAmount) {
        this.lastWithdrawAmount = lastWithdrawAmount;
    }
}
