package com.florists.utilities;

public enum TypeMaterial {
	
	WOOD("wood"),
	PLASTIC("plastic");
	
	private String name;
	

	private TypeMaterial(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}


	@Override
	public String toString() {		
		return name;
	}
	
	




}
