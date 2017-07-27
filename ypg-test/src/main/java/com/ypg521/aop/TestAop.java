package com.ypg521.aop;

import com.ypg521.aop.aspect.HelloService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.aop.config.AopConfigUtils;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2017/6/28.
 */
public class TestAop {

	//TransactionInterceptor  proxy 默认
	// aspect

	private ClassPathXmlApplicationContext context;

	@Before
	public void doBefore() {
		context = new ClassPathXmlApplicationContext("aop.xml");
	}

	@Test
	public void testHelloSay() {
		HelloService helloService = (HelloService) context.getBean("helloService");
		helloService.say();
	}

	@Test
	public void testHelloSayWithInner() {
		HelloService helloService = (HelloService) context.getBean("helloService");
		helloService.sayWithInner();
	}

	@Test
	public void testProxyCreatorBean() {
		Object o = context.getBean(AopConfigUtils.AUTO_PROXY_CREATOR_BEAN_NAME);
		System.out.println(o);
	}

}
