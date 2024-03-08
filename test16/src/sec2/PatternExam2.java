package sec2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Pattern : 특정 데이터가 형식이 맞는지 비교하려고 할 경우 데이터 형식을 지정하는 클래스
//Matcher : 특정 패턴의 형태가 맞는지 비교하는 클래스
//정규식(Reg Expression)
public class PatternExam2 {
	public static void main(String[] args) {
		String[] dt = {"bag", "yu", "9to6", "8to5", "single", "home", "한글", "!@#$"};
		//데이터 검증
//		Pattern p = Pattern.compile("[a-z]*"); //* 모든것 .. * 없으면 전체적으로 검증 안하는듯
		Pattern p1 = Pattern.compile("[a-z0-9]*"); 
		Pattern p2 = Pattern.compile("s[a-z]*"); 
//		Pattern p = Pattern.compile("[가-히]*"); 
		Pattern p = Pattern.compile("^[0-9]*"); 
		for(int i=0; i<dt.length;i++) {
			Matcher m = p2.matcher(dt[i]);
			if(m.matches()) {
				System.out.println("형식 일치 : "+dt[i]);
			}
		}
		
	}
}
