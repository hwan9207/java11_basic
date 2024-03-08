package org.kh.rara2;

//반복문 : for(선언문;조건문;증감식) , while , do ~ while ~
public class Loop1_1 {
 
	public static void main(String[] args) {
			// 최대값 최소값 구하기
			int num[] = {20,30,40,50,60};
			int max =0, min=num[0];
			for(int i=0;i<5;i++) {
				if(num[i]>max) max=num[i]; 
				if(num[i]<min) min=num[5];
			}
			System.out.println(max);
			System.out.println(min);
	}
}
		
  
	


