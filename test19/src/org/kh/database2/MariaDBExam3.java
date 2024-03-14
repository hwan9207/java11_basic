package org.kh.database2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.kh.test.Student;

public class MariaDBExam3 {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null; 
		String driver ="org.mariadb.jdbc.Driver";
		String url = "jdbc:mariadb://localhost:3308/temp";
		String userid ="root";
		String userpw = "1234";
		String sql = "update student set point=?, name=?, where no=?";
		
		Student ss = new Student(2, "dddd", 76 );
		int i= 0;
		try {//����̹��� �����ؾ� �ϴ� �� Ʈ���̹��� �־����
			Class.forName(driver);
			System.out.println("�� �Ѥ�");
			try { 
				con = DriverManager.getConnection(url, userid, userpw);
				pstmt= con.prepareStatement(sql);
				pstmt.setInt(1,ss.getNo());
				pstmt.setString(2, ss.getName());
				pstmt.setInt(3, ss.getPoint());
				i = pstmt.executeUpdate();
				System.out.println("�� �Ѥ�");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		finally {
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
