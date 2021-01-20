package org.kh.inheritance;

public class Exam_Parent {
	public static void main(String[] args) {
		Child child = new Child();
//		System.out.println(child.getParentMoney());
//		child.giveMoneyParent(1000);
//		System.out.println(child.getParentMoney());
		child.printInfo();
		
		Parent parent = new Parent();
		System.out.println("toString() 오버라이딩 : " + parent.toString());
	}
}
class Parent{
//	private int money = 2000;
	protected int money = 2000;
	
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	@Override
	public String toString() { // 객체의 고유값을 저장해주는 메소드
		// TODO Auto-generated method stub
		return this.money+"";
	}
}

class Child extends Parent {
	
	private int myMoney = 1000;
	private int money = 1500;
	
	public Child() {
		super();
	}
	
	public int getParentMoney() {
//		return super.money;
		return super.getMoney();
	}
	public void giveMoneyParent(int extra) {
		int sum = super.getMoney() + extra;
		super.setMoney(sum);
	}
	public void printInfo() {
		System.out.println(myMoney);
		System.out.println("자식의 것 : " + this.money);
		System.out.println("부모의 것 : " + super.money);
	}
}
