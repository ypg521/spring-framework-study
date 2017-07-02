package com.ypg521.aop.advisor;

import org.aopalliance.aop.Advice;
import org.springframework.aop.Advisor;
import org.springframework.aop.ClassFilter;
import org.springframework.aop.MethodMatcher;
import org.springframework.aop.Pointcut;

/**
 * Created by ypg on 02/07/2017.
 */
public class DemoAdvisor implements Advisor {
	@Override
	public Advice getAdvice() {
		return null;
	}

	@Override
	public boolean isPerInstance() {
		return false;
	}


	static class DemoAdvice implements Advice{

	}
	static class DemoPointCut implements Pointcut{

		@Override
		public ClassFilter getClassFilter() {
			return null;
		}

		@Override
		public MethodMatcher getMethodMatcher() {
			return null;
		}
	}

}


