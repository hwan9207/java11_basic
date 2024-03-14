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
			System.out.println("���� �߸���1");
			try {
				con = DriverManager.getConnection(url, userid, userpw); //����̹��� �������ְ�
				pstmt = con.prepareStatement(sql); // ������ Ű��
				pstmt.setInt(1, newSt.getNo()); // newSt�� �߰��ؾ� �ϴ� get���� �߰� ���� �ڸ� �ҷ��ͼ� set���� �� ���� 
				pstmt.setString(2, newSt.getName());
				pstmt.setInt(3, newSt.getPoint());
				i = pstmt.executeUpdate(); //�����ϰ� �߰��� Ƚ����ŭ commit , �������� ��ȯ
				System.out.println("���� �߸���2");
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
