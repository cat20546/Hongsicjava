package encap.shop;

public class Product {
	// 1. 멤버 변수 선언부
	private String prodCode;
	private String prodName;
	private int price;
	private int quantity;

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
	
	/** --------------------------------------------------------
	* 멤버 변수 필드의 가시성을 private 으로 선언하면
	* 다른 모든 클래스에서 접근이 불가능해진다.
	* 따라서 숨겨진 필드에 접근할 수 있는 저용 메소드 쌍을
	* 정의해야 한다.
	* ==========================================================
	* 접근자 메소드 : getter
	* ----------------------------------------------------------
	* 1. get 으로 시작
	* 2. get 뒤에 오는 이름은 접근하려는 멤버변수 명의
	*    첫 글자만 대문자화 하여 정의한다.
	* 3. 메소드 매개변수가 없다.
	* 4. 메소드 리턴 타입을 접근하려는 멤버변수 타입과 맞춘다.
	* 5. 멤버변수의 타입이 boolean 이면
	* 	 get 이 아니라 is로 시작하도록 작성
	* 6. getXxx() , isXxx() 형태로 정의
	* ==========================================================
	* 수정자 메소드 : setter
	* ----------------------------------------------------------
	* 1. set 으로 시작
	* 2. set 뒤에 오는 이름은 수정하려는 멤버변수 명의
	*    첫 글자만 대문자화하여 정의한다.
	* 3. 메소드 매개 변수는 수정하려는 멤버변수의 타입과
	* 	  맞추고, 보통 같은 이름으로 설정
	* 4. 리턴 타입은 void로 한다.
	* 5. 보통 안쪽의 로직은 
	* 	 this.member변수 = 매개변수; 작성
	* ===========================================================
 	*/
	
	/** prodCode 의 접근자 */
	public String getProdCode() {
		return this.prodCode;
	}
	
	/** prodCode 의 수정자 */
	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}
	
	
	/** prodName의 접근자 */ 
	public String getProdName() {
		return prodName;
	}
	/** prodName의 수정자 */
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	/** price의 접근자 */
	public int getPrice() {
		return price;
	}
	/** price의 수정자 */
	public void setPrice(int price) {
		this.price = price;
	}
	/** quantity의 접근자 */
	public int getQuantity() {
		return quantity;
	}
	/** quantity의 수정자*/
	public void setQuantity(int quantity) {
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
