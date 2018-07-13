package encap.person;

public class Teacher extends Person {

	String subject;
	
	Teacher(){
		
	}
	
	Teacher(String subject){
		this.subject = subject;
	}
	
	Teacher(String id, String name, int age, String subject){
		super(id, name, age);
		this.subject = subject;
	}
	
	public String toString(){
		String teacherStr = String.format(", 과목:%s", subject);
		
		return "과목 정보[" + super.toString() + teacherStr + "]";
	}

	@Override
	public void print() {
		System.out.println("== 직원 ==");
		System.out.println(this);
		
	}
	
}
