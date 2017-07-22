package com.banner;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @RestController相当于@Controller和@ResponseBody
 * 
 *-javaagent:.\lib\springloaded-1.2.4.RELEASE.jar -noverify
 */
@RestController
public class HelloController {
	@RequestMapping("/hello")
	public String hello(){
		return "hello2";
	}
	@RequestMapping("/hello2")
	public String hello2(){
		return "hello";
	}

	@RequestMapping("/getDemo")
	public Demo getDemo(){
		Demo demo = new Demo();
		demo.setId(1);
		demo.setName("张三");
		demo.setCreateTime(new Date());
		return demo;
	}
}
