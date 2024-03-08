package org.kh.java;

public class Hello2 {
	public static void main(String[] args) {
		System.out.println("김기태");
		
		for(int i=1 ; i<=9 ; i++) {
			for(int k=2 ; k<=9 ; k++) {
				System.out.print(k+"*"+i+"="+i*k+"\t");
			}
			System.out.println();
		}
	}
}
