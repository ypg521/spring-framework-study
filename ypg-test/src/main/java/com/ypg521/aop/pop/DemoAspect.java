package com.ypg521.aop.pop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/6/28.
 */
@Component
@Aspect
public class DemoAspect {

	@Pointcut("execution(* com.ypg521.aop.pop.DemoService.*(..))")
	public void aspect() {
	}

	@Before("aspect()")
	public void before(JoinPoint joinPoint) {
		System.out.println("doBefore");

	}
}
