package com.banner.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banner.bean.Cat;
import com.banner.service.CatService;

@RestController
@RequestMapping("/cat")
public class CatController {
	@Autowired
	private CatService catService ;
	
	@RequestMapping("/save")
	public void save(){
		Cat cat = new Cat();
		cat.setName("Jack");
		cat.setAge(2);
		catService.save(cat);
	}
	@RequestMapping("/delete")
	public void delete(){
		catService.delete(1);
	}
	@RequestMapping("/selectByName")
	public Cat getCatByJdbcTemplate(String name){
		return catService.selectByName(name);
	}
	
	
	
}
