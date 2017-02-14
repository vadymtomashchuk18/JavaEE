/**
 * 
 */
package com.tomashchuk.main;

import java.util.List;

/**
 * @author Vadym Tomashchuk
 *
 */
public class IceCreamSeller {
	private List<IceCream> iceCream;
	
	public void setIceCream (List<IceCream> iceCream){
		this.iceCream = iceCream;
	}
	
	public void showAllIceCreams(){
		for (IceCream iceCr : iceCream){
			iceCr.Seller_sells();
		}
	}
}
