package com.bigob.i01;

class Demo1 extends Thread{
	@Override
	public void run() {
		System.out.println("Demo1");
		System.out.println(this.isDaemon());
	}
}

class Demo2 extends Thread{
	@Override
	public void run() {
		System.out.println("Demo2");
		System.out.println(this.isDaemon());
		Demo1 demo1=new Demo1();
		demo1.start();
	}
}
public class DaemonThreadEx2 {

	public static void main(String[] args) {
		System.out.println("main start...");
		System.out.println(Thread.currentThread().isDaemon());
		System.out.println(Thread.currentThread().getPriority());
		Demo2 demo2=new Demo2();
		demo2.setDaemon(true);
		demo2.setPriority(10);
		demo2.start();
	}
}
