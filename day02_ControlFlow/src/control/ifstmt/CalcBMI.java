package control.ifstmt;

import java.util.Scanner;

public class CalcBMI {

	public static void main(String[] args) {
		double kg = 0.0;
		double m  = 0.0;
		

		Scanner scan = new Scanner(System.in);
		System.out.println("몸무게를 입력해주세요.");
		kg = scan.nextDouble();
		System.out.println("키를 입력해주세요.");
		m = scan.nextDouble();
		double BMI = kg/(m*m);
		
		if(BMI<15.0){
			System.out.println("병적인 저체중");
		} else if(BMI>=15.0&&BMI<18.5) {
			System.out.println("저체중");
		} else if(BMI>=18.5&&BMI<23.0) {
			System.out.println("정상");
		} else if(BMI>=23.0&&BMI<27.5) {
			System.out.println("과체중");
		} else if(BMI>27.5&&BMI<=40.0) {
			System.out.println("비만");
		} else if(BMI>40.0) {
			System.out.println("병적인 비만");
		}
		
		System.out.printf("비만도는 %f 입니다.", BMI);
	}
}
