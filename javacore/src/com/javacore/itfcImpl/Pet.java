package com.javacore.itfcImpl;

public class Pet {
	private int age;
	protected String proCate;
	public String category;
		
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		
	}
	
	public static void hello() {
		System.out.println("father hello");
	}
	
	public Pet() {
		
	}
	
	public Pet(int age) {
		this.age = age;
	}
}
