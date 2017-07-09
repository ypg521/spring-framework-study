package com.ypg521.tx;

import com.ypg521.tx.transaction.service.UserService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2017/6/28.
 */
public class TestTx {
	//org.springframework.transaction.config.TxNamespaceHandler
	private ClassPathXmlApplicationContext context;

	@Before
	public void doBefore() {

		System.out.println("init context");
		context = new ClassPathXmlApplicationContext("tx/tx.xml");
		context.registerShutdownHook();
	}


	@Test
	public void testUserService() {

		UserService userService = (UserService) context.getBean("userService");
		userService.saveUserInfo("ypg521", "河南省周口市");
	}


}
