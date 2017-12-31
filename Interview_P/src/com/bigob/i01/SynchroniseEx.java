package com.bigob.i01;

class PrintNumber{
	public synchronized void ascOrder() throws InterruptedException{
		for(int i=1;i<=10;i++){
			Thread.sleep(1000);
			System.out.println("Asc  "+i);
		}
	}
	public synchronized void dscOrder() throws InterruptedException{
		for(int j=10;j>=0;j--){
			Thread.sleep(1000);
			System.out.println("dsc "+j);
		}
	}
}

class MyThread1 extends Thread{
	PrintNumber printNumber=null;
	public MyThread1(PrintNumber printNumber) {
		this.printNumber=printNumber;
	}
	@Override
	public void run() {
		try {
			printNumber.ascOrder();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class MyThread2 extends Thread{
	PrintNumber printNumber=null;
	public MyThread2(PrintNumber printNumber) {
		this.printNumber=printNumber;
	}
	@Override
	public void run() {
		try {
			printNumber.dscOrder();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
public class SynchroniseEx {

	public static void main(String[] args) {
		PrintNumber printNumber=new PrintNumber();
		MyThread1 myThread1=new MyThread1(printNumber);
		MyThread2 myThread2=new MyThread2(printNumber);
		myThread1.start();
		myThread2.start();
	}
}
