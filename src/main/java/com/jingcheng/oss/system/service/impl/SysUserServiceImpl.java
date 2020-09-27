package com.jingcheng.oss.system.service.impl;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.jingcheng.oss.system.dao.SysUserMapper;
import com.jingcheng.oss.system.entity.SysUser;
import com.jingcheng.oss.system.service.SysUserService;
import org.springframework.stereotype.Service;
/**
 * @author tongjingcheng
 * @version 1.0
 * @date 2020/9/27 12:25
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {

    @Override
    public Page<SysUser> queryUserIncludeRoles(Page page, String nick) {
        return page.setRecords(baseMapper.selectUserIncludeRoles(page,nick));
    }

}
