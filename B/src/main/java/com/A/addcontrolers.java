package com.A;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.A.service.Addservice;


@Controller
public class addcontrolers {
	
	
//		@RequestMapping("/add")
//		public void ad() {
//			System.out.println("hi aim here");
//		}
		@RequestMapping("/add")
// below we us anntion paraam so we can use parameter inside method 
		public ModelAndView add( @RequestParam("t1")int i,@RequestParam("t2") int j ,HttpServletRequest request,HttpServletResponse response)
		 {// here instead of void we need to give string 
			 //int i=Integer .parseInt(request.getParameter("t1")); why means we usingAnnotionparam in itself method
			 //int j=Integer .parseInt(request.getParameter("t2"));why means we usingAnnotionparam in itself method
			// int k=i+j;
			 // we need create calcalution diffrent class becuse in controllers we cant give logics 
			 Addservice as =new Addservice(); // this is for serive class where logic is there
			 int k=as.add(i, j);
			 
			 
			 
			 
			 
			 // now we are created 2 varibles we added in k  but we need send this data to jsp
			// through ModelAndView object
			 ModelAndView mv=new ModelAndView();
			 mv.setViewName("display");// need to not mention extension becuse future need
			 mv.addObject("result",k);
			 
		return mv;
	}
	}






