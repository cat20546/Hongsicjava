package control.loop;

/**
 * 중첩 for loop를 이용하여 구구단을 출력 2~9단을 출력 각 단을 시작할 때 단의 제목을 출력
 * 
 * @author JACK
 *
 */
public class NineNine2 {

	public static void main(String[] args) {
		// 1. 선언, 2. 초기화, 3. 사용

		// 외부 for 반복문 : 2 ~ 9 단을 반복

		for (int stage = 2; stage <= 7; stage++) {

			if (stage <= 4) {

				System.out.printf("%d단 ", stage);

			} else if (stage == 5) {

				System.out.printf("%n%d단 ", stage);
			} else if (stage <= 7) {
				System.out.printf("%d단 ", stage);
			}

			/*
			 * for(int times = 1; times <=9; times++) {
			 * System.out.printf(" %n%d x%d = %d ", stage, times, stage *
			 * times);
			 * 
			 * }
			 */

		}
		/*
		 * for(int stage = 2; stage <= 9; stage++){
		 * System.out.printf("%n%d 단%n", stage); //내부 for 반복문 : 1 ~ 9 곱해지는 수를 반복
		 * for(int times = 1; times <=9; times++) {
		 * System.out.printf("%d x %d = %2d%n", stage, times, stage * times); }
		 * 
		 * }
		 */
	}

}
