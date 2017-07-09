package com.ypg521.aop.pop;

import org.springframework.aop.framework.AopContext;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/6/28.
 */
@Service
public class DemoService {

	public void say() {
		System.out.println("doSay");
	}

	public void sayWithInner() {
		System.out.println("sayWithInner");

		innerSay();
	}


	public void innerSay() {
		System.out.println("innerSay");
	}
}
