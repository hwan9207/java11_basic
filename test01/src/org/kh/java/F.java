package org.kh.java;

public class F {

	public static void main(String[] args) {
//		String stringFormat = "777";
//		 
//		Double changeFormat = Double.parseDouble(stringFormat);	
//		System.out.println(changeFormat);
		
		/* 1. String
		   변환 할 타입 (변수명) =변환 할 타입.parse변환 할 타입(변환 당하는 변수);
		   
		   예외 String stringFormat = "123";
 			   char changeFormat = stringFormat.charAt(0); >> char형은 charAt(0) 이런식으로...
 		   2. Int
 		      
 		      int intFormat = 777;
			  String stringFormat = Integer.toString(intFormat);	>    
 
       
		 */
		
//		String stringFormat = "123";
//		 
//		char changeFormat = stringFormat.charAt(0);
//		System.out.println(changeFormat);
		
		int num = 8;
		System.out.println(num >>= 2);
		
	}

}
