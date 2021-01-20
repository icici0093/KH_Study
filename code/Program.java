package org.kh.simpleinterface;

public class Program {

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		a.setX(b);
		a.print();
	}

}
