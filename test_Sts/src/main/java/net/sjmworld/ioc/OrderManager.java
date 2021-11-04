package net.sjmworld.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class OrderManager {
	private String name;
	
	@Autowired
	@Qualifier("kia")
	private CarMaker maker;

	public OrderManager() {	}	
	
	@Autowired
	private Money money;
	
	public void order() {
		money.setAmount(1000);
		
		Car car = this.maker.sell(money);
	}

}
