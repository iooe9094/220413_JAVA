package getterSetter01;

public class BankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 홍길동 씨가 통장을 개설
		JBank hong = new JBank("홍길동", 12500);
		
		// 이순신 씨가 통장을 개설
		JBank lee = new JBank("이순신", 59000);
		
		// 홍길동이 통장에 금액을 30000 다시 넣음
		// 이순신이 통장에 금액을 70000 다시 넣음
		// setter 재저장
		hong.setPrice(30000);
		lee.setPrice(70000);
		
		
		// getter를 이용해서 출력
		// 홍길동의 통장 금액은 30000 입니다
		// 이순신의 통장 금액은 70000 입니다
		System.out.println(hong.getName() + " 통장 금액은 " + hong.getPrice());
		System.out.println(lee.getName() + " 통장 금액은 " + lee.getPrice());

	}

}
