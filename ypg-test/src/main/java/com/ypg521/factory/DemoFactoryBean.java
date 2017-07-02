package com.ypg521.factory;

import org.springframework.beans.factory.FactoryBean;

/**
 * Created by Administrator on 2017/6/28.
 */
public class DemoFactoryBean implements FactoryBean<User> {
	@Override
	public User getObject() throws Exception {
		return new User();
	}

	@Override
	public Class<?> getObjectType() {
		return User.class;
	}
}
