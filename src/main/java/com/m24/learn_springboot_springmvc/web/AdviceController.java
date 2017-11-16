package com.m24.learn_springboot_springmvc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.m24.learn_springboot_springmvc.domain.DemoObj;

@Controller
public class AdviceController {
	@RequestMapping("/advice")
	public String getSomething(@ModelAttribute("msg") String msg, DemoObj obj) {
		throw new IllegalArgumentException("error");
	}
}
