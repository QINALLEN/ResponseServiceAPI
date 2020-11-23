package com.bank.api.service;

import com.bank.api.form.*;
import com.bank.api.view.AccountDetail;
import com.bank.api.view.ApplyAccountBack;
import com.bank.api.view.PayStatusView;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@FeignClient(name="${com.hxyc.bank.config.name:monthly-statement}",contextId = "bankService")
public interface BankService {

    @PostMapping(value = {"/bank/service/applyAccount"})
    ApplyAccountBack applyAccount(@RequestBody ApplyAccountForm applyAccountForm);

    @GetMapping(value = {"/bank/service/accountDetails/{accountNo}"})
    List<AccountDetail> accountDetails(@PathVariable(value = "accountNo") String accountNo,
                                       @RequestParam("flag") String flag);

    @GetMapping(value = {"/bank/service/accountDetails/{accountNo}"})
    List<AccountDetail> accountDetails(@PathVariable(value = "accountNo") String accountNo,
                                       @RequestParam("flag") String flag,
                                       @RequestParam("startDate")  LocalDate startDate,
                                       @RequestParam("endDate") LocalDate endDate,
                                       @RequestParam("status") String status);

    @GetMapping(value = {"/bank/service/payStatus/{demanderId}/{planId}/{supplierId}/{type}"})
    PayStatusView payStatus(@PathVariable(value = "demanderId") String demanderId,
                            @PathVariable(value = "planId") Integer planId,
                            @PathVariable(value = "supplierId") Integer supplierId,
                            @PathVariable(value = "type") Integer type);

    @PostMapping(value = {"/bank/service/refundApply/{demanderId}/{planId}/{supplierId}/{type}/{marginStatus}"})
    Boolean refundApply(@PathVariable(value = "demanderId") String demanderId,
                        @PathVariable(value = "planId") Integer planId,
                        @PathVariable(value = "supplierId") Integer supplierId,
                        @PathVariable(value = "type") Integer type,
                        @PathVariable(value = "marginStatus") Integer marginStatus);

    @PostMapping(value = {"/bank/service/refundApply/{demanderId}/{planId}/{supplierId}/{type}/{marginStatus}"})
    Boolean refundApply(@PathVariable(value = "demanderId") String demanderId,
                        @PathVariable(value = "planId") Integer planId,
                        @PathVariable(value = "supplierId") Integer supplierId,
                        @PathVariable(value = "type") Integer type,
                        @PathVariable(value = "marginStatus") Integer marginStatus,
                        @RequestParam(value = "amount")BigDecimal amount);

    @PostMapping(value = {"/bank/service/refundApply/{demanderId}/{planId}/{supplierId}/{type}/{marginStatus}"})
    Boolean refundApply(@PathVariable(value = "demanderId") String demanderId,
                        @PathVariable(value = "planId") Integer planId,
                        @PathVariable(value = "supplierId") Integer supplierId,
                        @PathVariable(value = "type") Integer type,
                        @PathVariable(value = "marginStatus") Integer marginStatus,
                        @RequestParam(value = "amount")BigDecimal amount,
                        @RequestParam(value = "isAll")Integer isAll);

    @PostMapping(value = {"/bank/service/transferAccount/{demanderId}/{planId}/{supplierId}/{type}"})
    Boolean transferAccount(@PathVariable(value = "demanderId") String demanderId,
                            @PathVariable(value = "planId") Integer planId,
                            @PathVariable(value = "supplierId") Integer supplierId,
                            @PathVariable(value = "type") Integer type);

    @PostMapping(value = {"/bank/service/manual"})
    Boolean manualBankAccount(@RequestBody BankAccountRequest bankAccountRequest);

    @PostMapping(value = {"/bank/service/service/charge"})
    Boolean putServiceCharge(@RequestBody BackServiceFeeForm backServiceFee);

    default Boolean sendMQStatus(Description description){
        return this.sendMQStatus(description.getAccountNo(),description.getMarginStatus(),description.getReceiptStatus(),description.getTransferDate());
    }

    @PostMapping(value = {"/bank/service/status/{accountNo}"})
    Boolean sendMQStatus( @PathVariable(value = "accountNo") String accountNo,
                                @RequestParam(value = "marginStatus") String marginStatus,
                                @RequestParam(value = "receiptStatus") String receiptStatus,
                                @RequestParam(value = "transferDate") LocalDateTime transferDate);


    @PostMapping(value = {"/bank/service/changeStatus/{accountNo}"})
    Boolean changeStatus( @PathVariable(value = "accountNo") String accountNo,@RequestParam(value = "marginStatus") Integer marginStatus);

    @PostMapping(value = {"/bank/service/push/annualFee"})
    Boolean pushAnnualFee(@RequestBody PushAnnualFeeForm form);

    @GetMapping("/annual/fee/supplier/{smCompanyId}/type/{type}/isAnnaulFee")
    Boolean isAnnualFee(@PathVariable("smCompanyId") Integer smCompanyId,
                        @PathVariable("type") Integer type,
                        @RequestParam(value = "date") LocalDate date,
                        @RequestParam(value = "demandId") String demandId);
    

}
