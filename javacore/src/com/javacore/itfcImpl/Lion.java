package com.javacore.itfcImpl;

import com.javacore.itfc.Walk;

public class Lion implements Walk {
	
	private int age;
	
	
	
	public Lion(int age) {
		super();
		this.age = age;
	}

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

	@Override
	public boolean equals(Object obj) {
		Lion lion;
		boolean isEqual;
		if(obj instanceof Lion) {
			System.out.println("this is lion");
			lion = (Lion) obj;
			if(lion.age == this.age)
				return true;
		}
		return false;
	}
	
	
}
