package practice.methods;
/**
 * VarietyMethods 클래스를 테스트하는 클래스
 * 
 * @author JACK
 *
 */
public class MethodsTest {

	public static void main(String[] args) {
	    // 1. 선언
		VarietyMethods methods;
		
		// 2. 초기화
		methods = new VarietyMethods();
		
		// 3. 사용
		methods.sayHello();
		System.out.println("===================================");
		methods.maxims("소크라테스", "너 자신을 알라");
		System.out.println("===================================");
		methods.birthYearMonth("킬리앙 음바페", 1998, 12);
		System.out.println("===================================");
		methods.NineNineTable(5);
		System.out.println("===================================");
	/*	methods.printNineNineTableArray([9][9]);*/
		System.out.println("===================================");
		methods.fahToCel(100.0);
		System.out.println("===================================");
		
		System.out.println("===================================");
		
		System.out.println("===================================");
		
		System.out.println("===================================");
	}

}
