package Exam;

import java.util.ArrayList;
import java.util.List;

public class Test3 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(); //2번째
		
		list.add(4);
		list.add(-5);
		list.add(0);
		list.add(-3);
		list.add(2);
		list.add(1); // Integer 타입이라
		
		for(Integer num : list ) { // int 되는건가? 되긴 하는데..
			char ch;
			
			if(num < 0) { // 0 음수 아님
				ch = '-';
			}else if(num > 0) { 
				ch = '+';
			}else  {
				System.out.println("@@@@@@@");
				continue; 
			}
			
			// int Math.abs(정수) : 정수의 절대값을 반환
			for(int i=0; i<Math.abs(num);i++) { // i=0
				System.out.print(ch); //continue 주석처리 하면 왜 에러나지..
			}
			System.out.println();
		}
	}

}
