package com.bank.api.view;

import java.util.List;

public class Page<AccountPageDetail> {

  private List<com.bank.api.view.AccountPageDetail> views;
  /**
   * 同条目数
   */
  private Integer totalElements;

  /**
   * 总页数
   */
  private Integer totalPages;

  /**
   * 页码
   */
  private Integer page;

  /**
   * 分页数
   */
  private Integer pageSize;

  public List<com.bank.api.view.AccountPageDetail> getViews() {
    return views;
  }

  public void setViews(List<com.bank.api.view.AccountPageDetail> views) {
    this.views = views;
  }

  public Integer getTotalElements() {
    return totalElements;
  }

  public void setTotalElements(Integer totalElements) {
    this.totalElements = totalElements;
  }

  public Integer getTotalPages() {
    return totalPages;
  }

  public void setTotalPages(Integer totalPages) {
    this.totalPages = totalPages;
  }

  public Integer getPage() {
    return page;
  }

  public void setPage(Integer page) {
    this.page = page;
  }

  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }
}
