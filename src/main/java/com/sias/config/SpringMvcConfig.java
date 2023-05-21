package com.sias.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@ContextConfiguration
@ComponentScan("com.sias.controller")
@EnableWebMvc
public class SpringMvcConfig {
}
