package com.banner.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/templates")
public class ThymeleafController {
	@RequestMapping("/hello")
	public String hello(Map<String, Object> map){
	/*	ModelAndView mv = new ModelAndView();
		mv.setViewName("hello");*/
		map.put("name", "Allen");
		return "hello";
	}
}
