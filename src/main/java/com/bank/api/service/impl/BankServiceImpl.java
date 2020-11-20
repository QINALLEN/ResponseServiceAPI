package com.bank.api.service.impl;

import com.bank.api.form.*;
import com.bank.api.service.BankService;
import com.bank.api.view.*;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;


public class BankServiceImpl implements BankService {

    private RestTemplate template;
    private String URL;
    private String Url;

    public BankServiceImpl(String URL, RestTemplate template) {
        this.URL = URL+"/bank/service";
        this.template = template;
        this.Url=URL;
    }

    @Override
    public ApplyAccountBack applyAccount(ApplyAccountForm applyAccountForm) {
        String url=URL+"/applyAccount";
        try {
            ResponseEntity<ApplyAccountBack> back = this.template.postForEntity(url, applyAccountForm, ApplyAccountBack.class);
            if (back.getStatusCode().value()==200){
                return back.getBody();
            }
            return null;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Page<AccountPageDetail> accountPage(QueryListForm queryListForm) {
        throw new RuntimeException("未实现");
    }

    @Override
    public List<AccountDetail> accountDetails(String accountNo, String flag) {
        return this.accountDetails(accountNo,flag,null,null,null);
    }

    @Override
    public List<AccountDetail> accountDetails(String accountNo, String flag, LocalDate startDate, LocalDate endDate,String status) {
        String url=URL+"/accountDetails/"+accountNo+"?flag="+flag;
        if (startDate!=null&&endDate!=null){
            url=url+"&startDate="+startDate+"&endDate="+endDate;
        }
        if (status!=null){
            url=url+"&status="+status;
        }
        try {
            ResponseEntity<AccountDetail[]> forEntity = this.template.getForEntity(url, AccountDetail[].class);
            if (forEntity.getStatusCode().value()==200){
                return Arrays.asList(Objects.requireNonNull(forEntity.getBody()));
            }
            return Collections.emptyList();
        }catch (Exception e){
            e.printStackTrace();
        }
        return Collections.emptyList();
    }

    @Override
    public PayStatusView payStatus(String demanderId, Integer planId, Integer supplierId, Integer type) {
        String url=URL+"/payStatus/"+demanderId+"/"+planId+"/"+supplierId+"/"+type;
        PayStatusView payStatusView = new PayStatusView();
        payStatusView.setSuccess(false);
        try {
            ResponseEntity<PayStatusView> forEntity = this.template.getForEntity(url, PayStatusView.class);
            if (forEntity.getStatusCode().value()==200){
                return forEntity.getBody();
            }
            return payStatusView;
        }catch (Exception e){
            e.printStackTrace();
        }
        return payStatusView;
    }

    @Override
    public Boolean refundApply(String demanderId, Integer planId, Integer supplierId, Integer type, String marginStatus) {
        return this.refundApply(demanderId,planId,supplierId,type,marginStatus,null);
    }

    @Override
    public Boolean refundApply(String demanderId, Integer planId, Integer supplierId, Integer type, String marginStatus, BigDecimal amount) {
        String url=URL+"/refundApply/"+demanderId+"/"+planId+"/"+supplierId+"/"+type+"/"+marginStatus;
        if (amount!=null){
            url=url+"?amount="+amount.toString()+"&isAll=0";
        }
        try {
            ResponseEntity<Boolean> forEntity = this.template.postForEntity(url, HttpEntity.EMPTY, Boolean.class);
            if (forEntity.getStatusCode().value()==200){
                return forEntity.getBody();
            }
            return false;
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Boolean transferAccount(String demanderId, Integer planId, Integer supplierId, Integer type) {
        String url=URL+"/transferAccount/"+demanderId+"/"+planId+"/"+supplierId+"/"+type;
        try {
            ResponseEntity<Boolean> forEntity = this.template.postForEntity(url, HttpEntity.EMPTY, Boolean.class);
            if (forEntity.getStatusCode().value()==200){
                return forEntity.getBody();
            }
            return false;
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Boolean manualBankAccount(BankAccountRequest bankAccountRequest) {
        String url=URL+"/manual";
        try {
            ResponseEntity<Boolean> forEntity = this.template.postForEntity(url, bankAccountRequest, Boolean.class);
            if (forEntity.getStatusCode().value()==200){
                return forEntity.getBody();
            }
            return false;
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Boolean putServiceCharge(BackServiceFeeForm backServiceFeeForm) {
        String url=URL+"/service/charge";
        try {
            ResponseEntity<Boolean> forEntity = this.template.postForEntity(url, backServiceFeeForm, Boolean.class);
            if (forEntity.getStatusCode().value()==200){
                return forEntity.getBody();
            }
            return null;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Boolean sendMQStatus(Description description) {
        String url=URL+"/status/"+description.getAccountNo()+"?marginStatus="+description.getMarginStatus()+"&receiptStatus="+description.getReceiptStatus()+"&transferDate="+description.getTransferDate().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        try {
            ResponseEntity<Boolean> exchange = this.template.exchange(url, HttpMethod.POST, HttpEntity.EMPTY, Boolean.class);
            return exchange.getBody();
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Boolean changeStatus(String accountNo,Integer marginStatus) {
        String url=URL+"/changeStatus/"+accountNo+"?marginStatus="+marginStatus;
        try {
            ResponseEntity<Boolean> exchange = this.template.exchange(url, HttpMethod.POST, HttpEntity.EMPTY, Boolean.class);
            return exchange.getBody();
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Boolean isAnnualFee(Integer smCompanyId, Integer type, LocalDate date,String demandId) {
        String url=Url+"/annual/fee/supplier/"+smCompanyId+"/type/"+type+"/isAnnaulFee?date="+date+"&demandId="+demandId;
        try {
            ResponseEntity<Boolean> exchange = this.template.getForEntity(url,Boolean.class);
            return exchange.getBody();
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Boolean pushAnnualFee(PushAnnualFeeForm form) {
        String url=URL+"/push/annualFee";
        try {
            ResponseEntity<Boolean> back = this.template.postForEntity(url, form, Boolean.class);
            if (back.getStatusCode().value()==200){
                return back.getBody();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
}
