package org.kh.site2;

public class Condition5 {

	public static void main(String[] args) {

		int rank=1;
		String sisang = "";
		switch(rank) {
			case 1:
				sisang = "최우수상 입니다.";
				break;
			case 2: 
				sisang = "준우수상 입니다.";
				break;
			case 3:
				sisang = "화이팅 입니다.";
				break;
			default:					// default 뒤에는 숫자나 변수값 ㄴㄴㄴ
				sisang = "집에 가 입니다.";
		}
			System.out.println(sisang);
		
	}
 }

		 
		   			
		
	


