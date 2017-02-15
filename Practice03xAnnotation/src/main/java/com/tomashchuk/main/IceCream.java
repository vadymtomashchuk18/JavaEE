package com.tomashchuk.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * @author Vadym Tomashchuk
 *
 */
public class IceCream extends Product {

	public IceCream(){}

	@Autowired
	public IceCream(Product iceCream){
		super(iceCream.getTitle(),iceCream.getDetails());
		setPrice(iceCream.getPrice());
	}

	@Autowired
	@Qualifier("iceCream1")
	public void Seller_sells(Product pr_ice){
		System.out.println("This ice cream seller sells "+pr_ice +"\n");
	}

	public void Seller_sells (){
		System.out.println("This ice cream seller sells "+this.toString() +"\n");
	}

}
