package com.javaex.ex05;

public class Depart extends Employee{

	//필드
	private String part;
	
	//생성자
	public Depart() {
	}
	
	public Depart(String name, int salary, String part) {
		super(name, salary);
		this.part = part;
	}
	
	//메소드-gs
	public String getPart() {
		return part;
	}

	public void setPart(String part) {
		this.part = part;
	}
	
	//메소드-일반
	public void showInformation() {
		System.out.println("이름: "+super.getName()+"\t"+"연봉: "+super.getSalary()+"\t"+"부서: "+part);
	}

}
