package com.trainingbasket.thread;

public class Runner 
{
	public static void main(String[] args) {
		Thread t1 = new Thread(new Parallel1());
		Thread t2 = new Thread(new Parallel2());
		t1.start();
		t2.start();
	}	
}
