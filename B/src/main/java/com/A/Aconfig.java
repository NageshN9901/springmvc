package com.A;
import org.springframework.context.annotation.Bean;
// we are gining file extension and path
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceView;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan({"com.A"})
public class Aconfig {
	// we are nned to mention the file extension for dispaly jsp
	@Bean
	public InternalResourceViewResolver viewfindreservler() {
		
		InternalResourceViewResolver vr=new InternalResourceViewResolver();
		// to setpath where the file is 
		vr.setPrefix("/WEB-INF/");// inside this folder
		// for extensin
		vr.setSuffix(".jsp");// future when we can change page extension if we need
		return vr;
	}
}
// this class replaced for dispaterservelt