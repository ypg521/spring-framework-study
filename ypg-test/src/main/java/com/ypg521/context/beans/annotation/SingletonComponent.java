package com.ypg521.context.beans.annotation;

import org.springframework.stereotype.Component;

/**
 * Created by ypg on 27/06/2017.
 */
@Component
public class SingletonComponent {

	public  String  say(){

		return "Hello! Singleton By :" +this.toString();

	}

}
