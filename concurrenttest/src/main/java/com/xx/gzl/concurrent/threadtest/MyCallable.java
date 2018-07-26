package com.xx.gzl.concurrent.threadtest;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {

	@Override
	public String call() throws Exception {
		int sum = 0;
		for(int i = 0;i < 100; i++){
			System.out.println(Thread.currentThread().getName()+ " "+i);
			sum += i;
		}
		return sum+"";
	}

}
