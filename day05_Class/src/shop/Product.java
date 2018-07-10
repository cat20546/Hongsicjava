package shop;

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
		System.out.printf("제품 정보 [제품코드 : %s, 제품명 : %s 가격  %d: ,재고 수량 : %d]%n", prodCode, prodName, price, quantity);
	}

	public int discount(double percentage) {
		// percentage > 0
		int price = (int) this.price;
		if (percentage > 0) {
			price = price - (int) (this.price * (percentage / 100));
		}

		return price;

	}

	public void sell(int amount) {
		// 재고 수량이 출고하려는 수량보다 크거나 같을때만
		// 출고함.
		if (this.quantity >= amount) {
			this.quantity -= amount;
		}
	}

	public void buy(int amount) {
		// 입고된 만큼 재고수량 증가 후 저장반영
		this.quantity += amount;
	}

	/**
	 * 입력된 값으로 제품 정보를 수정하여 저장
	 * 
	 * @param prodCode
	 * @param prodName
	 * @param price
	 * @param quantity
	 */
	public void set(String prodCode, String prodName, int price, int quantity) {
		if (!this.prodCode.equals(prodCode)) {
			this.prodCode = prodCode;
		}

		if (this.prodName.equals(prodName)) {
			this.prodName = prodName;
		}
		if (this.price != price) {
			this.price = price;
		}
		if (this.quantity != quantity) {
				this.quantity = quantity;
			}
		}

	}

