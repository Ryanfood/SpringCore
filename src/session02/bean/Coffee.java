package session02.bean;

import org.springframework.stereotype.Component;


public class Coffee implements Beverage {

	@Override
	public String serve() {
		return "一杯咖啡";
	}
	
}