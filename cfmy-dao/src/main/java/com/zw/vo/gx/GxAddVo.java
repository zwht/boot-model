package com.zw.vo.gx;

import io.swagger.annotations.ApiModelProperty;

/**
 * @author：zhaowei
 * @Date：2018/12/19
 * @Time：下午2:03
 */
public class GxAddVo {
    @ApiModelProperty("工序名")
    private String name;

    @ApiModelProperty("默认价格")
    private Float price;

    @ApiModelProperty("公司id")
    private Long corporationId;


    public Long getCorporationId() {
        return corporationId;
    }

    public void setCorporationId(Long corporationId) {
        this.corporationId = corporationId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
}
