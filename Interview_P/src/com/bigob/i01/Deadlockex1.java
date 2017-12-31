package com.bigob.i01;

public class Deadlockex1 {

	public static void main(String[] args) throws InterruptedException {
		for(int i=10;i>=0;i--){
			System.out.println(i);
		}
		Thread.currentThread().join();//Deadlock occur
		for(int i=1;i<=10;i++){
			System.out.println(i);
		}
	}
}
