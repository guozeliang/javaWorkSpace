package com.xx.gzl.proxy.class_test;

public class Line {
	static {
		System.out.println("静态代码块执行：loading line");
	}

	public Line() {
		super();
		System.out.println("constructor：line 对象");
	}
	
}
