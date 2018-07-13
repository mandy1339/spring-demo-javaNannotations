package com.main;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

// SCANCONFIG WILL USE FISHKEEPING COACH

@Configuration
@PropertySource("classpath:./com/fortuneservices/fortune.properties")
@ComponentScan("com")
public class ScanJavaConfig {
	

}
