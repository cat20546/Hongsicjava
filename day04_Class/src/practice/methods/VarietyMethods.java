package practice.methods;

/**
 * 메소드 작성 실습 클래스
 * 
 * @author JACK
 *
 */
public class VarietyMethods {

	private static final int F = 0;
	/**
	 * 화면에 hello, world! 를 출력하는 메소드
	 */
	public void  sayHello() {
		System.out.println("hello, world!");
	}

	/**
	 * 매개변수로
	 * 유명인(명사)의 이름을 입력(name) 받고 
	 * 그 사람이 한 유명한 문구(maxim)를 입력 받아
	 * 
	 * 000(이)가 말하길 "....." 라고 하였다.
	 * 라는 문장을 출력하는 메소드
	 * maxims를 정의하라
	 */
	
	
	
	
	 public void maxims(String name, String maxim){
		 System.out.printf("%s 이(가) 말하길%n\"%s\" 라고 하였다." ,name, maxim);
	 }
	
	/**
	 * 어떤 사람의 이름, 생년, 출생월을 매개변수로 입력받아
	 * 
	 * 000는  XXXX년 XX월 생입ㄴ디ㅏ.
	 * 
	 * 라는 문장으로 출력하는 메소드
	 * birthYearMonth 라는 메소드를 디자인
	 * @param name  : String
	 * @param year  : int
	 * @param month : int
	 */
	
	 public void birthYearMonth(String name, int year, int month){
		 System.out.printf("%s는 %d년 %d월 생입니다.",name,year,month);
	 }
	 
	 
	 /**
	  * 출력할 단의 숫자를 입력받아
	  * 해당 단의 구구단을 출력하는 메소드
	  * 
	  * 출력의 첫 줄에 X 단 이라는 제목을 출력
	  * 
	  * printNineNineTable 을 디자인
	  * @param stage :int
	  */
	 
	 public int NineNineTable(int stage){
		
		 for(int index = 1; index<10; index++){
			 for(int index2= 1; index2<10; index2++){
				 System.out.println(index + "x" + index2 + "=" + index*index2);
			 }
		 }
		return stage;
			 
			 
	 }
	 
	 
	 /**
	  * 출력할 단의 숫자를 가지고 있는 int 배열을 
	  * 매개 변수로 입력받아
	  * 입력된 배열의 원소인 각 숫자에 대해 
	  * 구구단을 출력하는 메소드
	  * printNineNineTableArray 를 디자인
	  * @param stages : int 배열
	  */

	 int printNineNineTableArray(int stages[][]){
		int [][] stages1;
		 stages1 = new int [9][9];
		 
		 for(int index=1; index<stages1.length; index++){
			 for(int index2=1; index2<stages1[9].length; index2++){
				 System.out.println(index + "x" + index2 + "=" + index*index2);
			 }
		 }
		 
		 
		 return stages1[9][9];
		 
		 
	 }
	 /**
	  * 입력된 화씨온도를 섭씨온도로 변환하여 
	  * 변환된 섭씨온도를 리턴하는 메소드
	  * fahToCel을 디자인
	  * 
	  * 변환 공식 : 5 / 9 * (F - 32)
	  * @param fah : double : 변환할 화씨 온도 값
	  * @return 변환된 섭씨 온도 값
	  */
	 
	 public double fahToCel(double fah){
		
		  fah = 5/9*(F-32); 
		  System.out.println(fah);
		 
		 return fah;
		 
	 }
	 
	 /**
	  * 키(cm), 몸무게(kg)을 매개변수로 입력받아
	  * BMI 지수를 계산하여 비만도 판정 결과를 리턴하는 메소드
	  * calcBmi를 디자인
	  * 
	  * 몸무게(g) / 키(m)의 제곱
	  * 
	  * 15.0미만			병적인 저체중
	  * 15.0이상 18.5미만	저체중
	  * 18.5이상 23.0미만	정상
	  * 23.0이상 27.5이하 	과체중
	  * 27.5초과 40.0이하	비만
	  * 40.0초과			병적인 비만
	  * 
	  * @param height : double
	  * @param weight : double
	  * @return 비만도 판정 결과 문자열
	  */
	 
	 double calcBmi(double height, double weight){
		 
		 double calBmi = weight/height*height;
		 
		 return calBmi;
	 }
	 
	 
	 /**
	  * 입력된 두 정수 중에서 작은 수를 찾아 리턴하는 메소드
	  * min 을 디자인
	  * @param input1
	  * @param input2
	  * @return : 둘 중 작은 정수
	  */
	 
	 
	 
	 /**
	  * 입력된 두 정수 중에서 큰 수를 찾아 리턴하는 메소드
	  * max 를 디자인
	  * @param input1
	  * @param input2
	  * @return : 둘 중 크 정수
	  */
	 
	 /**
	  * 정수가 저장된 int 배열을 매개변수로 입력받아
	  * 그 배열의 각 원소의 합을 구하여 리턴하는 메소드
	  * soumOfArray 를 디자인
	  * @param numbers : int 배열
	  * @return numbers 배열의 각 원소의 합
	  * 
	  */
	 
	 public int sumOfArray(int[] numbers){
		 int sum = 0;
		 for (int num: numbers) {
			 sum += num;
		 } 
		 return sum;
	 }
	 
	 /**
	  * 정수가 저장된 int 배열을 매개변수로 입력받아
	  * 그 배열의 각 원소드의 평균을 구하여 리턴하는 메소드
	  * avgOfArray를 디자인
	  * @param numbers
	  * @return numbers 배열의 각 원소의 평균
	  */
	 
	 /**
	  * car 타입의 연산자와 두 개의 정수를 매개변수로 입력받아
	  * 
	  * 입력된 연산자가 '+' 일 때만
	  * 두 정수의 합을 구하여 덧셈의 결과를 출력하는 메소드
	  * adder를 디자인
	  * @param op : char
	  * @param x : int
	  * @param y : int
	  */
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}