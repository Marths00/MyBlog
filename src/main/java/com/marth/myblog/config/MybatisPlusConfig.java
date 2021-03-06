package com.marth.myblog.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;
//分页插件
@Configuration
@EnableTransactionManagement
@MapperScan("com.markerhub.mapper")

public class MybatisPlusConfig {

    @Bean

    public PaginationInterceptor paginationInterceptor() {

        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();

        return paginationInterceptor;

    }

}
