package com.xx.gzl.concurrent.threadtest;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * Hello world!
 *
 */
public class ThreadTest 
{
    
    public static void main( String[] args )
    {
    	/**
    	 * 多线程测试(Thread)
    	 
    	Thread thread = new MyThread();
    	Thread thread2 = new MyThread();
    	thread.start();
    	thread2.start();
    	*/
    	
    	/**
    	 * 多线程测试(Runnable)
    	 
    	Runnable myRunnable = new MyRunnable();
    	Thread runThread = new Thread(myRunnable);
    	Thread runThread2 = new Thread(myRunnable);
    	runThread.start();
    	runThread2.start();
    	*/
    	/**
    	 * 多线程测试(Callable)
    	 */
    	Callable<String> myCallable = new MyCallable();
    	FutureTask<String> task = new FutureTask<String>(myCallable);
    	Thread taskTd = new Thread(task);
    	taskTd.start();
    	
    }
    
}
