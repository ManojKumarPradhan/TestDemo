package com.bigob.i01;

class InterruptedDemo implements Runnable{
	@Override
	public void run() {
		try{
			for(int u=0;u<=10;u++){
				System.out.println("InterruptedDemo " +u);
				Thread.sleep(2000);
			}
		}catch (InterruptedException e) {
			System.out.println("I am engry : why you wake me up");
		}
	}
}
public class InterruptedEx1 {

	public static void main(String[] args) {
		InterruptedDemo interruptedDemo=new InterruptedDemo();
		Thread th=new Thread(interruptedDemo);
		th.start();
		th.interrupt();
		System.out.println("main method");
	}
}
