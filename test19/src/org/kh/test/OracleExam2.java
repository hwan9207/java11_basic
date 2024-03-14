package org.kh.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//insert into ���̺���[(�ʵ��1, �ʵ��2,...)] values (��1, ��2,....) : ���̺��� ���ڵ带 �߰�
public class OracleExam2 {
	public static void main(String[] args) {
		Connection con = null; 	// db ����?
		PreparedStatement pstmt = null; //�ڵ� ����ġ ? , ���� ����(on/off) �ϰ�, SQL�� ������ ����

		String driver ="oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userid ="system";
		String userpw = "1234";
		String sql = "insert into student values(?,?,?)"; //insert�� �߰�
		Student st = new Student(6, "����ȯ", 95);
		int i = 0;
		try {
			Class.forName(driver); // ����̹� �ε�
			try {
				con = DriverManager.getConnection(url, userid, userpw); // ����
				pstmt = con.prepareStatement(sql); //���� on
				pstmt.setInt(1, st.getNo()); // ���� �ɼ� �߰�
				pstmt.setString(2, st.getName());
				pstmt.setInt(3, st.getPoint());
				i = pstmt.executeUpdate(); // commit �� ���� �Ǿ��ִ�.. , SQL ���� �� ��� ��ȯ : insert/update/delete �� ���� commit ������ �ݵ�� �ʿ��ϹǷ� executeUpdate() ��� 
				if(i>0) {
					System.out.println(i+"���� ���������� ó�� �Ǿ����ϴ�.");
				}else {
					System.out.println("SQL ���� ����");
				}
			} catch (SQLException e) {
				System.out.println("�����ͺ��̽� ���� ����,�Ǵ� SQL ó�� ����");
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� �ε� ����");
			e.printStackTrace();
		} finally {
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