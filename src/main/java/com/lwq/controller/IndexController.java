package com.lwq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value="/index")
@Controller
public class IndexController {

	
	@RequestMapping(value="/goto")
	public String index(){
		System.out.println();
		return "index";
	}
	
}
