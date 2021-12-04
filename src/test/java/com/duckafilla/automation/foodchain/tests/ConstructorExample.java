package com.duckafilla.automation.foodchain.tests;

public class ConstructorExample {
	
	public ConstructorExample() {
		System.out.println(" This is a constructor ");
	}

	
	public ConstructorExample(int x, int y ) {
		System.out.println(x+y +" = is an Addition value of x & y");
	}
	public static void main(String[] args) {
		ConstructorExample constructorExample = new ConstructorExample(5, 6);
		
		
		System.out.println(" This is a class, executing from main method");

	}

}
