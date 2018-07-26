package com.xx.gzl.concurrent.threadtest;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

public class OnlyMain {
	public static void main(String[] args) {
		ThreadMXBean xMxBean = ManagementFactory.getThreadMXBean();
		ThreadInfo[] dumpAllThreads = xMxBean.dumpAllThreads(false, false);
		for (ThreadInfo info:dumpAllThreads) {
			System.out.println(info.getThreadName()+"   "+info.getThreadId());
		}
	}
}
