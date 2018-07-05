package control.ifstmt;

import java.util.Scanner;

public class MinMax {
/**
 * 
 * @param args
 */
	public static void main(String[] args) {
		// 1. 선언
		int x, y;
		int min, max;
		Scanner scan;
		
		// 2. 초기화
		scan = new Scanner(System.in);
		System.out.println("두 정수를 입력(space bar로 분리입력)");
	
	x = scan.nextInt();
	y = scan.nextInt();
	
	// 3. 사용 : if로직 전개
	if(x>y) {
		min = x;
		max = y;
	}else {
		min = y;
		max = x;
	}
	
	//출력
	
	System.out.printf("입력된 두 정수: %d,%d%n" ,x,y);
	System.out.printf("작은값 : %d%n", min);
	System.out.printf("큰값: %d%n", max);
	
	}
	
	
	}

