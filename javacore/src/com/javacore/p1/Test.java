package com.javacore.p1;

public class Test {

	public static String repeat1(char c, int n) {
		String answer = "";
		
		for(int j = 0; j < n; j++)
			answer += c;
		
		return answer;
	}
	
	public static String repeat2(char c, int n) {
		StringBuilder sbd = new StringBuilder();
		
		for(int k = 0; k < n; k++) {
			sbd.append(c);
		}
		
		return sbd.toString();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 long startTime = System.nanoTime();
		 repeat1('D', 40);
		 long endTime = System.nanoTime();
		 long elapsed = endTime - startTime;
		 System.out.println(elapsed);
		 
		 long startTime2 = System.nanoTime();
		 repeat2('D', 40);
		 long endTime2 = System.nanoTime();
		 long elapsed2 = endTime2 - startTime2;
		 System.out.println(elapsed2);
	}

}
