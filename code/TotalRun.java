package org.kh.oopinterface;

public class TotalRun {

	public static void main(String[] args) {
		TotalConsole totalconsole = new TotalConsole();
//		totalconsole.setTotalInterface(new BTotal());
		BTotal b = new BTotal();
		totalconsole.setTotalInterface(b);
		totalconsole.print();
	}

}
