package org.kh.zoointerface;

public class ZooProgram {
	public static void main(String[] args) {
		ZooKeeper keeper = new ZooKeeper();
		keeper.feed(new Tiger());
		keeper.feed(new Lion());
		keeper.feed(new Leopard());
	}
}
