package com.ypg521.aop.inter;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/6/28.
 */
@Component
@Aspect
public class InterfaceAspect {

	@Pointcut("execution(* com.ypg521.aop.inter.*.*(..))")
	public void aspect() {
	}

	@Before("aspect()")
	public void before(JoinPoint joinPoint) {
		System.out.println("doInterface");

	}
}
