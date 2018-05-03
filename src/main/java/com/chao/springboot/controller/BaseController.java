package com.chao.springboot.controller;

import java.util.SortedMap;
import java.util.TreeMap;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.chao.springboot.entity.Student;

@RestController
@RequestMapping("/base")
public class BaseController {

	@Resource(name="student")
	private Student student;
	
	@RequestMapping("/other")
	@ResponseBody
	public Object hehe() {
		SortedMap<String, String> sortMap = new TreeMap<String, String>();
		sortMap.put("a", "李超");
		sortMap.put("c", "me");
		sortMap.put("b", "love");
	     return sortMap;
	}
	
	@RequestMapping("/student")
	@ResponseBody
	public Object getStudentInfo() {
		SortedMap<String, String> sortMap = new TreeMap<String, String>();
		sortMap.put("a", student.getName());
		sortMap.put("c", student.getAge()+"");
		sortMap.put("b", student.getAddress());
	     return sortMap;
	}
}
