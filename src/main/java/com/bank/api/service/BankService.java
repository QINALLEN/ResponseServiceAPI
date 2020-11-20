package com.bank.api.service;

import com.bank.api.form.*;
import com.bank.api.view.*;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

/**
 * @author QDC
 * 银行服务接口
 */
public interface BankService {

    /**
     * 申请虚账号
     * @param applyAccountForm
     * @return
     */
    ApplyAccountBack applyAccount(ApplyAccountForm applyAccountForm);


    /**
     * 查询虚账号列表
     * @param queryListForm
     * @return
     */
    Page<AccountPageDetail> accountPage(QueryListForm queryListForm);


    /**
     * 查询虚账号详情
     * @param accountNo
     * @param flag
     * @return
     */
    List<AccountDetail> accountDetails(String accountNo, String flag);


    /**
     * 查询虚账号详情
     * @param accountNo
     * @param flag
     * @param startDate
     * @param endDate
     * @return
     */
    List<AccountDetail> accountDetails(String accountNo,String flag,LocalDate startDate,LocalDate endDate,String status);


    /**
     * 查询虚账号缴费状态
     * @param demanderId
     * @param planId
     * @param supplierId
     * @param type 0:不需交费  1:未交费  2:已交费  3:未缴清
     * @return
     */
    PayStatusView payStatus(String demanderId, Integer planId, Integer supplierId, Integer type);


    /**
     * 申请退款
     * @param demanderId
     * @param planId
     * @param supplierId
     * @param type
     * @param marginStatus
     * @return
     */
    Boolean refundApply(String demanderId,Integer planId,Integer supplierId,Integer type,String marginStatus);


    /**
     * 申请退款
     * @param demanderId
     * @param planId
     * @param supplierId
     * @param type
     * @param marginStatus
     * @param amount
     * @return
     */
    Boolean refundApply(String demanderId,Integer planId,Integer supplierId,Integer type,String marginStatus, BigDecimal amount);


    /**
     * 内部转账申请
     * @param demanderId
     * @param planId
     * @param supplierId
     * @param type
     * @return
     */
    Boolean transferAccount(String demanderId,Integer planId,Integer supplierId,Integer type);


    /**
     * 手动标记
     * @param bankAccountRequest
     * @return
     */
    Boolean manualBankAccount(BankAccountRequest bankAccountRequest);


    /**
     * 推送服务费
     * @param backServiceFeeForm
     * @return
     */
    Boolean putServiceCharge( BackServiceFeeForm backServiceFeeForm);


    /**
     * 更新中标状态
     * @param description
     * @return
     */
    Boolean sendMQStatus(Description description);


    /**
     * 修改中标状态
     * @param accountNo
     * @param marginStatus
     * @return
     */
    Boolean changeStatus(String accountNo,Integer marginStatus);


    /**
     * 查询是否缴年费
     * @param smCompanyId
     * @param type
     * @param date
     * @return
     */
    Boolean isAnnualFee(Integer smCompanyId,Integer type,LocalDate date,String demandId);


    /**
     * 推送年费信息
     * @param form
     * @return
     */
    Boolean pushAnnualFee(PushAnnualFeeForm form);
}
