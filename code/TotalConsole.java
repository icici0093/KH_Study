package org.kh.oopinterface;

public class TotalConsole {
//	private BTotal b;
//	private CTotal c;
//	
//	public TotalConsole() {
//		b = new BTotal();
//		c = new CTotal();
//		
//	}
//	public void print() {
//		int sum = b.total();
//		
//		System.out.println(sum);
//	}
//	public void printCTotal() {
//		int sum = c.total();
//		System.out.println(sum);
//	}
	private TotalInterface tInterface;
	
	public void setTotalInterface(TotalInterface tInterface) {
		this.tInterface = tInterface;
	}
	
	public void print() {
		int sum = tInterface.total();
		System.out.println(sum);
	}
}
