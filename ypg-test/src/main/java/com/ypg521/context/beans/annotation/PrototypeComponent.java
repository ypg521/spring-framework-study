package com.ypg521.context.beans.annotation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by ypg on 27/06/2017.
 */
@Component
@Scope("prototype")
public class PrototypeComponent {

	public  String  say(){
		
		return "Hello! Prototype By :"+this.toString() ;

	}

}
