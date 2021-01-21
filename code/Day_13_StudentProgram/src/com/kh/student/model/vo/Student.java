package com.kh.student.model.vo;

public class Student {
	// 멤버변수 
	private int classNumber;
	private String name;
	private int age;
	private String address;
	private double grade;
	
	// 생성자 
	public Student() {} // 기본 생성자 
	public Student(int classNumber, String name, int age, String address, double grade) {
		super();
		this.classNumber = classNumber;
		this.name = name;
		this.age = age;
		this.address = address; 
		this.grade = grade;
	}
	// 메소드 
	public int getClassNumber() {
		return classNumber;
	}
	public void setClassNumber(int classNumber) {
		this.classNumber = classNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getGrade() {
		return grade;
	}
	public void setGrade(double Grade) {
		this.grade = grade;
	}
	
	@Override
	public String toString() {
		return "Student [classNumber=" + classNumber + ", name=" + name 
					+ ", age=" + age + ", address= " + address 
					+ ", grade=" + grade + "]";
	}
	
	
}
