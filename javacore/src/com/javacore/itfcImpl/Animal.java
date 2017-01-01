package com.javacore.itfcImpl;

import java.util.function.Predicate;

import com.javacore.itfc.ForLamda;
import com.javacore.itfc.MyLamda;

public class Animal implements ForLamda {
	private String species;
	private boolean canHop;
	private boolean canSwim;
	
	public Animal() {
		super();
	}
		
	public Animal(String speciesName, boolean hopper, boolean swimmer) {
		species = speciesName;
		canHop = hopper;
		canSwim = swimmer;
	}
	
	public void setSpecies(String species) {
		this.species = species;
	}
	
	public boolean canHop() {
		return canHop;
	}
	
	public boolean canSwim() {
		return canSwim;
	}
	@Override
	public String toString() {
		return species;
	}
	public void getPredicate(Predicate<Animal> pre) {
		pre.test(this);
	}	
	
	

	
}
