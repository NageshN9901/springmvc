package com.A;
// this class for altrnatibes for web.xml
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class Myfrontcontroller extends AbstractAnnotationConfigDispatcherServletInitializer 
{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return new Class[]{MvcConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {// this is altrnntaive for instead of creating servelt file
		// for this need class to pass
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String[] getServletMappings() {// this for mappin
		// TODO Auto-generated method stub
		return new String[] {"/"}; // we are saying mapped to any typoe file
	}

}
