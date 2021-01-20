package org.kh.simpleinterface;

public class A {
	private X x;
	public void setX(X x) {
		this.x = x;
	}
	public void print() {
		int sum = x.total();
		System.out.println(sum);
	}
}
