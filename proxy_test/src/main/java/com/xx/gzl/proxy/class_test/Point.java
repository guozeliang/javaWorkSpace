package com.xx.gzl.proxy.class_test;

public class Point {
	static{
		System.out.println("静态代码块执行：loading point");
	}

	public Point() {
		super();
		System.out.println("constructor：line 对象");
	}
	
}
