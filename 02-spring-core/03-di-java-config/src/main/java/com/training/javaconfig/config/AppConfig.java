package com.training.javaconfig.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(value = "com.training.javaconfig")
//@ImportResource(locations = "classpath:spring-config.xml")
public class AppConfig {


}
