package com.zw.vo.code;

import com.zw.dao.entity.Code;

/**
 * @author：zhaowei
 * @Date：2018/12/21
 * @Time：下午6:00
 */
public class CodeResponseVo extends Code {

    private String groupName;
    private Short groupValue;

    public Short getGroupValue() {
        return groupValue;
    }

    public void setGroupValue(Short groupValue) {
        this.groupValue = groupValue;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
}