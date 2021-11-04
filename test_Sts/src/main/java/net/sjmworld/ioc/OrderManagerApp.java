package net.sjmworld.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OrderManagerApp {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("ioc.xml");
		OrderManager orderManager = ctx.getBean("orderManager", OrderManager.class);   // 기본 싱글톤 ioc1.xml에서 scope="singleton"
		orderManager.order();
		
	}
}
