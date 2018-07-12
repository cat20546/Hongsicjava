package inheritance.basic.product;

public class Product {
	// 1. 멤버 변수 선언부
	String prodCode;
	String prodName;
	int price;
	int quantity;

	// 2. 생성자 선언부
	Product() {

	}

	Product(String prodCode) {
		this.prodCode = prodCode;
	}

	Product(String prodCode, String prodName) {
		this(prodCode);
		this.prodName = prodName;
	}

	Product(String prodCode, String prodName, int price) {
		this(prodCode, prodName);
		this.price = price;
	}

	Product(String prodCode, String prodName, int price, int quantity) {
		this(prodCode, prodName, price);
		this.quantity = quantity;
	}

	public void print() {
		System.out.printf("제품 정보 [제품코드 : %s, 제품명 : %s, 가격 : %d, 재고 수량 : %d]%n", prodCode, prodName, price, quantity);
	}

	public int discount(double percentage) {
		// percentage > 0
		int price = (int) this.price;
		if (percentage > 0) {
			price = price -(int) (this.price * (percentage / 100));
		} 

		return price;

	}

	public void sell(int amount) {
		// 재고 수량이 출고하려는 수량보다 크거나 같을때만
		// 출고함.
		if(this.quantity >= amount){
			this.quantity -= amount;
		}
	}

	public void buy(int amount) {
		// 입고된 만큼 재고수량 증가 후 저장반영
		this.quantity += amount;
	}
	
	// Object 클래스에서 나도 모르는 사이 상속받은
	// toString() 메소드를 재정의 해보자.
	// 1. 메소드 헤더가 동일 : 리턴타입 메소드 이름 (매개변수)
	
	public String toString() {
		String strProduct = String.format("제품 정보 [제품코드 : %s, 제품명 : %s, 가격 : %d, 재고 수량 : %d]%n", prodCode, prodName, price, quantity);
		return strProduct;
	}

}
