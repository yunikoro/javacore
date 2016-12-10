package com.javacore.itfcImpl;

import com.javacore.itfc.Walk;

public class Lion implements Walk {

	@Override
	public boolean isQuadruped() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public double getMaxSpeed() {
		// TODO Auto-generated method stub
		return 100;
	}
	
	public boolean canHuntWhileRunning() {
		return true;
	}

}
