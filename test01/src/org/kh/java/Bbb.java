package org.kh.java;

public class Bbb {

	public static void main(String[] args) {
		int a = 26;
		int b = 28;
		

		//System.out.println("a > b && b > c :" + (a > b && b > c ));
		//System.out.println("a > b || b > c :"+ (a > b || b > c));
		
		
		
//		boolean value = ((a=a+10)>40)&&((b+2)<40);  
//		System.out.println(value);
//		System.out.println(a);
//		System.out.println(b);
		/*
		 * 두항 모두 참이여야 true 출력
		 * 앞항이 거짓이여서 뒤에항을 볼 필요가 없으니 
		 * 뒤에 항은 실행안됨 
		 */
		boolean value = ((a=a+10)<40)&&((b=b+2)>40);  
		System.out.println(value);
		System.out.println(a);
		System.out.println(b);
		
		/*
		 * 앞항이 참이지만 뒤에항이 거짓이라 false
		 * 앞항이 참이지만 뒤에항도 확인 해야되니 실행
		 * 
		 */
		
//		boolean value = ((a=a+10)<40)&&((b=b+2)<40);  
//		System.out.println(value);
//		System.out.println(a);
//		System.out.println(b);
		
		
	}

}
