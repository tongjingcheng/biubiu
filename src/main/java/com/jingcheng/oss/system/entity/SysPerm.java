package com.jingcheng.oss.system.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author tongjingcheng
 * @version 1.0
 * @date 2020/9/27 12:09
 */
@TableName("sys_perm")
public class SysPerm extends Model<SysPerm> {

    /**
     * 权限值，shiro的权限控制表达式
     */
    @TableId(type = IdType.INPUT)
    private String pval;

    /**
     * 父节点权限值
     */
    private String parent;

    /**
     * 权限名称
     */
    private String pname;

    /**
     * 权限类型：1.菜单；2.按钮
     */
    private Integer ptype;

    /**
     * 是否叶子节点
     */
    private Boolean leaf;

    /**
     * 创建时间
     */
    private Date created;

    /**
     * 修改时间
     */
    private Date updated;

    @TableField(exist = false)
    private List<SysPerm> children = new ArrayList<>();

    @Override
    protected Serializable pkVal() {
        return pval;
    }

    public List<SysPerm> getChildren() {
        return children;
    }

    public void setChildren(List<SysPerm> children) {
        this.children = children;
    }

    public String getPval() {
        return pval;
    }

    public void setPval(String pval) {
        this.pval = pval;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Integer getPtype() {
        return ptype;
    }

    public void setPtype(Integer ptype) {
        this.ptype = ptype;
    }

    public Boolean getLeaf() {
        return leaf;
    }

    public void setLeaf(Boolean leaf) {
        this.leaf = leaf;
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
}
