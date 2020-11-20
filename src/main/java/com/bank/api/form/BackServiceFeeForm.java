package com.bank.api.form;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @author QDC
 * 服务费详情
 */
public class BackServiceFeeForm {

    private Integer id;

    /**
     * 招标计划ID
     */
    private Integer tenderPlanId;

    /**
     * 招标计划编号
     */
    private String planCode;

    /**
     * 需求方
     */
    private String demand;

    /**
     * 需求方id
     */
    private String demandId;

    /**
     * 需求单位名称
     */
    private String demandCompany;

    /**
     * 供应商ID
     */
    private String supplierId;

    /**
     * 供应商名称
     */
    private String supplierName;


    /**
     * 寻源方式
     */
    private String sourceFinding;

    /**
     * 采购类型
     */
    private String purchaseType;

    /**
     * 项目名称
     */
    private String projectName;

    /**
     * 虚拟账户
     */
    private String accountNo;

    /**
     * 费用
     */
    private BigDecimal money;

    /**
     * 备注
     */
    private String markRemark;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTenderPlanId() {
        return tenderPlanId;
    }

    public void setTenderPlanId(Integer tenderPlanId) {
        this.tenderPlanId = tenderPlanId;
    }

    public String getPlanCode() {
        return planCode;
    }

    public void setPlanCode(String planCode) {
        this.planCode = planCode;
    }

    public String getDemand() {
        return demand;
    }

    public void setDemand(String demand) {
        this.demand = demand;
    }

    public String getDemandId() {
        return demandId;
    }

    public void setDemandId(String demandId) {
        this.demandId = demandId;
    }

    public String getDemandCompany() {
        return demandCompany;
    }

    public void setDemandCompany(String demandCompany) {
        this.demandCompany = demandCompany;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getSourceFinding() {
        return sourceFinding;
    }

    public void setSourceFinding(String sourceFinding) {
        this.sourceFinding = sourceFinding;
    }

    public String getPurchaseType() {
        return purchaseType;
    }

    public void setPurchaseType(String purchaseType) {
        this.purchaseType = purchaseType;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public String getMarkRemark() {
        return markRemark;
    }

    public void setMarkRemark(String markRemark) {
        this.markRemark = markRemark;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }
}
