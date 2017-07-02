package com.ypg521.utils;

import com.ypg521.factory.User;
import org.junit.Test;
import org.springframework.util.ClassUtils;

import java.util.Objects;

/**
 * Created by ypg on 30/06/2017.
 */
public class TestClassUtils {

	@Test
	public void testGetUserClass() {
		User user = new User();
		String result= ClassUtils.getUserClass(user).getName();

		org.junit.Assert.assertTrue(Objects.equals("com.ypg521.beans.User", result));

		String s = new String();
		 result= ClassUtils.getUserClass(s).getName();

		org.junit.Assert.assertTrue(Objects.equals("java.lang.String", result));

		return;
	}
}
