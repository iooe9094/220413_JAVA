package getterSetter00;

public class EmployeeTtest {

	public static void main(String[] args) {
		
		Employee hong = new Employee("skcc12345", "홍길동", 2000000);
		Employee lee = new Employee("skcc56789", "이순신", 2000000);
		
		// 이순신의 월급이 올랐습니다.
		// 메소드 만들기 : 기본월급 + 인센티브(1000000)
	    lee.ups(1000000);
		
		// getter 출력
		// 홍길동의 이름과 월급을 출력
		// 이순신의 이름과 월급을 출력
		System.out.println(hong.getName() + "의 월급은 " + hong.getPayment());
		System.out.println(lee.getName() + "의 월급은 " + lee.getPayment());
	}

}
