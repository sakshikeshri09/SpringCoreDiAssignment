package com.mylab1;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.mylab1")
@PropertySource("classpath:myresource.properties")
public class JavaConfig {

}
