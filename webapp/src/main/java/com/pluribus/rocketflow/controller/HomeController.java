package com.pluribus.rocketflow.controller;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
//	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		return "home";
	}
	
	@RequestMapping(value = "/top-talker", method = RequestMethod.GET)
	public String topTalker(Locale locale, Model model) {
		return "top-talker";
	}
	
	@RequestMapping(value = "/app-wall", method = RequestMethod.GET)
	public String appView(Locale locale, Model model) {
		return "app-wall";
	}

	@RequestMapping(value = "/flow-drill", method = RequestMethod.GET)
	public String flowDrill(Locale locale, Model model) {
		return "flow-drill";
	}
	
	
}
