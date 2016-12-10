package com.javacore.itfcImpl;

import com.javacore.itfc.Fly;

public class Eagle implements Fly {

	@Override
	public int getWingSpan() throws Exception {
		int number = MAX_SPEED;
		land();
		return 0;
	}
	
	public void land() {
		System.out.println("Eagle is landing");
		System.out.println("");
	}

}
