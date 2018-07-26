package com.xx.gzl.proxy.class_test;

public class Class_test {
	
	public static void main(String[] args) {
//		testForName();
//		testForLoader();
		testForName_Sub();
	}
	
	private static void testForName() {
		try {
			Class<?> line = Class.forName("com.xx.gzl.proxy.class_test.Line");
			Class<?> point = Class.forName("com.xx.gzl.proxy.class_test.Point");
			System.out.println("line   "+line.getName());
			System.out.println("point  "+point.getName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void testForLoader() {
		Class<?> line;
		Class<?> point;
		ClassLoader loader = ClassLoader.getSystemClassLoader();
		try {
			line = loader.loadClass("com.xx.gzl.proxy.class_test.Line");
			point = loader.loadClass("com.xx.gzl.proxy.class_test.Point");
			System.out.println("line  "+line.getName());
			System.out.println("point "+point.getName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private static void testForName_Sub() {
		try {
			Class<?> lineSub = Class.forName("com.xx.gzl.proxy.class_test.Line_sub");
			Class<?> pointSub = Class.forName("com.xx.gzl.proxy.class_test.Point_sub");
			
			System.out.println("lineSub  "+lineSub.getName());
			System.out.println("pointSub  "+pointSub.getName());
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
