package com.bank.api.view;

/**
 * @author
 * 申请虚账户返回信息
 */
public class ApplyAccountBack {
    /**
     * 虚账号
     */
    private String accountNo;
    /**
     * 主账号
     */
    private String primaryAccount;
    /**
     * 银行类型
     */
    private String bankType;

    private String instSeq;

    private String accountName;

    public String getPrimaryAccount() {
        return primaryAccount;
    }

    public void setPrimaryAccount(String primaryAccount) {
        this.primaryAccount = primaryAccount;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getInstSeq() {
        return instSeq;
    }

    public void setInstSeq(String instSeq) {
        this.instSeq = instSeq;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getBankType() {
        return bankType;
    }

    public void setBankType(String bankType) {
        this.bankType = bankType;
    }
}
