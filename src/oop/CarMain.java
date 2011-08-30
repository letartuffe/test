package oop;

//기본 생성자 이용
//Car 클래서의 참조 변수  c1 생성
//기본 생성자 이용하여 흰색, 오토 타입의 문 3개 짜리 자동차 만들기.

public class CarMain {
	
	public static void main(String[] args) {
		
		Car c = new Car();
		c.color = "흰색";
		c.gearType = "오토";
		c.door = 3;
	}
}
