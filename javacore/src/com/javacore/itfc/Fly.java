package com.javacore.itfc;

public interface Fly {

/**
 *  - Can be declare within our application
 */
	public static final int MAX_SPEED = 100;
	
	public int getWingSpan() throws Exception;
	
/**
 *  - Java 8 new feature default
 *  - Optional override in implementing class
 */
	public default void land() {
		System.out.println("Animal is landing");
	}
/**
 *  - static method can have method body
 *  - Can be declare within our application
 * @param distance
 * @param time
 * @return
 */
	public static double calculateSpeed(float distance, double time) {
		return distance/time;
	}
}
