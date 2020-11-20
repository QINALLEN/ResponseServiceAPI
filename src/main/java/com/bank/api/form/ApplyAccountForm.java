package com.bank.api.form;


import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *虚账号申请参数
 */
public class ApplyAccountForm {

  /**
   * 子系统编号，由平台统一分配
   */
  private String subsystemCode;

  /**
   * 项目编号
   */
  private String projectNo;

  /**
   * 项目名称
   */
  private String projectName;

  /**
   * 供应商公司表自增ID
   */
  private String smCompanyId;

  /**
   * 招标编号
   */
  private String tenderCode;

  /**
   * 招标计划ID
   */
  private String tenderPlanId;

  /**
   * 需求方
   */
  private String demand;

  /**
   * 需求方ID
   */
  private String demandId;

  /**
   * 需求单位名称
   */
  private String demandCompany;

  /**
   * 交易金额
   */
  private BigDecimal amount;

  /**
   * 账户类型 1 标书费 2 投标保证金 3 履约保证金
   */
  private Integer vtype;

  /**
   * 供应商id
   */
  private String supplierId;

  /**
   * 供应商名称
   */
  private String supplierName;

  /**
   * 结束时间
   */
  private LocalDateTime endTime;

  /**
   * 采购类型
   */
  private String purchaseType;

  /**
   * 寻源方式
   */
  private String sourceFinding;

  public String getSubsystemCode() {
    return subsystemCode;
  }

  public void setSubsystemCode(String subsystemCode) {
    this.subsystemCode = subsystemCode;
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

  public String getSmCompanyId() {
    return smCompanyId;
  }

  public void setSmCompanyId(String smCompanyId) {
    this.smCompanyId = smCompanyId;
  }

  public String getTenderCode() {
    return tenderCode;
  }

  public void setTenderCode(String tenderCode) {
    this.tenderCode = tenderCode;
  }

  public String getTenderPlanId() {
    return tenderPlanId;
  }

  public void setTenderPlanId(String tenderPlanId) {
    this.tenderPlanId = tenderPlanId;
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

  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public Integer getVtype() {
    return vtype;
  }

  public void setVtype(Integer vtype) {
    this.vtype = vtype;
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

  public LocalDateTime getEndTime() {
    return endTime;
  }

  public void setEndTime(LocalDateTime endTime) {
    this.endTime = endTime;
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
