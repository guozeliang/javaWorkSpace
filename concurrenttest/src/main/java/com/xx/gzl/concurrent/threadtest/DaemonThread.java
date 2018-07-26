package com.xx.gzl.concurrent.threadtest;

public class DaemonThread {
	public static class MyThread extends Thread{
		@Override
		public void run() {
			try {
				while (!isInterrupted()) {
					System.out.println(Thread.currentThread().getName());
				}
				System.out.println(Thread.currentThread().getName() 
						+ " interrupt flag is " + isInterrupted());
			} finally {
				System.out.println("...........finally");
			}
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		MyThread thread = new MyThread();
		thread.setDaemon(true);//设为守护进程 
		thread.start();
		Thread.sleep(5);
		thread.interrupt();
	}
}
