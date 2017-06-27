package com.ypg521.context.beans.annotation.service;

import com.ypg521.context.beans.annotation.PrototypeComponent;
import com.ypg521.context.beans.annotation.SingletonComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by ypg on 27/06/2017.
 */
@Service
public class Service2 {

	@Autowired
	private SingletonComponent singletonComponent;
	@Autowired
	private PrototypeComponent prototypeComponent;

	public void singletonSay() {
		String s = singletonComponent.say();
		System.out.println(s);
	}

	public void prototypeSay(){

		String s = prototypeComponent.say();
		System.out.println(s);

	}
}
