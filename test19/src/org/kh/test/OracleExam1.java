package org.kh.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
//select �ʵ��1[, �ʵ��2, �ʵ��3,... �Ǵ� *] from ���̺�� [where �ʵ��=��] : ���̺��� Ư�� ���ǿ� �����ϴ� ���ڵ带 �˻�
public class OracleExam1 {
	public static void main(String[] args) {
		Connection con = null; 	// db ����?
		PreparedStatement pstmt = null; //�ڵ� ����ġ ? , ���� ����(on/off) �ϰ�, SQL�� ������ ����
		ResultSet rs = null; //select �Է½� ��� ���? , �˻�(Select��)�� ����� ��ȯ�޴� ��ü
		//ojdbc �̰� ����̹�?? 
		String driver ="oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userid ="system";
		String userpw = "1234";
		String sql = "select * from student"; // ����Ŭ ���̺� �ҷ����°�?
		List<Student> stList= new ArrayList<>();
		
		try {
			Class.forName(driver); //���� Ŭ������ ����̹� �ε�
			try {
				con = DriverManager.getConnection(url, userid, userpw); //�����ͺ��̽� ������ ����
				pstmt = con.prepareStatement(sql); //���� ä�� ���� ����ġ on
				rs = pstmt.executeQuery(); // �����.. , SQL ������ select ������ ��쿡�� commit�� �ʿ� �����Ƿ� executeQuery() ��� ��� ��ȯ�� ���ڵ��(ResultSet)�̴�.
				while(rs.next()) {
					Student st = new Student(rs.getInt("no"), rs.getString("name"), rs.getInt("point"));
					stList.add(st);
				}
			} catch (SQLException e) {
				System.out.println("���̹����̽� ���� ���� �Ǵ� SQL ���� ���� ����");
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			System.out.println("�����ͺ��̽� �ε� ����");
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
