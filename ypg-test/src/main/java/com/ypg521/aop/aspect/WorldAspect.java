package com.ypg521.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator
 * <p>
 * <p>
 * 带返回值
 */
@Component
@Aspect
public class WorldAspect {

	@Pointcut("execution(* com.ypg521.aop.aspect.WorldService.*(..))")
	public void aspect() {
	}

	@Before("aspect()")
	public StringBuilder before(JoinPoint joinPoint) {
		System.out.println("doBefore");
		return new StringBuilder("doBefore");
	}

	@Around("aspect()")
	public StringBuilder around(ProceedingJoinPoint joinPoint) throws Throwable {
		StringBuilder s = (StringBuilder) joinPoint.proceed();
		System.out.println("doAround");
		s.setCharAt(s.length() - 1, 'A');
		return s;
	}

	@After("aspect()")
	public StringBuilder after(JoinPoint joinPoint) {
		System.out.println("doAfter");
		return null;
	}


}
