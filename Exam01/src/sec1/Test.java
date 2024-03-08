package sec1;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
//		int a = 5;
//		int b = 2;
//		System.out.printf("%d*%d=%d",a,b,a*b); // 대입할때 개수를 맞춰야 함
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("2~9 사이 정수 입력 :");
			int a = sc.nextInt();
			
			if(a<=9 && a>1) {
				for(int num=1; num<=9;num++) {
					System.out.printf("%d*%d=%d\n",a,num,a*num);
				}
				break;
			}else {
				System.out.println("2이상 9이하의 정수만 입력해주세요.");
			}
		}
	}

}
