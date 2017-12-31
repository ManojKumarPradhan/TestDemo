package com.bigob.i01;

class DeadDemo implements Runnable{
	static Thread th;
	@Override
	public void run(){
		try {
			System.out.println(th);
			th.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for(int i=10;i>=0;i--){
			System.out.println("manoj");
		}
	}
}
public class DeadlockEx2 {

	public static void main(String[] args) throws InterruptedException {
		DeadDemo.th=Thread.currentThread();
		DeadDemo dd=new DeadDemo();
		Thread th=new Thread(dd);
		th.start();
		th.join();
		for(int y=0;y<=10;y++){
			System.out.println("pradhan");
		}
	}
}
