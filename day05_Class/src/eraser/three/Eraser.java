package eraser.three;

/**
 * 칠판 지우개를 정의하는 클래스 -------------------------------------------- 칠판 지우개의 속성을
 * 정의하기 위하여 가로 : width : double 세로 : height : double 높이 : depth : double 겹 :
 * layer : int 네 개의 멤버 변수를 선언 -------------------------------------------- 기본
 * 생성자 : 매개변수를 받지 않는 생성자 매개변수를 받는 생성자 두개를 정의 매개변수를 받는 생성자는 네 개의 필드 모두에 대해서 매개변수를
 * 받도록 정의한다. -------------------------------------------- 칠판 지우개의 상태를 출력 :
 * print() : void 지우개의 한 겹을 제거 : peel() : void
 * --------------------------------------------
 * 
 * @author JACK
 *
 */
public class Eraser {
	// 1. 멤버변수 선언부
	/** 지우개의 번호 */
	int serial;
	/** 지우개 가로 길이*/
	double width;
	/** 지우개 세로 길이*/
	double height;
	/** 지우개 높이 */
	double depth;
	/** 지우개 겹*/
	int layer;
	
	/** 지우개의 일련 번호를 얻기 위한 클래스 변수  (공용으로 쓰기위해 변수 선언 eraser1, eraser2가 공통으로 접근가능함)*/
	static int count = 0;
	
	
	
	// 2. 생성자 선언부
	
	// 기본 생성자 선언 
	Eraser() {
		this.serial = ++count;
	}
	
	/**
	 * width 필드만 초기화하는 생성자
	 */
	Eraser(double width){
		this();
		this.width = width;
	}
	/**
	 * width, height 필드만 초기화하는 생성자
	 */
	Eraser(double width, double height){
		this(width);
		this.height = height;
	}
	/**
	 * width, height, depth 필드만 초기화하는 생성자
	 */
	Eraser(double width, double height, double depth){
		this(width,height);
		this.depth = depth;
	}
	/**
	 * width, height, depth, layer 필드만 초기화하는 생성자
	 */

	
	
	// 네 개의 필드 모두에 대해서 매개변수를 받도록 정의
	Eraser(double width, double height, double depth, int layer) {
		this(width,height,depth);
		this.layer = layer; //변수이름이 똑같으면 가장 가까운곳에서 찾게돼 있음
	}

	
	
	
	// 3. 메소드 선언부
	public void peel() {
		// 남아있는 겹의 수가 -값이 될 수는 없으므로
		// if 구문을 사용하여 값을 체크
		
		if ((layer - 1) >= 0) {
			layer -= 1;

		}
	}

	public void print() {
		System.out.printf("일련번호 : %d, 가로: %f, 세로: %f 높이: %f 두께: %d%n ",serial, width, height, depth, layer);

	}

}
