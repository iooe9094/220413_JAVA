package exercise05;

public class Exercise05 {

	public static void main(String[] args) {
		// 클래스 MyType을 만들
		// 생성자를 이용해서 초기화하는 코드로 변경
		// 매개변수 없는 기본생성자 MyType() 호출
//      MyType kor1 = new MyType();
		
		// 2번째 방법, 해당 방법이 더 좋음
		MyType kor1 = new MyType(100, 200, 300);
		
		System.out.println("a = " + kor1.a);
		System.out.println("a = " + kor1.b);
		System.out.println("a = " + kor1.c);
	}

}
