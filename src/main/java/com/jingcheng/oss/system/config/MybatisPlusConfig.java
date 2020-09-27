package com.jingcheng.oss.system.config;

import com.baomidou.mybatisplus.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author tongjingcheng
 * @version 1.0
 * @date 2020/9/27 11:23
 */
@Configuration
@MapperScan("com.jingcheng.oss.system.dao")
public class MybatisPlusConfig {

    /**
     * 分页插件，自动识别数据库类型
     * @return
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }
}
