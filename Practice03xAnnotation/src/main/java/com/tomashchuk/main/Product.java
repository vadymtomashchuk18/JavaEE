package com.tomashchuk.main;

import org.springframework.beans.factory.annotation.Required;

/**
 * @author Vadym Tomashchuk
 *
 */
public class Product {
	private String title;
	private String details;
	private int price;
	
	Product (){
	}
	
	Product(String title, String details){
		this.title = title;
		this.details = details;
	}
	
	public void setTitle (String title){
		this.title = title;
	}
	
	public String getTitle (){
		return title;
	}
	
	public void setDetails (String details){
		this.details = details;
	}
	
	public String getDetails (){
		return details;
	}

	@Required
	public void setPrice(int prc){
		this.price = prc;
	}

	public int getPrice(){
		return price;
	}

	@Override
	public String toString (){
		return title + " (" + details +"); Price: "+price;
		
	}
}
