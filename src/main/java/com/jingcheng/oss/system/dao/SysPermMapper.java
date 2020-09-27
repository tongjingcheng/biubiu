package com.jingcheng.oss.system.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.jingcheng.oss.system.entity.SysPerm;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author tongjingcheng
 * @version 1.0
 * @date 2020/9/27 12:21
 */
@Mapper
public interface SysPermMapper extends BaseMapper<SysPerm> {

    List<SysPerm> getPermsByUserId(@Param("userId") String userId);

    List<SysPerm> getPermsByRoleId(@Param("roleId") String roleId);

    void saveOrUpdate(@Param("perms") List<SysPerm> perms);

}
