package com.bigob.i01;

public class ThreadGroupEx {

	public static void main(String[] args) {
		Thread th = Thread.currentThread();
		System.out.println(th);// Thread[main,5,main]
		ThreadGroup thg = th.getThreadGroup();
		System.out.println(thg);// java.lang.ThreadGroup[name=main,maxpri=10]

		// parent thread group

		ThreadGroup thg1 = thg.getParent();
		System.out.println(thg1);// java.lang.ThreadGroup[name=system,maxpri=10]
		System.out.println(thg1.activeCount());// 5
		System.out.println(thg1.activeGroupCount());// 1
		System.out.println(thg1.getMaxPriority());// 10
		System.out.println(thg1.getParent());// null
		System.out.println(thg1.isDaemon());// false
		thg1.list();

		/*
		 * java.lang.ThreadGroup[name=system,maxpri=10] 
		 * Thread[ReferenceHandler,10,system] 
		 * Thread[Finalizer,8,system] 
		 * Thread[SignalDispatcher,9,system] 
		 * Thread[Attach Listener,5,system]
		 * java.lang.ThreadGroup[name=main,maxpri=10] 
		 * Thread[main,5,main]
		 */
	}
}
