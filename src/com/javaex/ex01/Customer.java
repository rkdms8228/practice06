package com.javaex.ex01;

public class Customer extends Person{
	
	//필드
	private int cNo;
	private int point;
	
	//생성자
	public Customer() {
	}
	
	public Customer(String name, String hp, int cNo, int point) {
		super(name, hp);
		this.cNo = cNo;
		this.point = point;
	}

	//메소드-gs
	
	
	//메소드-일반
	@Override
	public String toString() {
		return "Customer [name=" + super.name + ", hp=" + super.hp + ", cNo=" + cNo + ", point=" + point + "]";
	}
	
	public void showInfo() {
		System.out.println("#이름: "+super.name+", #핸드폰: "+super.hp+", #고객 번호: "+cNo+", #포인트 점수: "+point);
	}
	
}
