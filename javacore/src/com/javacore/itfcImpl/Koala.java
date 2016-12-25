package com.javacore.itfcImpl;

public class Koala {
	
	public static int count = 0;
	public final int COUNT_MAX = 5;
	
	public static void staticMtd() {
		new Koala().instanceMtd();
		System.out.println("static method");
	}
	
	public void instanceMtd() {
		System.out.println("instance method count is: " + this.COUNT_MAX);
	}
}
