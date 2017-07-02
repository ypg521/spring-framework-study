package com.ypg521.listener;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by ypg on 01/07/2017.
 */
public class TestListener {


	private ClassPathXmlApplicationContext context;

	@Before
	public void doBefore() {
		System.out.println("init context");
		context = new ClassPathXmlApplicationContext("aop.xml");
	}

	@Test
	public void test(){

		context.addApplicationListener(new DemoListener());

		context.publishEvent(new DemoEvent("aaa"));
	}
}
