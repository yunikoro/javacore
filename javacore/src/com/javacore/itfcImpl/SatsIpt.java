package com.javacore.itfcImpl;

public class SatsIpt {
	public static int index = 0;
	public String name;
	public int result;
	
	public void mtd1() {
		System.out.println("mtd1");
	}
	
	public void ovrLoad(int over) {
		System.out.println("primtive");
	} 
	
	public void ovrLoad(Integer over) {
		System.out.println("boxing");
	}
	
	public static void stcMtd() {
		System.out.println("statsIpt stcMtd");
	}
	
	private void soAppend(int append) {
		this.result = this.result + append;
	}
	
	public static void myAppend(SatsIpt sats) {
		sats.soAppend(6);
	}
}
