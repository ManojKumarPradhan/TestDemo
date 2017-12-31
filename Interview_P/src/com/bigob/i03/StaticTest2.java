package com.bigob.i03;

public class StaticTest2 {
	
	static{
		//System.out.println(x);
		System.out.println(StaticTest2.x);
	}
	public static void main(String[] args) {
		System.out.println("main method");
	}
	static int x=10;
}
