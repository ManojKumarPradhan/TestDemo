package com.bigob.i02;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Lockex extends Thread {

	static Lock lock = new ReentrantLock();

	public Lockex() {
		super();
	}
	
	Lockex(String name){
		super(name);
	}
	
	public static void main(String[] args) {
		new Lockex("1st Thread").start();
		new Lockex("2nd Thraed").start();
	}

	@Override
	public void run() {
		try {
			if (lock.tryLock(1000,TimeUnit.MICROSECONDS)) {
				System.out.println("Thread name is in if  " + currentThread());
				Thread.sleep(10000);
				lock.unlock();
				System.out.println(currentThread()+"  release the lock");
			} else {
				System.out.println("Thread name is in else " + currentThread());
			}
		} catch (InterruptedException ie) {
			System.out.println("InterruptedException occure");
		}
	}
}
