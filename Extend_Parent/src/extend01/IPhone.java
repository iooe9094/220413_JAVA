package extend01;

public class IPhone extends Phone{
//  공통요소를 지우고 Phone.java에 옮김
//	String OS;
//	String numbers;
	String battery;
	
	public void call() {
		System.out.println("전화걸기");
	}
	
	public void sms() {
		System.out.println("문자보내기");
	}
}
