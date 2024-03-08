package sec1;

import java.text.SimpleDateFormat;
import java.util.Date;
//SimpleDateFormat : 날짜 표시형식을 지정할 때 활용하는 클래스
public class DateFormatExam {

	public static void main(String[] args) {
		Date today = new Date();
		//표시형식 코드 : y-년 , M-월 (대문자로만 분도 m이라), d-일, h-시, m-분, s-초 E(대문자!)-요일, a-오전/오후 W(대문자)-월 중 몇 번째 주 w-년 중 몇번째 주
		SimpleDateFormat f1 = new SimpleDateFormat("yyyy년MM월dd일hh시mm분ss초");
		SimpleDateFormat f2 = new SimpleDateFormat("yyyy-MM-dd (E), hh:mm:ss (a)");
	
		//날짜 데이터에서 특정 표시형식이 부여된 문자열로 변환
		String t1 = f1.format(today);
		String t2 = f2.format(today);
	
		System.out.println(t1);
		System.out.println(t2);
	}
}
