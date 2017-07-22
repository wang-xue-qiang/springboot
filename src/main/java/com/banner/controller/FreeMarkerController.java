package com.banner.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/freemaker")
public class FreeMarkerController {
	@RequestMapping("/helloftl")
	public String helloftl(Map<String, Object> map){
	/*	ModelAndView mv = new ModelAndView();
		mv.setViewName("hello");*/
		map.put("name", "Allen");
		return "hello";
	}
}
