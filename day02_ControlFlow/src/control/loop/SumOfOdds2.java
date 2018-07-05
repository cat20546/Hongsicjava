package control.loop;

/**
 * 1~100 사이의 홀수의 합을 for 반복문과 continue의 조합으로 구해보는 클래스
 * 
 * @author JACK
 *
 */
public class SumOfOdds2 {

	public static void main(String[] args) {
		// 1. 선언
		int sum;
		int idx;
		// 2.초기화
		
		//continue는 if ~ else로 변경가능
		for (sum = 0, idx = 1; idx <= 100; idx++) {
			if (idx % 2 == 0) {
				// idx 가 짝수
				continue; // continue 가 실행되면 ㅣ하 무시
							// 반복의 처음으로 되돌아감
							// 다음 반복을 수행
			}

			sum += idx;
		}
		System.out.printf("1 ~ 100 사이 홀수의 합 : %d%n", sum);

		
		for (sum = 0, idx = 1; idx <= 100; idx++) {
			if (idx % 2 == 0) {
			;	// idx 가 짝수
			}else { // continue 가 실행되면 ㅣ하 무시
							// 반복의 처음으로 되돌아감
							// 다음 반복을 수행
			

			sum += idx;
		}
		
		System.out.printf("1 ~ 100 사이 홀수의 합 : %d%n", sum);
	}

}
}