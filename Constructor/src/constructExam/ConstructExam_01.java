package constructExam;

public class ConstructExam_01 {

		// 인스턴스변수
		int age;
		double money;
		
		// 생성자
		// 기본 생성자 : 매개변수가 없음
		ConstructExam_01() {
			age = 30;
			money = 6800000.0;
		}
		
		// 매개변수 1개짜리 생성자
		ConstructExam_01(int x) {
			age = x;
			money = 6800000.0;
		}
		
		// 매개변수 1개짜리 생성자
		ConstructExam_01(double y) {
			age = 30;
			money = y;
		}
		
		// 매개변수 2개짜리 생성자
		ConstructExam_01(int x, double y) {
			age = x;
			money = y;
		}
	}
