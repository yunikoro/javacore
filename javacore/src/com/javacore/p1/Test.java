package com.javacore.p1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "ab";
		String b = "ab".concat("c").concat("d");
		StringBuilder sbr = new StringBuilder("start ");
		StringBuilder sdr = sbr.append("time");
		System.out.println(sbr);
		System.out.println(sdr);
		
		String[][] twoDstrs = new String[3][2];
		for (int i = 0; i < twoDstrs.length; i++) {
			for (int j = 0; j < twoDstrs[i].length; j++) {
				twoDstrs[i][j] = "{"+i+", "+j+"}";
			}
		}
		
		for (int i = 0; i < twoDstrs.length; i++) {
			for (int j = 0; j < twoDstrs[i].length; j++) {
				System.out.println(twoDstrs[i][j]);
			}
		}	
	}

}
