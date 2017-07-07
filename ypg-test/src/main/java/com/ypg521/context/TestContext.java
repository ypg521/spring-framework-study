package com.ypg521.context;

import com.ypg521.context.beans.DistoryBean;
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

		/**
		 * @see   org.springframework.beans.factory.support.AbstractBeanFactory.getBean(String name)
		 *
		 *
		 * refresh()
		 *
		 *new ClassPathXmlApplicationContext时调用了refresh()
		 * 				 getBean("org.springframework.context.annotation.internalConfigurationAnnotationProcessor")
		 *               getBean("org.springframework.context.annotation.internalAutowiredAnnotationProcessor")
		 *               getBean("org.springframework.context.annotation.internalRequiredAnnotationProcessor")等处理注解的方法 貌似一共6个。
		 *
		 * 以上这些注解处理的bean是在package scan的时候 默认注册的,并且会将这些对象注册到Factory (addBeanPostProcessor)
		 *
		 *
		 */
		System.out.println("init context");
		context = new ClassPathXmlApplicationContext("context.xml");
		context.setDisplayName("firstContext");
	}

	@After
	public void doAfter() {
		System.out.println("test done");
	}

	@Test
	public void testApplication() {
		String applicationName = context.getDisplayName();
		System.out.println(applicationName);
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

	@Test
	public void testDestroy() {
		context.registerShutdownHook();
		DistoryBean distoryBean = (DistoryBean) context.getBean("distoryBean");
		Assert.assertTrue(distoryBean != null);
	}

	@Test
	public void testListener() {

	}

}
