package org.kh.site;

public class Operation6 {

	public static void main(String[] args) {
		//논리 연산자 : &&(and) ||(or) !(not)
		int a = 26;
		int b = 28;
		int c = 27;
		
//		boolean value = ((a=a+10)<40)||((b=b+2)>40);   // 앞항이 참이여서 true 출력 
//		System.out.println(value);					 // 앞항이 참이여서 뒤에항은 확인할 필요없이 true 이니 실행이 안됨
//		System.out.println(a);						 // 그래서 a는 36출력 b는 28 출력 
//		System.out.println(b);
		
		
		
		
//		boolean value = ((a=a+10)>40)||((b=b+2)<40);  // 논리합은 두 항 중에 하나만 참이여도 true 
													// 앞항은 거짓 뒤항이 참이여서 true 출력
//		System.out.println(value);					// 앞항이 거짓이여서 뒤에항도 확인 
//		System.out.println(a);						// b가 참인지 확인해야 되니 b값이 30으로 출력
//		System.out.println(b);

		boolean value = ((a=a+10)>40)||((b=b+2)>40); 	 // 논리합 두 항 다 거짓이여서 false 
														//  앞항은 거짓 뒤항도 거짓이지만 
		System.out.println(value);						//  뒤에 항이 거짓인지 참인지 확인해야하니 실행이됨
		System.out.println(a);							//  b값이 30 출력
		System.out.println(b);
		
		
		//		System.out.println("a > b && b > c :" + (a > b && b > c ));
//		System.out.println("a > b || b > c :"+ (a > b || b > c));
		
	}

}
