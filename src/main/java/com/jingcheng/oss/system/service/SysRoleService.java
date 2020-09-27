package com.jingcheng.oss.system.service;

import com.baomidou.mybatisplus.service.IService;
import com.jingcheng.oss.system.entity.SysRole;
import com.jingcheng.oss.system.vo.AuthVo;

import java.util.List;
import java.util.Set;

/**
 * @author tongjingcheng
 * @version 1.0
 * @date 2020/9/27 12:26
 */
public interface SysRoleService extends IService<SysRole> {
    Set<AuthVo> getRolesByUserId(String userId);

    List<String> getRoleIdsByUserId(String userId);

    boolean checkRidsContainRval(List<String> rids, String rval);

    boolean checkUidContainRval(String uid, String rval);
}
