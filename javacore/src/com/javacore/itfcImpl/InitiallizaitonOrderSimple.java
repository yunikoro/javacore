package com.javacore.itfcImpl;

public class InitiallizaitonOrderSimple {
	private String name = "Torchie";
	{System.out.println(name);}
	private static int COUNT = 0;
	static {
		System.out.println(COUNT);
	}
	static {
		
	}
}
