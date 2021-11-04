package net.sjmworld.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("hyundai")
public class HyundaiMaker implements CarMaker{

	@Autowired
	public Car car;
	
	public Car sell(Money money) {
		System.out.println("I sold a Sonata :" + money);
		car.setName("Sonata");
		return car;
	}
	
}
