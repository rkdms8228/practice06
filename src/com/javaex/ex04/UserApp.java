package com.javaex.ex04;

public class UserApp {

	public static void main(String[] args) {
		
		//배열 생성
		User[] Array = new User[3];
		
		//고객 및 직원 정보
		User uc01 = new Customer("jws", "j1234", "정우성", 1000);
		User ue01 = new Employee("yhr", "y2345", "이효리", 2000);
		User ue02 = new Employee("master", "m7788", "운영자", 5000000);
		
		//배열에 정보 넣기
		Array[0] = uc01;
		Array[1] = ue01;
		Array[2] = ue02;
		
		//반복문으로 출력
		for(int i = 0; i<Array.length; i++) {
			Array[i].showInfo();
		}
		
		//다운캐스팅으로 출력
		System.out.println("운영자의 월급은 "+((Employee)Array[2]).getSalary()+"원 입니다.");
		
	}

}
