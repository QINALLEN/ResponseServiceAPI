package com.bank.api.form;

import java.time.LocalDateTime;

public class Description {
    private String accountNo;
    private String marginStatus;
    private String receiptStatus;
    private LocalDateTime transferDate;

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getMarginStatus() {
        return marginStatus;
    }

    public void setMarginStatus(String marginStatus) {
        this.marginStatus = marginStatus;
    }

    public String getReceiptStatus() {
        return receiptStatus;
    }

    public void setReceiptStatus(String receiptStatus) {
        this.receiptStatus = receiptStatus;
    }

    public LocalDateTime getTransferDate() {
        return transferDate;
    }

    public void setTransferDate(LocalDateTime transferDate) {
        this.transferDate = transferDate;
    }
}
