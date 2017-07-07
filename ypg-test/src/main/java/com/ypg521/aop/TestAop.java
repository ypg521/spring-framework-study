package com.ypg521.aop;

import com.ypg521.aop.inter.DemoInterface;
import com.ypg521.aop.pop.DemoService;
import com.ypg521.aop.pop.NoAspectDemoService;
import org.junit.Assert;
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
	public void testSay() {
		DemoService demoService = (DemoService) context.getBean("demoService");
		demoService.say();
	}

	@Test
	public void testSayWithInner() {
//		expose-proxy="true"  	((DemoService) AopContext.currentProxy()).innerSay();
		DemoService demoService = (DemoService) context.getBean("demoService");
		demoService.sayWithInner();
	}

	@Test
	//TODO
	public void secondTest() {
		//没有被切面包含、生成的是原生对象
		NoAspectDemoService noAspectDemoService = (NoAspectDemoService) context.getBean("noAspectDemoService");
		System.out.println(noAspectDemoService);
		return;
	}

	@Test
	public void testInterfaceAspect() {
		DemoInterface demoInterface = (DemoInterface) context.getBean("demoInterface");
		Assert.assertTrue(demoInterface != null);
		demoInterface.say();
	}

	@Test
	public void testProxyCreatorBean() {
		Object o = context.getBean(AopConfigUtils.AUTO_PROXY_CREATOR_BEAN_NAME);
		System.out.println(o);
	}

}
