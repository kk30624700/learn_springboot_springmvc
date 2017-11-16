package com.m24.learn_springboot_springmvc.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.m24.learn_springboot_springmvc.domain.DemoObj;

@RestController
@RequestMapping("/rest")
public class DemoRestController {
	@RequestMapping(value="/getjson",produces= {"application/json;charset=UTF-8"})
	public DemoObj getjson(DemoObj obj) {
		return new DemoObj(obj.getId(), obj.getName());
	}
	
	@RequestMapping(value="/getxml",produces="application/xml;charset=UTF-8")
	public DemoObj getxml(DemoObj obj) {
		return new DemoObj(obj.getId(), obj.getName());
	}
}
