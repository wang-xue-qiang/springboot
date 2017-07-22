package com.banner;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class Demo {
	private Integer id;
	private String	name;
	private Date	createTime;  
	private String  reMakers;
	private String  email;
	@JSONField(serialize=false)
	public String getReMakers() {
		return reMakers;
	}
	public void setReMakers(String reMakers) {
		this.reMakers = reMakers;
	}
	@JSONField(format="yyyy-MM-dd HH:mm")
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
