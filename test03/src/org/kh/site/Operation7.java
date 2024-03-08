package org.kh.site;

public class Operation7 {

	public static void main(String[] args) {
			//대입 연산자 : 연산 후에 대입하는 연산자 += -= *= /= %= &= |= >>= <<= ^= >>>= (<<<= 이거는 없다)
			//비트(2진수) 연산자 : & | ~(not,complement) ^(xor) << >> 
			// 비트 연산자 - % & 뭐 이런거 하나만 쓰면 비트연산자... 비트 연산자는 2진수로 변환해 실행한 값을 다시 10진수로..
		int a = 20;
		int b = 15;
		int c;
		// c += a;  // c 값이 초기화가 안되어서 에러

		a += b; // a=35 b=15
		b -= a; // a=35 b=-20
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		// a와 b의 맞교환 
		c = a; // c=35 a=35
		a = b; // a=-20 b=-20
		b = c; // b=35 c=35
		
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		System.out.println("c:"+c);
		
		int x = 0b01101;
		int y = 0b01011;
		System.out.println("x="+Integer.toBinaryString(x)); 	     //2진수 변환 Integer.toBinaryString
		System.out.println("y="+Integer.toBinaryString(y));
		System.out.println("x & y="+Integer.toBinaryString(x & y)); 
		System.out.println("x | y="+Integer.toBinaryString(x | y));
		System.out.println("x ^ y="+Integer.toBinaryString(x ^ y));  // xor - 입력이 서로 다를 경우에만 1 
		System.out.println("~x="+Integer.toBinaryString(~x));        // ~ = ! 부정? 
		System.out.println("x >>"+Integer.toBinaryString(x >> 2));   // 오른쪽으로 두번 이동 오른쪽 >는 나누기다..  
		System.out.println("x <<"+Integer.toBinaryString(x << 2));	 // <는 곱하기 (한칸에 곱하기 나누기 2씩..)
		
		System.out.println("****** 대입 연산자*****");
			
			int i =  25; // 11001				// 16 8 4 2 1 여기서 25는 16 8 1 더하면 25 그래서 11001
			int j =  30; // 11110
			i &= j; // i = i & j
			System.out.println("i &= j : "+ i);  // 11000 =24
			i=25;
			i|= j;
			System.out.println("i |= j : "+ i); //  11111
			i =25;
			i ^=25;
			System.out.println("i ^= j : "+ i); //  00111
			j=30;
			j >>= 2;
			System.out.println("j >>= 2 :" + j); // 111 
			j=30;
			j<<= 2;
			System.out.println("j <<= 2 :" + j); // 1111000
			
	}

}
