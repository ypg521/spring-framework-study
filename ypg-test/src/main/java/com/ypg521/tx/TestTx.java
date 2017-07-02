package com.ypg521.tx;

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
		context.setDisplayName("firstContext");
	}

	@After
	public void doAfter() {
		System.out.println("test done");
	}

	@Test
	public void test(){

	}
}
