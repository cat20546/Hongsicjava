package inheritance.basic.person;

/**
 * Person 과 상속관계인 Student 를 테스트하는 클래스이다.
 * 
 * @author JACK
 *
 */
public class PersonTest {

	public static void main(String[] args) {
		// 1. 선언, 2. 초기화
		
		Person[] persons = new Person[3];
		persons[0] = new Student("S02", "홍길동", 18, "도술");
		persons[1] = new Employee("E04", "조성철", 25, "글로벌IT경영 과사무실");
		persons[2] = new Teacher("T03", "윤홍식", 18, "MIS");

		// 3. 사용

		for(Person person: persons) {
			person.print();
		}
		
		
	/*	System.out.println(student);
		System.out.println(employee);
		System.out.println(teacher);
		System.out.println("=====================");
		System.out.println();
		student.print();
		teacher.print();
		employee.print();

	}*/
	}
}
