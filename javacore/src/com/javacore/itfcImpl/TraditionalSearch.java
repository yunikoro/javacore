package com.javacore.itfcImpl;

import java.util.List;

import com.javacore.itfc.CheckTrait;

import java.util.ArrayList;

public class TraditionalSearch {

	public static void main(String[] args) {
		List<Animal> animals = new ArrayList<Animal>();
		animals.add(new Animal("fish", false, true));
		animals.add(new Animal("kangaroo", true, false));
		animals.add(new Animal("rabbit", true,  false));
		animals.add(new Animal("turtle", false, true));
		
		print(animals, new CheckIfHopper());
	}
	
	private static void print(List<Animal> animals, CheckTrait checker) {
		for(Animal animal : animals) {
			if(checker.test(animal))
				System.out.println(animal + " ");
		}
	}
}
