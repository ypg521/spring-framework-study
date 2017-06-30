package com.ypg521.processor;

import org.springframework.beans.factory.support.MergedBeanDefinitionPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Created by Administrator on 2017/6/30.
 */
public class DefaultMergedBeanDefinitionPostProcessor implements MergedBeanDefinitionPostProcessor {
	//BeanFactory创建bean之后、populateBean之前调用， 不会打断BeanFactory执行
	// merge 这些东东?
	@Override
	public void postProcessMergedBeanDefinition(RootBeanDefinition beanDefinition, Class<?> beanType, String beanName) {
		return;
	}
}
