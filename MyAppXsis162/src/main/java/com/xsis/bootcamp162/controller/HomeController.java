package com.xsis.bootcamp162.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	@RequestMapping(value= {"/","/index"}, method=RequestMethod.GET)
	public String index() {
		return "index";
	}
	
	@RequestMapping(value="/home", method=RequestMethod.GET)
	@ResponseBody
	public String home() {
		return "hello home page";
	}
	
	@RequestMapping(value="/contact", method=RequestMethod.GET)
	@ResponseBody
	public String contact() {
		return "hello contact page";
	}
}
