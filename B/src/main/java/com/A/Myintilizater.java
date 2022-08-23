package com.A;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class Myintilizater extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		//return null; 
		return new Class[] {Aconfig.class};// here why measn we replacing web.xml file by annotion type
		// we are configring but we are mention class name is which we replaced by servelt file
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return new String[] {"/"};// its need to retrun fil
	}

}
// this class replace for web.xml  to use annotion baseed 