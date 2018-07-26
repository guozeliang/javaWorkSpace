package com.xx.gzl.proxy.stat;

public class Lesion implements ManToolsCompany {

	private ManToolsCompany comm ;

	public ManToolsCompany getComm() {
		return comm;
	}

	public void setComm(ManToolsCompany comm) {
		this.comm = comm;
	}

	@Override
	public void buyTools(String size) {
		doSomethingBefore(size);
		comm.buyTools(size);
		doSomethingEnd(size);
	}

	private void doSomethingEnd(String size) {
		System.out.println("售后服务");
	}

	private void doSomethingBefore(String size) {
		// TODO Auto-generated method stub
		System.out.println("为客户寻找这个"+size+"的工具");
	}

}
