package com.A;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller// to use anntion need to add webmvc depdency in pom files
public class Addcontrollers {
	
	@RequestMapping("/add")
public ModelAndView add(@RequestParam("t1") int num1, @RequestParam("t2") int num2)
{
	ModelAndView mv=new ModelAndView();// we can return both result and view
	
	
	
	int k=num1+num2;
	mv.addObject("result",k);// this will make return both by using ModelView oJECR
	mv.setViewName("result.jsp");
	
	return mv;
}
}
