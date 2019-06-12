package com.zw.vo.ticket;

import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
import java.util.List;

/**
 * @author：zhaowei
 * @Date：2018/12/19
 * @Time：下午2:00
 */
public class TicketSearchVo {

    @ApiModelProperty("工单编号")
    public String number;

    @ApiModelProperty("公司id")
    private Long corporationId;

    @ApiModelProperty("经销商")
    private Long dealersId;

    @ApiModelProperty("销售")
    private Long marketId;

    @ApiModelProperty("制单人")
    private Long editId;

    @ApiModelProperty("开始时间")
    private Date startTime;

    @ApiModelProperty("结束时间")
    private Date endTime;

    @ApiModelProperty("状态")
    private List<Short> state;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Long getCorporationId() {
        return corporationId;
    }

    public void setCorporationId(Long corporationId) {
        this.corporationId = corporationId;
    }

    public Long getDealersId() {
        return dealersId;
    }

    public void setDealersId(Long dealersId) {
        this.dealersId = dealersId;
    }

    public Long getMarketId() {
        return marketId;
    }

    public void setMarketId(Long marketId) {
        this.marketId = marketId;
    }

    public Long getEditId() {
        return editId;
    }

    public void setEditId(Long editId) {
        this.editId = editId;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public List<Short> getState() {
        return state;
    }

    public void setState(List<Short> state) {
        this.state = state;
    }
}
