package net.sjmworld.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("kia")
public class KiaMaker implements CarMaker {

	@Autowired
	private Car car;
	
	public Car sell(Money money) {
		System.out.println("I sold a K8");
		car.setName("K8");
		return car;
	}
}
