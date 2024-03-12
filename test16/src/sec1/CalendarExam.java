package sec1;

import java.util.Calendar;

public class CalendarExam {
//static
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance(); //싱클톤
		int year = today.get(Calendar.YEAR);
		int month = today.get(Calendar.MONTH)+1; //0~11.. 출력할때 +1
		int day = today.get(Calendar.DATE);
		
		int doy = today.get(Calendar.DAY_OF_YEAR);
		int dom = today.get(Calendar.DAY_OF_MONTH);
		int dow = today.get(Calendar.DAY_OF_WEEK);
		
		int hour12 = today.get(Calendar.HOUR); //12시간제
		int hour24 = today.get(Calendar.HOUR_OF_DAY); //24시간제
		int minute = today.get(Calendar.MINUTE); // 분
		int second = today.get(Calendar.SECOND); 
		int ampm = today.get(Calendar.AM_PM); //오전이면 0 오후면 1
		
		int timeZone = today.get(Calendar.ZONE_OFFSET);
		int lastDate = today.getActualMaximum(Calendar.DATE); // 이달의 마지막 날
		int firstDate = today.getActualMinimum(Calendar.DATE); // 이달의 첫날
		
		
		System.out.println("현재 년도 : "+year);
		System.out.println("현재 월 : "+month);
		System.out.println("현재 일 : "+day);
		
		System.out.println("오늘은 "+year+"년의"+doy+"일 째 날");
		System.out.println("오늘은 "+month+"월의 "+dom+"번째 날");
		System.out.println("오늘 이번 주의 "+dow+"일 째 날");
		
		String[] wk = {"", "일", "월", "화", "수", "목", "금", "토", "일"};
		System.out.println("오늘은 "+wk[dow]+"요일 입니다.");
		System.out.println(timeZone);
		
	}

}
