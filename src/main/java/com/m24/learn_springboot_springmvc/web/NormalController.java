package com.m24.learn_springboot_springmvc.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.m24.learn_springboot_springmvc.service.DemoService;

@Controller
public class NormalController {
	@Autowired
	DemoService demoService;
	
	@RequestMapping("/normal")
	public String testPage(Model model) {
		model.addAttribute("msg", demoService.saySomthing());
		return "page";
	}
}
