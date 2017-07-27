package com.ypg521.aop.aspect;

import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/6/28.
 */
@Service
public class WorldService {

	public StringBuilder sayWorld() {
		System.out.println("sayWorld");
		return new StringBuilder("sayWorld");
	}

}
