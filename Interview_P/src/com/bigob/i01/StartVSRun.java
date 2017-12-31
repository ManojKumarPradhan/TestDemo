package com.bigob.i01;

class Demo extends Thread{
	@Override
	public void run() {
		System.out.println(Thread.currentThread());
		System.out.println(Thread.currentThread().getThreadGroup());
		System.out.println(Thread.currentThread().getThreadGroup().getParent());
	}
}
public class StartVSRun {

	public static void main(String[] args) {
		Demo demo=new Demo();
		demo.run();
		/*Thread[main,5,main]
				java.lang.ThreadGroup[name=main,maxpri=10]
				java.lang.ThreadGroup[name=system,maxpri=10]*/
		demo.start();
		/*Thread[Thread-0,5,main] //in this line it create a new thread 
				java.lang.ThreadGroup[name=main,maxpri=10]
				java.lang.ThreadGroup[name=system,maxpri=10]*/
		
		//when we call start() internally it will call ThreadGroup class add method where a new thread is created and 
		//added in current ThreadGroup and internally it will call run()
	}
}
