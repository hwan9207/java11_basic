package Exam;

import java.util.ArrayList;
import java.util.List;

public class Test3 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(); //2번째  list 선언만 되어 있으므로 객체 생성이 안되어있어 객체 안에 NullPointException 오류 발생
		
		list.add(4);
		list.add(-5);
		list.add(0);
		list.add(-3);
		list.add(2);
		list.add(1); //List의 선언시 요소의 데이터 타입이 Integer로 설정 되어 있으므로 실수값은 데이터 타입 오류 발생
		
		for(Integer num : list ) { // int 되는건가? 되긴 하는데..
			char ch;
			
			if(num < 0) { // 0 음수 아님 0인 경우에는 @@@@@@@@ 을 출력 하라는 문제 제시대로 실행이 되지 않음
				ch = '-';
			}else if(num > 0) { 
				ch = '+';
			}else  {
				System.out.println("@@@@@@@");
				continue; 
			}
			
			// int Math.abs(정수) : 정수의 절대값을 반환
			for(int i=0; i<Math.abs(num);i++) { // i=0 , 해당 숫자의 횟수 만큼 부호를 출력해야 되는데 -1 씩 출력 , for 반복문의 실행 조건이 해당 숫자를 포함하는 거이 아닌..
				System.out.print(ch); //continue 주석처리 하면 왜 에러나지..
			}
			System.out.println();
		}
	}

}
