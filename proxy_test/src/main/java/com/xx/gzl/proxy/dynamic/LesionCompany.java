package com.xx.gzl.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class LesionCompany implements InvocationHandler {

	private Object comm;
	
	public Object getComm() {
		return comm;
	}

	public void setComm(Object comm) {
		this.comm = comm;
	}
	public Object getProxyInstance(){
		return Proxy.newProxyInstance(comm.getClass().getClassLoader(), comm.getClass().getInterfaces(), this);
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		doSomethingBefore("test");
		Object ret = method.invoke(comm, args);
		doSomethingEnd("test");
		return ret;
	}
	
	private void doSomethingEnd(String size) {
		System.out.println("售后服务");
	}

	private void doSomethingBefore(String size) {
		// TODO Auto-generated method stub
		System.out.println("为客户寻找这个"+size+"的工具");
	}
}
