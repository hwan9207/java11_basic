package org.kh.site2;

import java.util.Scanner;

public class Condition6 {

	public static void main(String[] args) {
		int quiz = (int) (Math.random()*45);      // 실수
		System.out.println(quiz);
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.print("숫자 입력[0-45] : "); // while문 안에 있어야 하는 이유는 맞출때 까지 계속 반복해야 하기 때문에
			int num = s.nextInt();
			if(quiz==num) {
				System.out.println("\n축하합니다. 맞추셨습니다.");
				break;
				
			}
		}
	}
 }

		 
		   			
		
	


