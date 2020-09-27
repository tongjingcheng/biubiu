package com.jingcheng.oss.system.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.jingcheng.oss.system.entity.SysUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author tongjingcheng
 * @version 1.0
 * @date 2020/9/27 12:23
 */
@Mapper
public interface SysUserMapper extends BaseMapper<SysUser> {

    List<SysUser> selectUserIncludeRoles(Pagination page, @Param("nick")String nick);
}
