package com.jingcheng.oss.system.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;
import java.util.Date;

/**
 * @author tongjingcheng
 * @version 1.0
 * @date 2020/9/27 11:31
 */
@TableName("sys_role")
public class SysRole extends Model<SysRole> {
    /**
     * 角色id
     */
    @TableId(type = IdType.ID_WORKER_STR)
    private String rid;

    /**
     * 角色名，用于显示
     */
    private String rname;

    /**
     * 角色描述
     */
    private String rdesc;

    /**
     * 角色值，用于权限判断
     */
    private String rval;

    /**
     * 创建时间
     */
    private Date created;

    /**
     * 修改时间
     */
    private Date updated;


    @Override
    protected Serializable pkVal() {
        return rid;
    }

    public String getRid() {
        return rid;
    }

    public void setRid(String rid) {
        this.rid = rid;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    public String getRdesc() {
        return rdesc;
    }

    public void setRdesc(String rdesc) {
        this.rdesc = rdesc;
    }

    public String getRval() {
        return rval;
    }

    public void setRval(String rval) {
        this.rval = rval;
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
