package com.javacore.p1;

import java.util.List;
import java.util.function.Predicate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Test2 extends Exam {
	
	static double area;
	private boolean pass;
	private String name;
	
	final void method() {
		
	}
		
	Test2() {
		this("haha");
		System.out.println("empty");
	}
	
	Test2(String k) {
		System.out.println(k);
	}
	
	/*public static void outPut(Byte b) {
		System.out.println("Byte");
	}*/
	
	public static void outPut(byte b) {
		System.out.println("byte");
	}
	
	void where() {
		System.out.println("Test2!");
	}
	
	public static void main(String[] args) {
		
	}
}

class Exam {
	
	public int m;
	protected int k;
	int s;
	
	public Exam() {
		System.out.println("Exam");
	}
	
	void where() {
		System.out.println("Exam");
	}
	
	void method() throws Exception {
		
	}
}

class WhatException extends Exception {};