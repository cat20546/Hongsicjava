package dividerscope;

/**
 * level1() -> level2() -> level3() 의 순서로 메소드 호출이 일어나는 클래스
 * 
 * level3() 메소드 안에는 0으로 나눈는 상황이 발생할 수 있는 연산을 수행한다.
 * 
 * level3() 에서 발생한 예외가 메소드 호출의 반대순서로 전파되는 것을 확인
 * 
 * @author JACK
 *
 */
public class DividerScope {

	public void level3(int input) throws DivideZeroException{
		// 1. 선언 : 나눗셈을 수행할 Divider 객체 참조 변수
		Divider div;
		
		// 2. 초기화 
		div = new Divider();

		// 3. 사용
		System.out.println("== level3이 시작되었습니다. ==");

		div.divide(input);

		System.out.println("== level3이 종료되었습니다. ==");

	}

	public void level2() {
		System.out.println("== level2 가 시작되었습니다. ==");
		
			try {
				level3(0);
			} catch (DivideZeroException e) {

				e.printStackTrace();
			}
		
		System.out.println("== level2 가 종료되었습니다. ==");
	}

	public void level1() {
		System.out.println("== level1 이 시작되었습니다. ==");
		level2();
		
		System.out.println("== level1 이 종료되었습니다. ==");

	}

}
