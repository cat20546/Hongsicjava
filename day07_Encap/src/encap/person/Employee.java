package encap.person;

public class Employee extends Person {

	String dept;
	
	Employee(){
		
	}
	
	Employee(String dept){
		this.dept = dept;
		
	}
	
	// dept의 접근자
	public String getDept() {
		return dept;
	}
	// dept의 수정자
	public void setDept(String dept) {
		this.dept = dept;
	}

	Employee(String id, String name, int age, String dept){
		super(id, name, age);
		this.dept = dept;
	}
	
	public String toString(){
		String empStr = String.format(", 부서:%s", dept);
		
		return  "부서 정보[" + super.toString() + empStr + "]";
	}
	
	@Override
	public void print() {
		System.out.println("== 직원 ==");
		System.out.println(this);
	}
	
	}
	
