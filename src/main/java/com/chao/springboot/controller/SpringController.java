package com.chao.springboot.controller;

import java.util.HashMap;
import java.util.Map;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class SpringController {

	
	
	    @Value("${student.name}")
	    private String name;

	    @Value("${student.age}")
	    private String age;

	    @Value("${student.height}")
	    private String height;
	
	@RequestMapping("/test")
	@ResponseBody
	public Object hehe() {
		 Map<String, String> map = new HashMap<String, String>();
		 map.put("name", name);
		 map.put("age", age);
		 map.put("height", height);
	     return map;
	}
	
	@RequestMapping("/page")
	public String  getPage() {
		 return "test";
    }
	
	@RequestMapping("/jsp")
	public String  getJspPage() {
		 return "hello";
    }
	
	}
