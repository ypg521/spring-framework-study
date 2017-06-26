package com.ypg521.beans;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by ypg on 25/06/2017.
 */
public class TestUser {
	@Test
	public void test() {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("beans/User.xml");
		Object user = ac.getBean("user");
		Assert.assertTrue(user != null);

	}
}