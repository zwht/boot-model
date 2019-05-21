package com.zw.vo.user;

import com.zw.dao.entity.Corporation;
import com.zw.vo.code.CodeResponseVo;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * @author：zhaowei
 * @Date：2018/12/22
 * @Time：下午2:14
 */
public class UserResponseVo{
    @ApiModelProperty("用户名")
    private Long id;

    @ApiModelProperty("用户名")
    private String name;

    @ApiModelProperty("登录名")
    private String loginName;

    @ApiModelProperty("能力，权限")
    private String ability;

    @ApiModelProperty("角色")
    private Integer state;

    @ApiModelProperty("角色")
    private String roles;

    @ApiModelProperty("角色对象数组")
    private List<CodeResponseVo> rolesVo;

    @ApiModelProperty("公司Id")
    private String corporationId;

    @ApiModelProperty("公司")
    private Corporation corporationVo;

    @ApiModelProperty("手机号")
    private String phone;

    @ApiModelProperty("头像")
    private String avatar;

    @ApiModelProperty("地址")
    private String address;

    @ApiModelProperty("地址Id")
    private String addressId;

    @ApiModelProperty("工序ids")
    private String gxIds;

    public String getGxIds() {
        return gxIds;
    }

    public void setGxIds(String gxIds) {
        this.gxIds = gxIds;
    }

    public Corporation getCorporationVo() {
        return corporationVo;
    }

    public void setCorporationVo(Corporation corporationVo) {
        this.corporationVo = corporationVo;
    }

    public List<CodeResponseVo> getRolesVo() {
        return rolesVo;
    }

    public void setRolesVo(List<CodeResponseVo> rolesVo) {
        this.rolesVo = rolesVo;
    }

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

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public String getCorporationId() {
        return corporationId;
    }

    public void setCorporationId(String corporationId) {
        this.corporationId = corporationId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddressId() {
        return addressId;
    }

    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }
}
