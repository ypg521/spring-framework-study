package com.ypg521.beans;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;

/**
 * Created by Administrator on 2017/6/28.
 */
public class DemoScope implements Scope {
	@Override
	public Object get(String name, ObjectFactory<?> objectFactory) {
		return null;
	}

	@Override
	public Object remove(String name) {
		return null;
	}

	@Override
	public void registerDestructionCallback(String name, Runnable callback) {

	}

	@Override
	public Object resolveContextualObject(String key) {
		return null;
	}

	@Override
	public String getConversationId() {
		return null;
	}
}
