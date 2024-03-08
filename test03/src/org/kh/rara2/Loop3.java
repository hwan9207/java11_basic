package org.kh.rara2;

import java.util.Scanner;

public class Loop3 {

	public static void main(String[] args) {
//		int i = 0 ,  tot =0;	
//		while(i<=10) {
//			i++;
//			tot+=i;
		/* 초기식; (while문 밖에)
		 * int i =0 ,tot=0;
		 * while(조건문)
		 * 	 선언,증감식을 ()밖에 함 (while문 안에) 
		 * 	 참일 경우 반복 할 문장 
		 */
//		}
//		System.out.println(tot);
		
		//해당 숫자를 입력하면 , 구구단 중 해당 숫자의 단을 출력 하시오.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력[2-9] : ");		
		int n = sc.nextInt();
		
		int num = 0;
		while(num<9) {
			 
			num++;
			System.out.println(n+"*"+num+"="+(n*num) );
		}	
   }	
}


