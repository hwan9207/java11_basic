package sec1;

import java.time.LocalDate;
import java.util.Date;

public class DateExam {

	public static void main(String[] args) {
		Date date1 = new Date();
		
		@SuppressWarnings("deprecation") // 노란줄 없어지게함
		Date date2 = new Date(1992,06,06,9,30,25);
		
		@SuppressWarnings("deprecation") // 노란줄 없어지게함
		Date date3 = new Date("Wed, 07 Jul 2001 9:30:25 +0900"); //+0900: RFC 822 구격 타임존 
		
		
		System.out.println(date1); //현재 날짜 시간 출력
		System.out.println(date2); //지정 시간 날짜 시간 출력
		System.out.println(date3); //지정 시간 날짜 시간 출력
		
		LocalDate n1 = LocalDate.now();
		System.out.println(n1);
		//날짜 데티터 => 문자열 데이터
		String n2 = n1.toString();
		//문자열 데이터 => 날짜 데이터
		LocalDate n3 = LocalDate.parse(n2);
		System.out.println(n2);
		
	}
}
