package org.kh.java;

public class Hello {
	public static void main(String[] args) {	//실행을 위한 기본 main 메소드 = Ctrl+/ = 한 줄 각주
		System.out.println("Hello~! \nJAVA~!");
		/* 
		자기 이름 소개하는
		출력 명령
		결과 : My name is KiTae1004 = Ctrl+Shift+/ = 여러 줄 각주
		 */
		//sysout => Ctrl+Spacebar = 단축명령 자동 완성(Code Hinting)
		System.out.println("My name is KiTae1004");
	

				// 구구단 2단에서 9단까지 출력하기 (예쁘게 정렬)
				for(int i=1 ; i<=9 ; i++) {
					for(int k=2 ; k<=9 ; k++) {
						System.out.print(k+"*"+i+"="+i*k+"\t");
					}
					System.out.println();
				}
	}
}