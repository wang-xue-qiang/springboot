package com.banner;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;

/**
 * 配置fastjson两种方式
 * 方法一：
 * 	1、启动类继承 WebMvcConfigurerAdapter
 * 	2、覆盖方法 configureMessageConverters
 * 方法二：
 * 	在应用程序中注入Bean：HttpMessageConverters
 */

@SpringBootApplication
public class App extends WebMvcConfigurerAdapter{
	@Override
	public void configureMessageConverters(
			List<HttpMessageConverter<?>> converters) {
		super.configureMessageConverters(converters);
		/**
		 *1、需要先定义一个 covert 转换消息的对象
		 *2、添加fastJson的配置信息，比如是否格式化返回的json数据
		 *3、在convert添加配置信息
		 *4、将convert添加到converts
		 */
		//1、需要先定义一个 covert 转换消息的对象
		FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
		//2、添加fastJson的配置信息，比如是否格式化返回的json数据
		FastJsonConfig fastJsonConfig = new FastJsonConfig();
		fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
		//3、在convert添加配置信息
		fastConverter.setFastJsonConfig(fastJsonConfig);
		//4、将convert添加到converts
	    converters.add(fastConverter);
	}
	//第二种
/*	@Bean
	public HttpMessageConverters  fastJsonHttpMessageConverters(){
		FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
		FastJsonConfig fastJsonConfig = new FastJsonConfig();
		fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
		fastConverter.setFastJsonConfig(fastJsonConfig);
		HttpMessageConverter<?> convert = fastConverter;
		return new HttpMessageConverters(convert);		
	}
	*/
	
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
	
	
	
}
