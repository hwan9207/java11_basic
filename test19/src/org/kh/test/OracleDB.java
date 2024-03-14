package org.kh.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OracleDB {
	Connection con = null; 	// db ����?
	PreparedStatement pstmt = null; //�ڵ� ����ġ ? , ���� ����(on/off) �ϰ�, SQL�� ������ ����
	ResultSet rs = null; //select �Է½� ��� ���? , �˻�(Select��)�� ����� ��ȯ�޴� ��ü
	String driver ="oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String userid ="system";
	String userpw = "1234";
	
	public Connection connect() { // �� �޼ҵ常 ȣ���ϸ� ..
		try {
			Class.forName(driver);
			try {
				con = DriverManager.getConnection(url, userid, userpw);
			} catch (SQLException e) {
				System.out.println();
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� �ε� ����");
			e.printStackTrace();
		}
		return con;
	}
	public void close(PreparedStatement pstmt, Connection con) {
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
	public void close(ResultSet rs, PreparedStatement pstmt, Connection con) {
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
	}
}
