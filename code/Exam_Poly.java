package org.kh.poly;

public class Exam_Poly {
	public static void main(String[] args) {
//		Car c = new Car();
//		Car carSonata = new Sonata();
//		Car carAvante = new Avante();
//		angryCar(c);
//		angryCar(new Car());
//		angryCar(carSonata);
//		angryCar(carAvante);
		
//		Car car = new Sonata(); // Up-Casting
//		car.move();
//		car.sound();
//		((Sonata)car).moveSonata(); // Down-Casting
		
		angryCar(new Sonata());
		angryCar(new Avante());
		angryCar(new Spark());
	}
	static void angryCar(Car car) {
//		car.move();
//		car.moveSonata(); // 오류 
		if(car instanceof Sonata) {
		((Sonata)car).moveSonata();
		}else if(car instanceof Avante) {
		((Avante)car).moveAvante();
		}else if(car instanceof Spark) {
		((Spark)car).moveSpark();
		}
	}
}

class Car{
	public void move() {
		System.out.println("Car가 이동합니다.");
		}
	public void sound() {
		System.out.println("Car의 빵빵");
	}
}

class Sonata extends Car{
	public void moveSonata() {
		System.out.println("Sonata가 이동합니다.");
	}
}

class Avante extends Car{
	public void moveAvante() {
		System.out.println("Avante가 이동합니다.");
	}
}

class Spark extends Car{
	public void moveSpark() {
		System.out.println("Spark가 이동합니다.");
	}
}