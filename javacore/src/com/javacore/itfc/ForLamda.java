package com.javacore.itfc;

public interface ForLamda {
	default void lamTest(MyLamda <Integer, Double> mylamda) {
		Integer a = 6;
		Double b = 8.0;
		mylamda.mylam(a, b);
	}
}
