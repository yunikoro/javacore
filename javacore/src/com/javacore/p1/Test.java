package com.javacore.p1;

import java.util.Arrays;
import java.time.*;

import com.javacore.itfc.Fly;
import com.javacore.itfcImpl.Eagle;
import com.javacore.itfcImpl.Lion;


public class Test {

	public void outPut(String ...strings) {
		for (String string : strings) {
			System.out.println(string);
		}
	}
	
	public static void main(String[] args) {
		Eagle eagle = new Eagle();
		Fly.calculateSpeed(2650, 457);
		int a= Fly.MAX_SPEED;
		StringBuilder sb = new StringBuilder(5);
		//sb.setLength(11);

		System.out.println(sb);
		String str1 = "hello world";
		String str2 = "  hello world".trim();
		
		System.out.println(str1.equals(str2));
		
		System.out.println(str1 == str2);
		
		Lion ln1 = new Lion(1);
		Lion ln2 = new Lion(2);
		Lion ln3 = new Lion(1);
		
		Object obj = new Lion(1);
		
		System.out.println(ln3.equals(ln1));
	
		int[] numbers = new int[] {65, 32, 145, 87};
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		System.out.println();
		Arrays.sort(numbers);
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		Test test = new Test();
		
		test.outPut("a", "c");
		
		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());
		
		LocalDate date1 = LocalDate.of(2017, Month.FEBRUARY, 20);
		System.out.println(date1);
		LocalDate date2 = LocalDate.of(2015, 1, 31);
		System.out.println(date2);
	}

}
