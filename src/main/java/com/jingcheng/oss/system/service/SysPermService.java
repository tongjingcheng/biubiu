package com.jingcheng.oss.system.service;

import com.baomidou.mybatisplus.service.IService;
import com.jingcheng.oss.system.entity.SysPerm;
import com.jingcheng.oss.system.vo.AuthVo;

import java.util.List;
import java.util.Set;

/**
 * @author tongjingcheng
 * @version 1.0
 * @date 2020/9/27 12:25
 */
public interface SysPermService extends IService<SysPerm> {
    Set<AuthVo> getPermsByUserId(String userId);

    List<SysPerm> getPermsByRoleId(String roleId);

    void saveOrUpdate(List<SysPerm> perms);
}
