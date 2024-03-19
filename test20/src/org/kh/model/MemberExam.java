package org.kh.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import section.Member;


public class MemberExam {
//1.회원가입 목록 삭제 종료
	List<Member> mb = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		MemberExam mamber1 = new MemberExam();
		mamber1.menu();
		
	}
	void menu() {
		boolean sw = true;
		while(sw) {
			System.out.println("1.회원 가입");
			System.out.println("2.회원 목록");
			System.out.println("3.회원 삭제");
			System.out.println("4.종료");
			System.out.print("작업 번호 : ");
			int num = sc.nextInt();
			if(num==4) {
				System.out.println("프로그램 종료");
				break;
			}
			switch(num) {
				case 1: join();
					break;
				case 2: info();
					break;
				case 3: remove();
					break;
			}
		}
	}
	
	void join() {
		System.out.print("구분코드 : ");
		int code = sc.nextInt();
		System.out.print("ID : ");
		String id = sc.next();
		System.out.print("PW : ");
		String pw = sc.next();
		System.out.print("이 름 : ");
		String name = sc.next();
		System.out.print("생년월일 : ");
		int year = sc.nextInt();
		System.out.print("연락처 : ");
		String tel = sc.next();
		System.out.println("회원가입이 완료 되었습니다.");
		mb.add(new Member(code, id, pw, name, year, tel));
		
		
		
	}
	void info() {
		for(Member m:mb) {
			System.out.println(m.toString());
		}
		System.out.println("회원 목록입니다.");
	}
	void remove() {
		System.out.print("삭제 요청 회원 이 름 : ");
		String name = sc.next();
		for(int i=0; i<mb.size();i++) {
			Member m = mb.get(i);
			if(m.getName().equals(name)) {
				mb.remove(i);
				System.out.println(name+"님이 삭제 되었습니다.");
				System.out.println(name+"님의 정보"+m.toString()+" 삭제 완료");
			}
		}
		
	}
}
