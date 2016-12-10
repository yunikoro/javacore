package com.javacore.itfc;

public interface Run extends Walk {
	
	public abstract boolean canHuntWhileRunning();
	abstract double getMaxSpeed();
}
