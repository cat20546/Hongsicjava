package type.primitive;

/**
 * 실수형 타입인 float 타입을
 * 테스트하는 클래스이다.
 * @author JACK
 *
 */
public class FloatTest {

	public static void main(String[] args) {
		// 1. 선언
		float pi1;
		double pi2;
		
		// 2. 초기화
		pi1 = 3.14f; //f를 안 붙인다면 더큰 double로 선언하겠다. 이뜻이됨
		pi2 = 3.14;
		
		// 3. 사용 : 변수 값 출력
		System.out.println("float pi1=" + pi1);
		System.out.println("double pi2=" + pi2);
		
		pi1 = 3.14159265367979323846F;
		pi2 = 3.14159265367979323846;
	
		System.out.println("float pi1=" + pi1);
		System.out.println("float pi2=" + pi2);
	
	}

}
