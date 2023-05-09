package com.webapplication;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class homecontroller {
	@RequestMapping("home")
	public ModelAndView home(Aliean aliean) {
		
		ModelAndView mv=new ModelAndView();
		mv.addObject("obj", aliean);
		mv.setViewName("home");
		
		return mv;
	}

}
