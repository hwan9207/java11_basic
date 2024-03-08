package org.kh.site2;

 // 학점은 점수가 90~100 'A' 80~90 'B' 70~79 'C' 60~69 'D' 60미만 'F'
import java.util.Scanner;

public class Condition3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	 // scan = Scanner 객체  improt문 필요함 마우스 자동 생성..	
		System.out.print("점수 입력 [0-100] :");
		 double point = scan.nextDouble();            // 문자나 문자열은 next(); 이렇게만 해준다 
		 char result;							// 다른 자료형은  nextInt , nextFloat 이런식
		 
		 if(point>=90) {
			 result = 'A';
		 } else if(point>=80) {
			    result = 'B';
			 }else if(point>=70) {
		         result = 'C';
			 }else if(point>=60) {
				 result = 'D';
			 }else { 
				 result = 'F';                  
			 }
		 
			 
		 System.out.printf("\n당신의 점수는 %.2f점 입니다.\n" , point);  
		 System.out.println("\n당신의 학점은"+result+"입니다.");
			 
		}
		
	}


