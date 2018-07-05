package control.loop;

/**
 * 1~100 사이의 홀수의 합을 구하는 클래스
 * 
 * while 구문을 활용
 * 
 * @author JACK
 *
 */
public class SumOfOdds {

	public static void main(String[] args) {
		// 1. 선언, 2. 초기화
		// 1 ~ 100까지 증가시킬 값을 저장하는 변수 선언
		int number = 1;
		// 홀수의 합을 저장할 변수, 초기화
		int sum = 0;

		// 3. 사용
		/*
		 * while (number <=100){ sum += number; number+= 2; }
		 * System.out.printf("1부터 100사이 홀수의 합은 %d입니다.",sum);
		 */

		while (number <= 100) {
			// number가 현재 홀수인가?
			if ((number % 2) == 1)
				sum += number;

			number++;
		}

		System.out.printf("1부터 100사이 홀수의 합은 %d입니다.", sum);

	}
}
