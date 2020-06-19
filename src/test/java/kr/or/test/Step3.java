package kr.or.test;

import java.util.Calendar;

public class Step3 {

	public static void main(String[] args) {
		System.out.println("-----------------------");
		System.out.println("외부 라이브러리를 사용한 열거형 자료형 소스");
		//열거형 - enum
		Week today = null;
		Calendar cal = Calendar.getInstance();//인스턴스 cal변수 생성
		//자바 자체 기능 중 하나인 DAY_OF_WEEK 설정 
		int week = cal.get(Calendar.DAY_OF_WEEK);
		//Calendar 클래스에서 리턴 값으로 받은 오늘 요일에 대한 정의 값(수)는" + week
		//조건문 switch - case 사용해서 결과 도출 (if - else 과 같은 개념의 조건문)
		
		switch(week) {
		case 1:
			today = Week.일; break;
		case 2:
			today = Week.월; break;
		case 3:
			today = Week.화; break;
		case 4:
			today = Week.수; break;
		case 5:
			today = Week.목; break;
		case 6:
			today = Week.금; break;				
		case 7:
			today = Week.토; break;		
		}
		
System.out.println("오늘은: "+ today + "요일 입니다.");
// 위의 switch와 같은 개념의 조건문 if - else 사용해서 결과 도출
		if(today == Week.월) {
			System.out.println("월요일은 활기가 넘칩니다.");
		} else {
			System.out.println("열심히 자바 공부합시다.");
		}
		
	}

}
