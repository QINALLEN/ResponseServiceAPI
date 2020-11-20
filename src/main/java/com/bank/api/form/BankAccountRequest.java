package com.bank.api.form;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class BankAccountRequest {

  private BigDecimal amount;

  private Integer supplierId;

  private String supplierName;

  private String tenderPlanId;

  private String tenderCode;

  private String demand;

  private String demandId;

  private String demandCompany;

  private String projectNo;

  private String projectName;

  private Integer vtype;

  private String marginStatus;

  private LocalDateTime transferDate;

  private String receiptStatus;

  private String subsystemCode;

  private String purchaseType;

  private String sourceFinding;

  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public Integer getSupplierId() {
    return supplierId;
  }

  public void setSupplierId(Integer supplierId) {
    this.supplierId = supplierId;
  }

  public String getSupplierName() {
    return supplierName;
  }

  public void setSupplierName(String supplierName) {
    this.supplierName = supplierName;
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

  public String getProjectNo() {
    return projectNo;
  }

  public void setProjectNo(String projectNo) {
    this.projectNo = projectNo;
  }

  public String getProjectName() {
    return projectName;
  }

  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }

  public Integer getVtype() {
    return vtype;
  }

  public void setVtype(Integer vtype) {
    this.vtype = vtype;
  }

  public String getMarginStatus() {
    return marginStatus;
  }

  public void setMarginStatus(String marginStatus) {
    this.marginStatus = marginStatus;
  }

  public LocalDateTime getTransferDate() {
    return transferDate;
  }

  public void setTransferDate(LocalDateTime transferDate) {
    this.transferDate = transferDate;
  }

  public String getReceiptStatus() {
    return receiptStatus;
  }

  public void setReceiptStatus(String receiptStatus) {
    this.receiptStatus = receiptStatus;
  }

  public String getSubsystemCode() {
    return subsystemCode;
  }

  public void setSubsystemCode(String subsystemCode) {
    this.subsystemCode = subsystemCode;
  }

  public String getPurchaseType() {
    return purchaseType;
  }

  public void setPurchaseType(String purchaseType) {
    this.purchaseType = purchaseType;
  }

  public String getSourceFinding() {
    return sourceFinding;
  }

  public void setSourceFinding(String sourceFinding) {
    this.sourceFinding = sourceFinding;
  }
}
