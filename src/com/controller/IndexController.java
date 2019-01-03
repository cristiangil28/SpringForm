package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@SessionAttributes("mensaje")
public class IndexController {
	
	@RequestMapping("/")
	public String showIndex(Model model) {
		model.addAttribute("mensaje", "mensaje desde modelo");
		return "index";
	}
	
	@RequestMapping("/about")
	public String showAbout() {
		return "about";
	}
	

}
