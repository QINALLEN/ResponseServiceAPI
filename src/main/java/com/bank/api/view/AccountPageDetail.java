package com.bank.api.view;

import java.math.BigDecimal;

/**
 * @author QDC
 * 虚账号列表
 */
public class AccountPageDetail {
    /**
     * 招标计划id
     */
    private String tenderPlanId;
    /**
     * 招标计划编号
     */
    private String tenderCode;
    /**
     * 项目名称
     */
    private String projectName;
    /**
     * 供应商名称
     */
    private String supplierName;
    /**
     * 虚账号
     */
    private String accountNo;
    /**
     * 约定费用
     */
    private BigDecimal amount;
    /**
     * 实际费用
     */
    private BigDecimal actualAmount;
    /**
     * 交易时间
     */
    private String transferTime;
    /**
     * 交易类型 1:转出  2:转入  3:退款中  4:退款成功  -1:退款失败  -2:转账失败
     */
    private Integer ttype;

    public AccountPageDetail() {
    }

    public AccountPageDetail(String tenderPlanId, String tenderCode, String projectName, String supplierName, String accountNo, BigDecimal amount, BigDecimal actualAmount, String transferTime, Integer ttype) {
        this.tenderPlanId = tenderPlanId;
        this.tenderCode = tenderCode;
        this.projectName = projectName;
        this.supplierName = supplierName;
        this.accountNo = accountNo;
        this.amount = amount;
        this.actualAmount = actualAmount;
        this.transferTime = transferTime;
        this.ttype = ttype;
    }

    public String getTenderPlanId() {
        return tenderPlanId;
    }

    public void setTenderPlanId(String tenderPlanId) {
        this.tenderPlanId = tenderPlanId;
    }

    public String getTenderCode() {
        return tenderCode;
    }

    public void setTenderCode(String tenderCode) {
        this.tenderCode = tenderCode;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
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

    public BigDecimal getActualAmount() {
        return actualAmount;
    }

    public void setActualAmount(BigDecimal actualAmount) {
        this.actualAmount = actualAmount;
    }

    public String getTransferTime() {
        return transferTime;
    }

    public void setTransferTime(String transferTime) {
        this.transferTime = transferTime;
    }

    public Integer getTtype() {
        return ttype;
    }

    public void setTtype(Integer ttype) {
        this.ttype = ttype;
    }
}
