package com.fspringapp1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Page2 {

	@RequestMapping("/page2")
	public String showPage(){
		return "page2";
	}

}
