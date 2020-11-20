package com.bank.api.form;

import java.math.BigDecimal;

public class PushAnnualFeeForm {

    private String tenderPlanId;

    private String tenderCode;

    private String demand;

    private String demandId;

    private String demandCompany;

    private String projectName;

    private String projectNo;

    private Integer vtype;

    private Integer type;

    private Integer protype;

    private String supplierId;

    private String supplierName;

    private BigDecimal amount;

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

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectNo() {
        return projectNo;
    }

    public void setProjectNo(String projectNo) {
        this.projectNo = projectNo;
    }

    public Integer getVtype() {
        return vtype;
    }

    public void setVtype(Integer vtype) {
        this.vtype = vtype;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getProtype() {
        return protype;
    }

    public void setProtype(Integer protype) {
        this.protype = protype;
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

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
