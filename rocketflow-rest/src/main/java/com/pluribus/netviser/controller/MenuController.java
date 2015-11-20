package com.pluribus.netviser.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MenuController {
//	@RequestMapping("/")
//	public String getMenuPage() {
//		return "menu";
//	}
//	
	@RequestMapping("/browse.html")
	public String getTestPage(Model model) {
		model.addAttribute("content", "browse");
		return "template";
	}
}
