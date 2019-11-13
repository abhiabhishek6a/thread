package com.trainingbasket.thread;

public class Parallel2 extends Thread{
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("second Thread");
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
