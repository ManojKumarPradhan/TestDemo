package com.bigob.i01;

class MyThread extends Thread{
	public MyThread(ThreadGroup thg,String name) {
		super(thg, name);
	}
	@Override
	public void run() {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
public class ThreadGroupEx1 {

	public static void main(String[] args) {
		ThreadGroup thg1=new ThreadGroup("NewGroup");
		ThreadGroup thg2=new ThreadGroup(thg1, "child_NewGroup");
		MyThread myThread=new MyThread(thg2, "thread_child_NewGroup");
		
		System.out.println(myThread.getPriority());
		myThread.start();
		System.out.println(thg2.getMaxPriority());
		thg2.setMaxPriority(4);
		MyThread myThread2=new MyThread(thg2, "thread2_Child_NewGroup");
		myThread2.start();
		thg2.list();
		/*5
		java.lang.ThreadGroup[name=child_NewGroup,maxpri=10]
		    Thread[thread_child_NewGroup,5,child_NewGroup]*/
		
		thg1.list();
		/*java.lang.ThreadGroup[name=NewGroup,maxpri=10]
			    java.lang.ThreadGroup[name=child_NewGroup,maxpri=10]
			        Thread[thread_child_NewGroup,5,child_NewGroup]*/
		System.out.println(thg1.activeCount());
		System.out.println(thg2.activeCount());//how many active thread are there in this group
		System.out.println(thg1.activeGroupCount());
		System.out.println(thg2.activeGroupCount());//how many individual sub ThreadGrup available in this group
		thg2.list();
	}
}
