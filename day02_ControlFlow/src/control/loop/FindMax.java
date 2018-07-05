package control.loop;

import java.util.Scanner;

public class FindMax {

	public static void main(String[] args) {
		int input, max = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("양수를 입력(끝내려면 0 입력): ");
		input = scan.nextInt();
		
		do{
			input = scan.nextInt();
			if (input>max)
				max = input;
		} while (input != 0 && input > 0);

		System.out.printf("최댓값은 %d입니다. %n", max);
	}

}
