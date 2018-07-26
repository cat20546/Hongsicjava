package mybatis.emp.test;

import static mybatis.emp.client.MybatisClient.getFactory;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import mybatis.emp.mapper.EmpMapper;
import mybatis.emp.vo.Emp;

/**
 * 직원정보 1건을 데이터베이스 테이블 emp 에 삽입하는 클래스
 * 
 * @author JACK
 *
 */

public class MybatisEmmpInsertTest2 {

	public static void main(String[] args) {

		// 0. sqlSession Factory 생성
		SqlSessionFactory factory = getFactory();

		// 1. sqlSession 얻기
		
		// DML 작업을 할 때는 세션을 오픈할 때
		// 자바 애플리케이션에서 commit 이 이루어지도록 해야함
		// JDBC는 기본 auto-commit 이므로 신경쓰지 않아도 좋지만
		// mybatis 는 기본 non auto-commit 이므로 auto-commit 으로
		// 변경해야함
		
		// optionSession() 메소드의 매개변수로 true 를
		// 전송해야 auto-commit 이 활성화 됨
		SqlSession session = factory.openSession(true);

		
		try {
			// 2. 세션 객체를 통해서 쿼리 실행
			Emp emp = new Emp();
			emp.setEmpno(5775);
			emp.setEname("조성철");
			emp.setJob("노예");
			
			// 매퍼 인터페이스 객체를 선언
			EmpMapper mapper;
			
			// session 으로부터 매퍼 객체를 얻어냄
			mapper = session.getMapper(EmpMapper.class);
			
			// 매퍼 인터페이스 객체를 통하여 메소드 호출
			
			int addCnt = mapper.insert(emp);

			System.out.println("삽입된 행의 개수:" + addCnt);

		} finally {
			// 3. sqlSession 닫기
			session.close();

		}

	}

}
