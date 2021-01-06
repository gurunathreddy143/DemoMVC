package com.spring.mvc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan({"com.spring.mvc"})
@EnableWebMvc
public class AppConfiguration extends WebMvcConfigurerAdapter{
	
	@Bean
	public InternalResourceViewResolver viewResolver() {
		
		InternalResourceViewResolver view= new InternalResourceViewResolver();
		view.setPrefix("/WEB-INF/jsp/");
		view.setSuffix(".jsp");
		
		return view;
		
	}
	
	

}
