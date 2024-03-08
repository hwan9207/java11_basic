package org.kh.rara2;

//반복문 : for(선언문;조건문;증감식) , while , do ~ while ~
public class Loop1 {

	public static void main(String[] args) {
//			int n = 0;
//			n= n+1;
//		  int num = 0;
//		for(int i=0;i<=10;i++) {  
//			num = 1+num;   						!전역변수는 한번만 선언 가능
//			// num = i+num; = 55 출력			 i 실행문에 포함 상관없이 for문에 선언 되어 있어서 조건문이 참일때까지 ㄱㄱ 
//		}
//		System.out.println(i); 			 i는(지역변수) for문에만 선언이 되어 있어서 포문 밖에서는 출력이 안됨.!!
//		System.out.println(num);
//		배열 
//		int[] nums = {1,2,3,4};   [] 사용 배열  index -순번
//		nums[4] = 5; 			  변수를 추가 가능함 근데 왜 안되지
//		String names[] = {"김","이","최","박"};
//		System.out.println("1");
//		for(int i=0;i<5;i++);{
//			System.out.printf("\n이름 : %s[i],", names[0]);  
//			System.out.println(nums);
//		System.out.println("n="+n);
		int[] nums = {80,95,75,60,100,65,70,90,85,95}; //배열
		String names[] = {"김","이","박","최","정","오","배","강","장","계"};
		int tot = 0, max = 0, min = 100;
		System.out.println("nums : "+nums);
		System.out.println("names : "+names);
		System.out.println("\n이름\t점수\t학점\t판정");
		for(int i=0;i<10;i++) {
			tot += nums[i];	// tot = tot + nums[i];
			System.out.print(names[i]+"\t");
			System.out.print(nums[i]+"\t");
			if(nums[i]>=90) {
				System.out.print("A\t");
			} else if(nums[i]>=80) {
				System.out.print("B\t");
			} else if(nums[i]>=70) {
				System.out.print("C\t");
			} else if(nums[i]>=60) {
				System.out.print("D\t");
			} else {
				System.out.print("F\t");
			}
			if(nums[i]>=70) {
				System.out.print("합격\n");
			} else {
				System.out.print("탈락\n");
			}
			if(nums[i]>max) max = nums[i];
			if(nums[i]<min) min = nums[i];
		}
		System.out.println("전체 총점 : "+tot);
		System.out.println("전체 평균 : "+(tot/10.0f));
		System.out.println("최대 점수 : "+max);
		System.out.println("최소 점수 : "+min);
		
	}
		
}	
	


