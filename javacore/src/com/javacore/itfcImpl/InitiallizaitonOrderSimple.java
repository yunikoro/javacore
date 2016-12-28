package com.javacore.itfcImpl;

public class InitiallizaitonOrderSimple {
	private String name = "Torchie";
	public String kk = "kk";
	{System.out.println(name);}
	private static int COUNT = 0;
	static {
		System.out.println(COUNT);
	}
	
	{
		COUNT++;
		System.out.println(COUNT);
	}
	
	static {
		COUNT += 10;
		System.out.println(COUNT);
	}
	
	public InitiallizaitonOrderSimple() {
		System.out.println("constrctor");
	}
}
