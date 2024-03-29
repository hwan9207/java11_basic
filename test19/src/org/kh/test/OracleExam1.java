package org.kh.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
//select 필드명1[, 필드명2, 필드명3,... 또는 *] from 테이블명 [where 필드명=값] : 테이블에서 특정 조건에 만족하는 레코드를 검색
public class OracleExam1 {
	public static void main(String[] args) {
		Connection con = null; 	// db 연결?
		PreparedStatement pstmt = null; //자동 스위치 ? , 상태 변경(on/off) 하고, SQL의 문장을 실행
		ResultSet rs = null; //select 입력시 결과 출력? , 검색(Select문)의 결과를 반환받는 객체
		//ojdbc 이게 드라이버?? 
		String driver ="oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userid ="system";
		String userpw = "1234";
		String sql = "select * from student"; // 오라클 테이블 불러오는거?
		List<Student> stList= new ArrayList<>();
		
		try {
			Class.forName(driver); //현재 클래스에 드라이버 로딩
			try {
				con = DriverManager.getConnection(url, userid, userpw); //데이터베이스 물리적 연결
				pstmt = con.prepareStatement(sql); //논리적 채널 연결 스위치 on
				rs = pstmt.executeQuery(); // 결과물.. , SQL 구문이 select 문장인 경우에는 commit이 필요 없으므로 executeQuery() 사용 결과 반환은 레코드셋(ResultSet)이다.
				while(rs.next()) {
					Student st = new Student(rs.getInt("no"), rs.getString("name"), rs.getInt("point"));
					stList.add(st);
				}
			} catch (SQLException e) {
				System.out.println("데이버베이스 연결 실패 또는 SQL 구문 실행 실패");
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			System.out.println("데이터베이스 로딩 실패");
			e.printStackTrace();
		} finally {
			if(rs!=null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(pstmt!=null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(con!=null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			for(Student s:stList) {
				System.out.println(s.toString());
			}
		}
	}
}
