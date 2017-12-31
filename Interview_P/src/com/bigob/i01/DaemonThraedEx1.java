package com.bigob.i01;

import java.util.Date;

class Print extends Thread {
	@Override
	public void run() {
		System.out.println(Print.currentThread());
		System.out.println(Print.currentThread().getThreadGroup());
		System.out.println(Print.currentThread().getThreadGroup().getParent());
		System.out.println(Print.currentThread().getThreadGroup().getParent().getParent());
		System.out.println(Print.currentThread());
		for (int i = 1; i <= 10; i++) {
			System.out.println(Thread.currentThread() + " " + i);
			System.out.println(new Date());
			try {
				Thread.sleep(498,999999);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}

public class DaemonThraedEx1 {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().isDaemon());
		Print p = new Print();
		System.out.println(p.isDaemon());
		System.out.println("p.getThreadGroup()-->"+p.getThreadGroup());
		System.out.println("p.getThreadGroup().getParent()-->"+p.getThreadGroup().getParent());
		System.out.println("....."+Print.currentThread());
		p.setDaemon(true);
		System.out.println(".....q  "+Print.currentThread());
		System.out.println(p.isDaemon());
		p.setPriority(10);
		System.out.println(Thread.currentThread().getPriority());
		System.out.println(p.getPriority());
		
		p.start();
		System.out.println("main End");
	}
}
