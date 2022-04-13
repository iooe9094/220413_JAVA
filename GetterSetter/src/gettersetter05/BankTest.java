package gettersetter05;

public class BankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		홍길동 씨가 통장을 개설 했싐
		JBank hong = new JBank("홍길동", 12500);
//		이순신 씨도 통장을 개설 했싐
		JBank Lee = new JBank("이순신", 59000);
		
//		홍길동 씨가 통장에 금액을 30000 다시 넣었음.(setter로 재저장 ㄱ)
//		이순신 씨도 통장에 금액을 70000 다시 넣었음.(setter로 재저장 ㄱ)
		hong.setMoney(30000);
		Lee.setMoney(70000);
		
//		홍길동씨 통장 금액은 30000 입니다.
//		이순신씨 통장 금액은 70000 입니다.
		
		System.out.println(hong.name + " 씨가 통장에 금액은 " + hong.money + " 입니다.");
		System.out.println(Lee.name + " 씨가 통장에 금액은 " + Lee.money + " 입니다.");
	}

}
