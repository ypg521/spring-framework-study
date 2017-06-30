package com.ypg521.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;

import java.beans.PropertyDescriptor;

/**
 * Created by Administrator on 2017/6/30.
 */
public class DefaultInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {
	//创建bean之前调用，返回非空就会跳过BeanFactory创建bean 的步骤 1
	@Override
	public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
		return null;
	}

	// 创建bean之后，populateBean时调用， 返回false就跳过BeanFactory的填充 2
	@Override
	public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
		return true;
	}

	//setProperties之前调用，返回null， 则跳过BeanFactory的 setProperties方法 3
	@Override
	public PropertyValues postProcessPropertyValues(PropertyValues pvs, PropertyDescriptor[] pds, Object bean, String beanName) throws BeansException {
		return pvs;
	}
}
