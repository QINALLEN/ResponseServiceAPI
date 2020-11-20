package com.bank.api.view;

import java.math.BigDecimal;

/**
 * @author QDC
 * 虚账号详情
 */
public class AccountDetail {
    /**
     * 交易日期
     */
    private String transferDate;

    /**
     * 交易时间
     */
    private String transferTime;

    /**
     * 付款开户行名称
     */
    private String payBankName;
    /**
     * 付款开户行号
     */
    private String payBankNo;
    /**
     * 付款人账号
     */
    private String payUserNo;
    /**
     * 付款人
     */
    private String payUserName;
    /**
     * 收款虚账户
     */
    private String accountNo;
    /**
     * 交易金额
     */
    private BigDecimal amount;

    /**
     * 交易类型
     */
    private Integer payType;

    private String draweeAccNo;

    private String draweeAccName;

    public String getDraweeAccNo() {
        return draweeAccNo;
    }

    public void setDraweeAccNo(String draweeAccNo) {
        this.draweeAccNo = draweeAccNo;
    }

    public String getDraweeAccName() {
        return draweeAccName;
    }

    public void setDraweeAccName(String draweeAccName) {
        this.draweeAccName = draweeAccName;
    }

    public String getTransferTime() {
        return transferTime;
    }

    public void setTransferTime(String transferTime) {
        this.transferTime = transferTime;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public String getTransferDate() {
        return transferDate;
    }

    public void setTransferDate(String transferDate) {
        this.transferDate = transferDate;
    }

    public String getPayBankName() {
        return payBankName;
    }

    public void setPayBankName(String payBankName) {
        this.payBankName = payBankName;
    }

    public String getPayBankNo() {
        return payBankNo;
    }

    public void setPayBankNo(String payBankNo) {
        this.payBankNo = payBankNo;
    }

    public String getPayUserNo() {
        return payUserNo;
    }

    public void setPayUserNo(String payUserNo) {
        this.payUserNo = payUserNo;
    }

    public String getPayUserName() {
        return payUserName;
    }

    public void setPayUserName(String payUserName) {
        this.payUserName = payUserName;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
