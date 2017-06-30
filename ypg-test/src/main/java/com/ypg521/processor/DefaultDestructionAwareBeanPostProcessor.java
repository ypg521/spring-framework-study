package com.ypg521.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.DestructionAwareBeanPostProcessor;

/**
 * Created by Administrator on 2017/6/30.
 *
 * destory对象时调用?
 *
 *
 */
public class DefaultDestructionAwareBeanPostProcessor implements DestructionAwareBeanPostProcessor {
	@Override
	public void postProcessBeforeDestruction(Object bean, String beanName) throws BeansException {
		return;
	}

	@Override
	public boolean requiresDestruction(Object bean) {
		return true;
	}
}
