package control.loop;
/**
 *   1~100 사이의 짝수의 합을 구하는 클래스
 * @author JACK
 *
 */
public class SumOfEvens {

	public static void main(String[] args) {
		// 1. 선언, 2. 초기화
		int number = 1;
		int sum = 0;
		
		// 3. 사용
		while(number<=100){
			
			if(number%2==0){
				sum+=number;
			}
				number++;
			
			}
		System.out.println("1~100까지 짝수의 합은"+sum+"입니다.");
	}

}
