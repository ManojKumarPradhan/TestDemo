package com.bigob.i01;

class DemoJoin implements Runnable {

	@Override
	public void run() {
		for (int o = 0; o <= 10; o++) {
			System.out.println("DemoJoin class "+o);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Thread Interrupted");
			}
		}

	}

}

public class JoinEx {

	public static void main(String[] args) throws InterruptedException {
		DemoJoin demoJoin=new DemoJoin();
		Thread th=new Thread(demoJoin);
		th.start();
		//th.join();
		th.join(4000);
		th.join(4000, 999999);
		for(int i=0;i<=10;i++){
			System.out.println("main class "+i);
			Thread.sleep(500);
			//th.join(4000);
		}
		
	}
}
