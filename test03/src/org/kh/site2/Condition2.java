package org.kh.site2;

public class Condition2 {

	public static void main(String[] args) {
		char sel = '1';
		//성별코드(sel)가 1이거나 3이면, 성별이 "남성", 아니면, "여성"
		String gender;
		if(sel=='1'||sel=='3') {
			gender = "남성";
		}
			else { gender = "여성";
			
			}
			System.out.printf("\n당신의 성별은 %s 입니다 ", gender);
	}
}	


