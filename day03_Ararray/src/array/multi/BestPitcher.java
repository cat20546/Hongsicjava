package array.multi;

import java.util.Scanner;

/**
 * 야구 구단의 1~5선발 선수의 방어율을 입력하고 그 중 가장 방어율이 낮은 최고의 투수를 찾는 클래스
 * 
 * @author JACK
 *
 */
public class BestPitcher {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double[][] ERA = new double[3][5];
		double min = 10.0;
		
		
		// 각 팀별로 각 투수의 방어율 입력받아 배열에 저장한다.
		System.out.println("1선발 2선발 3선발 4선발 5선발 방어율 입력");
		for (int i = 0; i < ERA.length; i++) {

			System.out.println((i + 1) + "번째 팀 1 ~ 5선발 투수 방어율 :");
			for (int j = 0; j < ERA[i].length; j++) {
				ERA[i][j] = scan.nextDouble();
				if (ERA[i][j]<min ){
					
					min = ERA[i][j];
				
				}
					
					
					
			}
		}

	-	System.out.println("최고의 투수는");
		for (int i = 0; i < ERA.length; i++) {
			for (int j = 0; j < ERA[i].length; j++) {
				
				
			
				
			}
		}

		System.out.println("최고의 팀은"+ + min+"입니다");
	}
}
