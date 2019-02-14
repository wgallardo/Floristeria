/**
 * 
 */
package com.florists.utilities;


public enum Colour {
	RED("Red"),
	BLUE("Blue"),
	YELLOW("Yellow"),
	BLACK("black"),
	WHITE("White"),
	GREEN("Green"),
	GRAY("Gray");
	
	private String name;
	 
	private Colour(String name) {
		this.name = name;
	}	
	

	public String getName() {
		return name;
	}
	

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}
	
	

}
