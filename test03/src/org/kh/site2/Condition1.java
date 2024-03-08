package org.kh.site2;

public class Condition1 {

	public static void main(String[] args) {
		//판정(pass)은 점수(point)가 70 점 이상이면, "합격", 아니면 "불합격"
		int point = 80; 
		String pass = "불합격";
		if(point >= 70) pass = "합격";  // 처리 할 문장이 한 줄인 경우는 { } 생략 가능
				System.out.println(pass);
				System.out.printf("\n당신의 점수는 %d 이며, 판정은 %s 입니다.",point, pass);
			
		String pass2 = (point>=70) ? "합격" : "불합격"; 		
			
		}
		
			
	}


