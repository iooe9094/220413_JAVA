package ex6_12;

public class Ex6_12 {

	public static void main(String[] args) {
		// 기본 생성자를 이용하여 객체 생성 , 좋지 않은 코딩
		Car c1 = new Car();
		
		// c1 객체 초기
		c1.color = "white";
		c1.gearType = "auto";
		c1.door = 4;
		
		// 좋은 코딩
		// 매개변수 3개짜리 생성자호출 : 변수 초기화
		// 위의 new "Car"와 밑의 new "Car" 동일 : 오버로딩
		Car c2 = new Car("White", "auto", 4);
		
		System.out.println("c1의 color = " + c1.color + " gearType = "
				+ c1.gearType + " door = " + c1.door);
		System.out.println("c2의 color = " + c2.color + " gearType = "
				+ c2.gearType + " door = " + c2.door);
	}
}