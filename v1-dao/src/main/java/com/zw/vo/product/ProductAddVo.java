package com.zw.vo.product;

import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * @author：zhaowei
 * @Date：2018/12/19
 * @Time：下午2:03
 */
public class ProductAddVo {
    private Long id;

    private String name;

    private Long doorId;

    private String processIds;

    private String img;

    private String mark;

    private Date startTime;

    private Date endTime;

    private Long corporationId;

    private Integer coverWidth;

    private Integer coverHeight;

    private Integer coverDepth;

    private Integer width;

    private Integer height;

    private Integer lbWidth;

    private Integer lbHeight;

    private Integer dbWidth;

    private Integer dbHeight;

    private Long colorId;

    private Long lineId;

    private Integer lineSum;

    private String productcol;

    private Integer type;

    private Long moduleId;

    private Integer state;

    private Integer lbSum;

    private Integer dbSum;

    private Integer sum;

    private Integer lineLength;

    private Long ticketId;

    private Short indexKey;

    private Short flag;

    private String coverSize;

    private String doorSize;

    private String lbSize;

    private String dbSize;

    private String door;

    private String color;

    private String material;

    private Long materialId;

    private String remarks;

    private String line;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getDoorId() {
        return doorId;
    }

    public void setDoorId(Long doorId) {
        this.doorId = doorId;
    }

    public String getProcessIds() {
        return processIds;
    }

    public void setProcessIds(String processIds) {
        this.processIds = processIds;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
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

    public Long getCorporationId() {
        return corporationId;
    }

    public void setCorporationId(Long corporationId) {
        this.corporationId = corporationId;
    }

    public Integer getCoverWidth() {
        return coverWidth;
    }

    public void setCoverWidth(Integer coverWidth) {
        this.coverWidth = coverWidth;
    }

    public Integer getCoverHeight() {
        return coverHeight;
    }

    public void setCoverHeight(Integer coverHeight) {
        this.coverHeight = coverHeight;
    }

    public Integer getCoverDepth() {
        return coverDepth;
    }

    public void setCoverDepth(Integer coverDepth) {
        this.coverDepth = coverDepth;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getLbWidth() {
        return lbWidth;
    }

    public void setLbWidth(Integer lbWidth) {
        this.lbWidth = lbWidth;
    }

    public Integer getLbHeight() {
        return lbHeight;
    }

    public void setLbHeight(Integer lbHeight) {
        this.lbHeight = lbHeight;
    }

    public Integer getDbWidth() {
        return dbWidth;
    }

    public void setDbWidth(Integer dbWidth) {
        this.dbWidth = dbWidth;
    }

    public Integer getDbHeight() {
        return dbHeight;
    }

    public void setDbHeight(Integer dbHeight) {
        this.dbHeight = dbHeight;
    }

    public Long getColorId() {
        return colorId;
    }

    public void setColorId(Long colorId) {
        this.colorId = colorId;
    }

    public Long getLineId() {
        return lineId;
    }

    public void setLineId(Long lineId) {
        this.lineId = lineId;
    }

    public Integer getLineSum() {
        return lineSum;
    }

    public void setLineSum(Integer lineSum) {
        this.lineSum = lineSum;
    }

    public String getProductcol() {
        return productcol;
    }

    public void setProductcol(String productcol) {
        this.productcol = productcol;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Long getModuleId() {
        return moduleId;
    }

    public void setModuleId(Long moduleId) {
        this.moduleId = moduleId;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getLbSum() {
        return lbSum;
    }

    public void setLbSum(Integer lbSum) {
        this.lbSum = lbSum;
    }

    public Integer getDbSum() {
        return dbSum;
    }

    public void setDbSum(Integer dbSum) {
        this.dbSum = dbSum;
    }

    public Integer getSum() {
        return sum;
    }

    public void setSum(Integer sum) {
        this.sum = sum;
    }

    public Integer getLineLength() {
        return lineLength;
    }

    public void setLineLength(Integer lineLength) {
        this.lineLength = lineLength;
    }

    public Long getTicketId() {
        return ticketId;
    }

    public void setTicketId(Long ticketId) {
        this.ticketId = ticketId;
    }

    public Short getIndexKey() {
        return indexKey;
    }

    public void setIndexKey(Short indexKey) {
        this.indexKey = indexKey;
    }

    public Short getFlag() {
        return flag;
    }

    public void setFlag(Short flag) {
        this.flag = flag;
    }

    public String getCoverSize() {
        return coverSize;
    }

    public void setCoverSize(String coverSize) {
        this.coverSize = coverSize;
    }

    public String getDoorSize() {
        return doorSize;
    }

    public void setDoorSize(String doorSize) {
        this.doorSize = doorSize;
    }

    public String getLbSize() {
        return lbSize;
    }

    public void setLbSize(String lbSize) {
        this.lbSize = lbSize;
    }

    public String getDbSize() {
        return dbSize;
    }

    public void setDbSize(String dbSize) {
        this.dbSize = dbSize;
    }

    public String getDoor() {
        return door;
    }

    public void setDoor(String door) {
        this.door = door;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Long getMaterialId() {
        return materialId;
    }

    public void setMaterialId(Long materialId) {
        this.materialId = materialId;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }
}
