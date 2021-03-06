package com.jingcheng.oss.system.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.jingcheng.oss.system.vo.AuthVo;

import java.io.Serializable;
import java.util.*;

/**
 * @author tongjingcheng
 * @version 1.0
 * @date 2020/9/27 11:29
 */
@TableName("sys_user")
public class SysUser extends Model<SysUser> {

    /**
     * 用户id
     */
    @TableId(type = IdType.ID_WORKER_STR)
    private String uid;

    /**
     *  登录名，不可改
     */
    private String uname;

    /**
     * 用户昵称，可改
     */
    private String nick;

    /**
     * 已加密的登录密码
     */
    private String pwd;

    /**
     * 加密盐值
     */
    private String salt;

    /**
     * 是否锁定
     */
    private Boolean lock;

    /**
     * 创建时间
     */
    private Date created;

    /**
     * 修改时间
     */
    private Date updated;

    /**
     * 用户所有角色值，在管理后台显示用户的角色
     */
    @TableField(exist = false)
    private List<SysRole> roleList = new ArrayList<>();

    /**
     * 用户所有角色值，用于shiro做角色权限的判断
     */
    @TableField(exist = false)
    private Set<AuthVo> roles = new HashSet<>();

    /**
     * 用户所有权限值，用于shiro做资源权限的判断
     */
    @TableField(exist = false)
    private Set<AuthVo> perms = new HashSet<>();

    @Override
    protected Serializable pkVal() {
        return uid;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public Boolean getLock() {
        return lock;
    }

    public void setLock(Boolean lock) {
        this.lock = lock;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public List<SysRole> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<SysRole> roleList) {
        this.roleList = roleList;
    }

    public Set<AuthVo> getRoles() {
        return roles;
    }

    public void setRoles(Set<AuthVo> roles) {
        this.roles = roles;
    }

    public Set<AuthVo> getPerms() {
        return perms;
    }

    public void setPerms(Set<AuthVo> perms) {
        this.perms = perms;
    }
}
