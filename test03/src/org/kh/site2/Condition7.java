package org.kh.site2;

import java.util.Random;

public class Condition7 {
	public static void main(String[] args) {

	int max=45, min=1;
		for(int i=0;i<6;i++) {
			Random lotto = new Random();
			int val = lotto.nextInt(max+min)+min;  
			System.out.print(val+"\t");
		}
	}
 }

		 
		   			
		
	


