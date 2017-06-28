package com.ypg521.context;

import com.ypg521.context.beans.annotation.service.Service1;
import com.ypg521.context.beans.annotation.service.Service2;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by ypg on 27/06/2017.
 */
public class TestContext {

	private ClassPathXmlApplicationContext context;

	@Before
	public void doBefore() {
		System.out.println("init context");
		context = new ClassPathXmlApplicationContext("context/application.xml");
	}

	@After
	public void doAfter() {
		System.out.println("test done");
	}

	@Test
	public void test() {

		Service1 service1 = (Service1) context.getBean("service1");
		Assert.assertTrue(service1 != null);
		service1.prototypeSay();
		service1.singletonSay();
		System.out.println("---------------------------------------------------------------------------");

		service1 = (Service1) context.getBean("service1");
		Assert.assertTrue(service1 != null);
		service1.prototypeSay();
		service1.singletonSay();
		System.out.println("---------------------------------------------------------------------------");

		Service2 service2 = (Service2) context.getBean("service2");
		Assert.assertTrue(service1 != null);
		service2.prototypeSay();
		service2.singletonSay();
		System.out.println("---------------------------------------------------------------------------");


	}

}
