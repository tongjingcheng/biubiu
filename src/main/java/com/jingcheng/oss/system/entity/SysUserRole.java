package com.jingcheng.oss.system.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;

/**
 * @author tongjingcheng
 * @version 1.0
 * @date 2020/9/27 12:19
 */
@TableName("sys_user_role")
public class SysUserRole implements Serializable {

    @TableField("user_id")
    private String userId;

    @TableField("role_id")
    private String roleId;

    public SysUserRole() {
    }

    public SysUserRole(String userId, String roleId) {
        this.userId = userId;
        this.roleId = roleId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }
}
