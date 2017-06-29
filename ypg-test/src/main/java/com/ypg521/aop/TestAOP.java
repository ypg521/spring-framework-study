package com.ypg521.aop;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2017/6/28.
 */
public class TestAOP {

	private ClassPathXmlApplicationContext context;

	@Before
	public void doBefore() {
		System.out.println("init context");
		context = new ClassPathXmlApplicationContext("aop/application.xml");
	}

	@Test
	public void firstTest() {
		DemoService demoService = (DemoService) context.getBean("demoService");
		demoService.say();
	}

	@Test
	public void secondTest() {
		//没有被切面包含、生成的是原生对象
		NoAspectDemoService noAspectDemoService = (NoAspectDemoService) context.getBean("noAspectDemoService");
		System.out.println(noAspectDemoService);
		return;
	}

}
