package com.xx.gzl.concurrent.threadtest;

public class MyThread extends Thread {
	private int i = 0;
	@Override
	public void run() {
		super.run();
		for (int i = 0 ;i < 100 ;i++){
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
}
