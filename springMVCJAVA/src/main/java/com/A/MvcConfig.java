package com.A;
// this class can used for servelt for in controller class

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
@Configuration
@EnableWebMvc
@ComponentScan("com.A")// wea are created servelt by annotion
public class MvcConfig extends WebMvcConfigurerAdapter

{

}
