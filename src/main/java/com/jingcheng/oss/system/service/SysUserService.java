package com.jingcheng.oss.system.service;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.IService;
import com.jingcheng.oss.system.entity.SysUser;

/**
 * @author tongjingcheng
 * @version 1.0
 * @date 2020/9/27 12:27
 */

public interface SysUserService extends IService<SysUser> {
    Page<SysUser> queryUserIncludeRoles(Page page, String nick);
}
