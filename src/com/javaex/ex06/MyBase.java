package com.javaex.ex06;

public class MyBase extends Base{

	//필드
	
	//생성자
	
	//메소드-gs
	
	//메소드-일반
	public void afternoon() {
		System.out.println("오후");
	}
	
	@Override
	public String toString() {
		return  super.getDay()+"에는 열심히 수업듣자"+"\n"+super.getNight()+"\n"+afternoon+"도 "+super.getDay()+"과 마찬가지로 공부해야 합니다.";
	}
    
}
