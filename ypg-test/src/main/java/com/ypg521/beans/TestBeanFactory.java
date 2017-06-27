package com.ypg521.beans;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

/**
 * Created by Administrator on 2017/6/26
 */
public class TestBeanFactory {

	@Test
	public void testXmlBeanFactory() {
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		int loadBeanDefinitionsNumber = new XmlBeanDefinitionReader(factory).loadBeanDefinitions("beans/User.xml");
		User user = (User) factory.getBean("user");
		Assert.assertTrue(user != null);
	}

	@Test
	public void testAlias() {
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		//返回创建了多少 BeanDefinition
		int loadBeanDefinitionsNumber =	new XmlBeanDefinitionReader(factory).loadBeanDefinitions("beans/User.xml");
		User user = (User) factory.getBean("user");
		User u1 = (User) factory.getBean("u1");
		Assert.assertTrue(user != null);
		Assert.assertTrue(u1 != null);
		Assert.assertTrue(u1 == user);
	}


}
