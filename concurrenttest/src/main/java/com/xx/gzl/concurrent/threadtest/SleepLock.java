package com.xx.gzl.concurrent.threadtest;

public class SleepLock {
	Object lock = new Object();
	
	public static void main(String[] args) {
		SleepLock sleepLock = new SleepLock();
		
		Thread sThreadSleep = sleepLock.new ThreadSleep();
		
	}
	
	private class ThreadSleep extends Thread{
		@Override
		public void run() {
			String threadName = Thread.currentThread().getName();
			System.out.println(threadName + "will take the lock");
			try {
				synchronized (lock) {
					System.out.println(threadName + "taking the lock");
					System.out.println("Finish the work"+threadName);
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
