package control.swtchstmt;

import java.util.Scanner;

/**
 * 다중 선택 if 구문을 사용하여 다음의 기준으로
 * 90점 이상 A
 * 80 ~ 89 B
 * 60 ~ 79 C
 * 40 ~ 59 D
 * 나머지 F
 * 
 * 입력된 점수에 대해 학점을 계산하는 클래스를 작성
 * 입력 int 변수명 score
 * 학점 char 타입 변수명은 grade 
 * @author JACK
 *
 */
public class ReportGrade {

	public static void main(String[] args) {
	
		// 1. 선언
		int score;
		char grade;
		Scanner scan;

		// 2. 초기화
		scan = new Scanner(System.in);
		
		System.out.println("0 ~ 100 사이의 정수를 입력하시오.");
		score = scan.nextInt();
		
		// 3. 사용
		
		switch (score/10) {	
		case 9 : case 10:
			grade = 'A';
			break;
		case 8 :
			grade = 'B';
			break;
		case 6 : case 7 :
			grade = 'C';
			break;
		case 4 : case 5:
			grade = 'D';
			break;
		default: 
			grade ='F';
			break;
		}
		
		System.out.printf("%d점에 해당하는 학점은 %c 입니다." ,score, grade);
	}

}
