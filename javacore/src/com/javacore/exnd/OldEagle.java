package com.javacore.exnd;

import com.javacore.itfc.Fly;
import com.javacore.itfcImpl.Eagle;

public class OldEagle extends Eagle {
	public void getMaxSpeed() {
		int a = MAX_SPEED;
		double b = Fly.calculateSpeed(15, 10);
	}
}
