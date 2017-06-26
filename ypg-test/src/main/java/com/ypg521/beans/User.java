package com.ypg521.beans;

import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/6/26.
 */
@Component
public class User {
	private Integer id;
	private String name;

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
}
