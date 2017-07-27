package com.ypg521.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/6/28.
 */
@Component
@Aspect
public class HelloAspect {

	@Pointcut("execution(* com.ypg521.aop.aspect.HelloService.*(..))")
	public void aspect() {
	}

	@Before("aspect()")
	public void before(JoinPoint joinPoint) {
		System.out.println("doBefore");
	}

	@Around("aspect()")
	public void around(ProceedingJoinPoint joinPoint) throws Throwable {
		joinPoint.proceed();
		System.out.println("doAround");
	}

	@After("aspect()")
	public void after(JoinPoint joinPoint) {
		System.out.println("doAfter");
	}


}
