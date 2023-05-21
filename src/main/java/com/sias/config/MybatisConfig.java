package com.sias.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

public class MybatisConfig {

    @Bean
    public SqlSessionFactoryBean sqlSessionFactory(DataSource dataSource){
        SqlSessionFactoryBean FactoryBean =new SqlSessionFactoryBean();
        FactoryBean.setDataSource(dataSource);
        FactoryBean.setTypeAliasesPackage("com.sias.pojo");
        return FactoryBean;
    }

    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer(){
        MapperScannerConfigurer ma =new MapperScannerConfigurer();
        ma.setBasePackage("com.sias.dao");
        return ma;
    }

}
