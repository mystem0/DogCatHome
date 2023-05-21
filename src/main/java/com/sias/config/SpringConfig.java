package com.sias.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration
@ComponentScan("com.sias.service")
@PropertySource("classpath:db.properties")
@Import({JdbcConfig.class,MybatisConfig.class})
public class SpringConfig {

}
