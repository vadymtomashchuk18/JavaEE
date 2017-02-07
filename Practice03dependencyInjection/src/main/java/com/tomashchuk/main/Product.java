package com.tomashchuk.main;

/**
 * @author Vadym Tomashchuk
 *
 */
public class Product {
	private String title;
	private String details;
	
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
	
	public String toString (){
		return title + " (" + details +").";
		
	}
}
