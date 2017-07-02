package com.ypg521.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Created by ypg on 30/06/2017.
 */
public class DafaultBeanPostProcessor implements BeanPostProcessor {

	// populateBean之后调用依次调用before after，
	//初始化bean  调用invokeAwareMethods   ，依次判断BeanNameAware、BeanClassLoaderAware、BeanFactoryAware设置对应的值
	// 先before ，然后处理lazy lod 、init method的逻辑。 然后after
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		return bean;
	}
}
