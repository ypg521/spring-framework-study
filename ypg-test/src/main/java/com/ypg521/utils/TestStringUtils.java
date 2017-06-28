package com.ypg521.utils;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.util.StringUtils;

import java.util.Arrays;

/**
 * Created by Administrator on 2017/6/28.
 */
public class TestStringUtils {
	@Test
	public void testTokenizeToStringArray() {
		String[] strings = StringUtils.tokenizeToStringArray("a,b,c,d", ": ,");
		Assert.assertTrue(Arrays.equals(new String[]{"a", "b", "c", "d"}, strings));

		strings = StringUtils.tokenizeToStringArray("a b c d", ": ,");
		Assert.assertTrue(Arrays.equals(new String[]{"a", "b", "c", "d"}, strings));

		strings = StringUtils.tokenizeToStringArray("a:b:c:d", ": ,");
		Assert.assertTrue(Arrays.equals(new String[]{"a", "b", "c", "d"}, strings));


	}
}
