package com.ypg521.listener;

import org.springframework.context.ApplicationEvent;

/**
 * Created by ypg on 01/07/2017.
 */
public class DemoEvent extends ApplicationEvent {
	/**
	 * Create a new ApplicationEvent.
	 *
	 * @param source the object on which the event initially occurred (never {@code null})
	 */
	public DemoEvent(Object source) {
		super(source);
	}
}
