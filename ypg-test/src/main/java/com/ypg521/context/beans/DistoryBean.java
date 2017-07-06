package com.ypg521.context.beans;

import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;

/**
 * Created by ypg on 06/07/2017.
 */
@Component
public class DistoryBean {
	@PreDestroy
	public void destroy(){
		System.out.println("destroy begin!");
	}
}
