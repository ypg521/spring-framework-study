package com.ypg521.processor;

import com.ypg521.processor.bean.Student;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

/**
 * Created by Administrator on 2017/6/30.
 */
public class TestPostProcessor {

	private DefaultListableBeanFactory factory;

	@Before
	public void doBefore() {
		factory = new DefaultListableBeanFactory();
		//返回 找到了多少 BeanDefinition
		int loadBeanDefinitionsNumber = new XmlBeanDefinitionReader(factory).loadBeanDefinitions("processor.xml");
		System.out.println(loadBeanDefinitionsNumber);
	}

	@Test
	public void testInstantiationAwareBeanPostProcessor() {
		factory.addBeanPostProcessor(new DefaultInstantiationAwareBeanPostProcessor());
		Student student = (Student) factory.getBean("student");
		Assert.assertTrue(student != null);
	}

	@Test
	//TODO ??????  DisposableBeanAdapter
	public void testDestructionAwareBeanPostProcessor() {
		factory.addBeanPostProcessor(new DefaultDestructionAwareBeanPostProcessor());
		Student student = (Student) factory.getBean("student");
		Assert.assertTrue(student != null);
	}

	@Test
	public void  testMergedBeanDefinitionPostProcessor(){
		factory.addBeanPostProcessor(new DefaultMergedBeanDefinitionPostProcessor());
		Student student = (Student) factory.getBean("student");
		Assert.assertTrue(student != null);
	}

	@Test
	public void testBeanPostProcessor(){
		factory.addBeanPostProcessor(new DafaultBeanPostProcessor());
		Student student = (Student) factory.getBean("student");
		Assert.assertTrue(student != null);
	}


}
