package getterSetter02;

public class Access {
	
	public static void main(String[] args) {
		Sample aClass = new Sample();
		
//		setter로 값을 저장하고 getter로 출력해보셈
//		a = 10, b = 20, c = 30
//		출력 : a = 10, b = 20, c = 30
//		맴버 변수에 매개변수 값을 저장 : aClass.setA(10);
//		맴버 변수의 값을 가져오기 : aClass.getA();
		
		aClass.setA(10);
		aClass.setB(20);
		aClass.setC(30);
		
		System.out.println("a = " + aClass.getA() + ", " + "b = " + aClass.getB() + ", " + "c = " + aClass.getC());
	}
}