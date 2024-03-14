package org.kh.database2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.kh.test.Student;

public class MariaDBExam2 {

	public static void main(String[] args) {
		Student newSt = new Student(2, "gg", 32);
		
		Connection con = null; 	
		PreparedStatement pstmt = null; 
		String driver ="org.mariadb.jdbc.Driver";
		String url = "jdbc:mariadb://localhost:3308/temp";
		String userid ="root";
		String userpw = "1234";
		String sql = "insert into student values (?, ?, ?)"; 
		
		int i=0;
		try {
			Class.forName(driver);
			System.out.println("뭔가 잘못됨1");
			try {
				con = DriverManager.getConnection(url, userid, userpw); //드라이버랑 연결해주고
				pstmt = con.prepareStatement(sql); // 전원을 키고
				pstmt.setInt(1, newSt.getNo()); // newSt에 추가해야 하니 get으로 추가 해줄 자리 불러와서 set으로 값 수정 
				pstmt.setString(2, newSt.getName());
				pstmt.setInt(3, newSt.getPoint());
				i = pstmt.executeUpdate(); //수정하고 추가할 횟수만큼 commit , 실행결과도 반환
				System.out.println("뭔가 잘못됨2");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		finally{
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
		}
	}
}
