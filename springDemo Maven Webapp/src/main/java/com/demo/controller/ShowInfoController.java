package com.demo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;  
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.demo.bean.Info;
import com.demo.service.ShowInfoService;

@Controller
public class ShowInfoController {
	
	@Autowired
	private ShowInfoService showInfoService;
	
	
	@RequestMapping(value = "/showinfo")
	public ModelAndView showInfo(String name, String address, HttpServletRequest request){
		
		request.setAttribute("name", name);
		request.setAttribute("address", address);
		
		List<String> msg = showInfoService.show(name, address);
		
		request.setAttribute("message", msg);
		
	
		
		return new ModelAndView("welcome");
	}
	
}
