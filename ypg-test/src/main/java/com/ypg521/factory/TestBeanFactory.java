package com.ypg521.factory;

import com.ypg521.factory.circular.Student;
import com.ypg521.factory.circular.Teacher;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

/**
 * Created by Administrator on 2017/6/26
 */
//TODO　scope
public class TestBeanFactory {
	//DefaultListableBeanFactory  实现
	private DefaultListableBeanFactory factory;

	@Before
	public void doBefore() {
		/**
		 *
		 *
		 *
		 * */
		factory = new DefaultListableBeanFactory();
		//返回 找到了多少 BeanDefinition
		int loadBeanDefinitionsNumber = new XmlBeanDefinitionReader(factory).loadBeanDefinitions("factory.xml");
		System.out.println(loadBeanDefinitionsNumber);
	}

	public void testScope() {
		factory.registerScope("scopeName", new DemoScope());

	}

	@After
	public void doAfter() {
		System.out.println("done");
	}

	@Test
	public void testXmlBeanFactory() {
		User user = (User) factory.getBean("user");
		Assert.assertTrue(user != null);
	}

	@Test
	public void testAlias() {

		User user = (User) factory.getBean("user");
		User u1 = (User) factory.getBean("u1");
		Assert.assertTrue(user != null);
		Assert.assertTrue(u1 != null);
		Assert.assertTrue(u1 == user);
		Assert.assertTrue(factory.getBean("user") == user);
	}

	@Test
	public void testPrototype() {
		User u1 = (User) factory.getBean("prototypeUser");
		User u2 = (User) factory.getBean("prototypeUser");
		Assert.assertFalse(u1 == u2);
		Assert.assertFalse(u1.equals(u2));
	}

	@Test
	public void testFactoryBean() throws Exception {
		User user = (User) factory.getBean("demoFactoryBean");

		Assert.assertTrue(user != null);
	}

	@Test
	public void testDemoServer() {
//		demoServer
		DemoServer server = (DemoServer) factory.getBean("demoServer");

		Assert.assertTrue(server.getUser() != null);
	}

	//测试循环引用
	@Test
	public void testCircularReference() {
		Student student = (Student) factory.getBean("student");
		Teacher teacher = (Teacher) factory.getBean("teacher");
		Assert.assertTrue(student == teacher.getStudent());
		Assert.assertTrue(teacher == student.getTeacher());
	}


}
