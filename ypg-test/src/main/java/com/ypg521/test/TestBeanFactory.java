package com.ypg521.test;

import com.ypg521.beans.User;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

/**
 * Created by Administrator on 2017/6/26
 *
 */
public class TestBeanFactory {

	@Test
	public void testXmlBeanFactory() {
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		new XmlBeanDefinitionReader(factory).loadBeanDefinitions("User.xml");
		User user = (User) factory.getBean("user");
		Assert.assertTrue(user != null);
	}


}
