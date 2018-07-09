package practice.methods;

public class PracticeExam {

	public void printTenTimes(int input) {
		for (int idx = 0; idx < 10; idx++) {
			input=input+10; 
			System.out.println(input);
		}
	}

	public void printSomebodysMessage(String message, String name) {
		System.out.println(name + "의 메세지 : " + message);
	}
	
	public void printMessage(String message) {
		System.out.println(message);
	}
   
	public String returnoriginalMessage(String message) {
		return message;
	}
	
	public int addTen(int input) {
		return input + 10;
	}
	
	public int subtractTen(int input) {
		return input - 10;
	}
    
	public double makeDouble(double input) {
		return input * 2.0;
	}
	
	public double substractFivePointFive(double input) {
		return input - 5.5;
	}
	
	public String makeFullName(String name, String surname) {
		return name + surname;
	}
	
	public int add(int x, int y) {
		return x + y;
	}
	
	public double add(double x, double y) {
		return x + y;
	}

	
	
	public void printMsgManyTimes(String message, int input) {
		for (int idx = 0; idx < input; idx++) {
			System.out.print(message);
		}
	}
	
	
	public void arithmetic(int x, int y, String operator){
		switch(operator){
		case "+" : 
			System.out.println(x+y);
			break;
		case "-" : 
			System.out.println(x-y);
			break;
		case "*" :
			System.out.println(x*y);
			break;
		case "/" :
			System.out.println(x/y);
			break;
		}
		System.out.println(operator);
	}
	
	public double arithmetic2(int x, int y, String operator){
		switch(operator){
		case "+" : 
			System.out.println(x+y);
			break;
		case "-" : 
			System.out.println(x-y);
			break;
		case "*" :
			System.out.println(x*y);
			break;
		case "/" :
			System.out.println(x/y);
			break;
		}
		return x;
	}
	
	/*
		public int isEven(int input){
		
			return input%2;
		}

		public int absolute(int x){
		if(x<0){
		x=-x;
		} else { x=x;
		} return x;
		}

		public void findMultiple(int x) {
		for(int idx =1 ; idx<100; idx ++){
		System.out.println(x*idx)<100;
		}
		}

		public String decideSign(int x){
		String minus = "음의정수";
		String zero = "정수0";
		String plus = "양의정수";
		if(x<0) {
			minus;
		} else if(x==0) { zero;
		} {else puls;
		} return x;
		}
		
		public double calCircleArea(int r) {
		final PI = 3.14;
		double r ;
		double Circle Area = pi*r*r;

		return Circle Area;
		}
*/
		 

		}


