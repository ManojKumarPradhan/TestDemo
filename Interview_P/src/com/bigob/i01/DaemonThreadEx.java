package com.bigob.i01;

public class DaemonThreadEx {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		System.out.println(Thread.currentThread().isDaemon());
		System.out.println(Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(2);
		System.out.println(Thread.currentThread().getPriority());
		/*Thread.currentThread().setDaemon(false);
		 * 
		 * java.lang.IllegalThreadStateException occurs (Unchecked Thread)
		 * 
		System.out.println(Thread.currentThread().isDaemon());
		Thread.currentThread().setDaemon(true);
		System.out.println(Thread.currentThread().isDaemon());*/
		
		/*Daemon Thread
		................
		Daemon thread is execute in background to support non-daemon thread execution 

		example is garbage collector is a daemon thread it run in background , if some thread stuck in middle due to memory issue then 
		JVM call daemon thread as priority thread 10 to garbage the unnecessary object

		we have 2 method 

			public final boolean isDaemon()  to check the thread is daemon or not
			
			public final void setDaemon(boolean on) to provide the daemon nature to a thread 

		but we have to provide daemon nature before calling start() otherwise it leads to java.lang.IllegalThraedStateException */
	}
}
