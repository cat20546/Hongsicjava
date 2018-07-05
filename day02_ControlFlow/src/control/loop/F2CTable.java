package control.loop;

/**
 * 화씨온도(F) -> 섭씨온도(C) 변환공식 C=5/9(F-32) 화씨온도 -> 섭씨온도 변환 표 출력 화씨온도 0.0도에서 10도씩
 * 증가시키면서 100.0도까지 출력 for loop 이용, 온도는 double 타입으로 계산
 * 
 * @author JACK
 *
 */
public class F2CTable {

	public static void main(String[] args) {
		
		double fah =0;
		double cel =0;
		
		
		for (fah=0; fah<=100; fah++) {
			
			if(fah%10==0){
				cel = 5.0/9.0*(fah-32.0);
				System.out.printf("%5.1f F = %5.1f C%n", fah, cel);
				//%5.1f 자릿수 소수첫째자리까지
			}
				/*System.out.printf("최종 fah=%5.1f%n", fah);*/
		}	
			
			}
	}


