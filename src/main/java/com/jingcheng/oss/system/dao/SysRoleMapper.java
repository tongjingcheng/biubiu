package com.jingcheng.oss.system.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.jingcheng.oss.system.entity.SysRole;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author tongjingcheng
 * @version 1.0
 * @date 2020/9/27 12:22
 */
@Mapper
public interface SysRoleMapper extends BaseMapper<SysRole> {
    List<SysRole> getRolesByUserId(@Param("userId") String userId);

    List<String> getRoleIdsByUserId(@Param("userId") String userId);

    Boolean checkRidsContainRval(@Param("rids")List<String> rids,@Param("rval")String rval);

    Boolean checkUidContainRval(@Param("uid")String uid,@Param("rval")String rval);

}
