package practice.methods;

public class DefineMethodsTest {

	public static void main(String[] args) {
		PracticeExam methods;
		
		// 2. 초기화
		methods = new PracticeExam();
		
		methods.printTenTimes(10);
		methods.printSomebodysMessage("하이", "홍식");
		methods.printMessage("하이");
		String message = methods.returnoriginalMessage("하이");
		System.out.println(message);
		int result = methods.addTen(10);
		System.out.println(result);
		int result2 = methods.subtractTen(10);
		System.out.println(result2);
		double result3 = methods.makeDouble(10);
		System.out.println(result3);
		double result4 = methods.substractFivePointFive(10);
		System.out.println(result4);
		String result5 = methods.makeFullName("윤", "홍식");
		System.out.println(result5);
		
		int result6 = methods.add(5, 5);
		System.out.println(result6);
		
		double result7 = methods.add(5, 5);
		System.out.println(result7);
		
		methods.printMsgManyTimes("홍식", 3);
		
		System.out.println("");
		methods.arithmetic(5, 5, "*");
		
		
		double result9 = methods.arithmetic2(5, 10, "-");
		
	}
	}


	


