package gettersetter;

public class Exercise01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
//		매개변수 없는 기본 생성자 MyType() 호출
		MyType kor1 = new MyType();
		
//		매개변수가 있는 생성자 MyType() 호출
		MyType kor2 = new MyType(100, 200, 300);
		
//		매개변수가 없는 기본생성자 출력
		System.out.println("a = " + kor1.getA());
		System.out.println("b = " + kor1.getB());
		System.out.println("c = " + kor1.getC());
		
//		매개변수가 있는 생성자 출력
		System.out.println("a = " + kor2.a);
		System.out.println("b = " + kor2.b);
		System.out.println("c = " + kor2.c);
		
	}

}
