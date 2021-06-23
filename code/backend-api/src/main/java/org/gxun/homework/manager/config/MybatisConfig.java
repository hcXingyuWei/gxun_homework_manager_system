package org.gxun.homework.manager.config;

import org.gxun.homework.manager.aspect.mybatis.QueryInterceptor;
import org.gxun.homework.manager.aspect.mybatis.UpdateInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("org.gxun.homework.manager.**.mapper")
public class MybatisConfig {

    @Bean
    public QueryInterceptor queryInterceptor() {
        return new QueryInterceptor();
    }

    @Bean
    public UpdateInterceptor updateInterceptor() {
        return new UpdateInterceptor();
    }


}