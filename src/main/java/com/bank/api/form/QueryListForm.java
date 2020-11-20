package com.bank.api.form;

import java.util.List;

/**
 * @author QDC
 * 查询参数
 */
public class QueryListForm {

    /**
     * 需方id
     */
    private String demanderId;

    /**
     * 招标计划ID
     */
    private List<String> planIds;

    /**
     * 账户类型 1 标书费 2 投标保证金 3 履约保证金
     */
    private Integer type;

    /**
     * 页码
     */
    private Integer page;

    /**
     * 每页条数
     */
    private Integer pageSize;
}
