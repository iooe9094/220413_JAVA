package ex6_11;

class Data_1 {
	int value;
	// 개발자가 생성자를 하나도 많들지 않을 경우, 자바가 자동 생성해준다.
	// 내부적으로 Data_1() {}를 자바가 자동으로 생성함.
}

class Data_2 {
	int value;
	String singer;
	
	// 매개변수 없는 생성자(기본 생성자) 하나는 반드시 생성해야 함
	// 생성자가 한개라도 없는 경우는 생성해줘야 한다.
	// 초기화를 목적으로 인스턴스 초기화 형식으로 생성해야함
	Data_2() {
		value = 1;
		singer = "";
	}
	
	// 매개변수 1개짜리 생성자 / 개발자가 하나 만들어 놓은 상태
	// 위의 Data_2() {} 가 없으면 에러 발생
	// 그 전에 매개변수 없는 기본 생성자를 반드시 만들어야 한다.
	Data_2(int x) {
		value = x; // class에 있는 instance 변수
	}
}

public class Ex6_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    Data_1 d1 = new Data_1();
	    Data_2 d2 = new Data_2();
	}

}
