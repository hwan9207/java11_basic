package sec4;

import java.util.Scanner;

public class StudentEX02 {

	public static void main(String[] args) {
		Student[] a = new Student[5]; // [] 안에 인덱스값 입력해줘야함 
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<5;i++) {
			a[i] = new Student();
			a[i].num = (i+1);
			System.out.print((i+1)+"번째 국어 :");
			a[i].setKor(sc.nextInt());
			System.out.print((i+1)+"번째 영어 :");
			a[i].setEng(sc.nextInt());
			System.out.print((i+1)+"번째 수학 :");
			a[i].setMat(sc.nextInt());
		}
		for(int i=0;i<5;i++) {
			System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
			a[i].print();
		}
	}
}
