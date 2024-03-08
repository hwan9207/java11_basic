package sec2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exam {
	public static void main(String[] args) {
//		 String[] pw = {"02-1234-1234", "010-2836-1004", "032-7979-1324", "010-2454-8579", "031-224-3245","010-324-1657"};
//		 
//		 
//		 Pattern p = Pattern.compile("010-\\d{3,4}-\\d{4}"); //
//		 Pattern p = Pattern.compile("010-[0-9]*-[0-9]*");
//		for (int i = 0; i < pw.length; i++) {
//			 Matcher m = p.matcher(pw[i]);
//			 if (m.matches()) {
//				 System.out.println("핸드폰 번호 형식이 맞습니다.");
//				 System.out.println(pw[i]);
//			 }
//		 }
//		String[] pw = {"920706-1579810", "931216-1548899", "931321-15811135", "010203-6789012", "381485-215879","780509-1324652"};
//		
//		
//		Pattern p = Pattern.compile("\\d{6}\\-[1-4]\\d{6}"); // \\특수문자 앞에 , [0-9]는 범위  {6}는 개수 {3,4} -> 3or4개
//		Pattern p1 = Pattern.compile("010-[0-9]*-[0-9]*");
//		for (int i = 0; i < pw.length; i++) {
//			Matcher m = p.matcher(pw[i]);
//			if (m.matches()) {
//				System.out.println("주민 번호 형식이 맞습니다.");
//				System.out.println(pw[i]);
//			}
//		}
//		
//		String[] pw = {"123-123", "212-345", "816-245", "5434-54", "683-395"};
//		
//		
//		Pattern p = Pattern.compile("[1-7]\\d{2}\\-[1-7]\\d{2}"); // \\특수문자 앞에 , [0-9]는 범위  {6}는 개수 {3,4} -> 3or4개
//		Pattern p1 = Pattern.compile("010-[0-9]*-[0-9]*");
//		for (int i = 0; i < pw.length; i++) {
//			Matcher m = p.matcher(pw[i]);
//			if (m.matches()) {
//				System.out.println("우편 번호 형식이 맞습니다.");
//				System.out.println(pw[i]);
			
		String[] pw = {"abcd134", "A123a", "1234", "ABCD!123456", "Abc!432", "KIM#1004"};
				
				
				Pattern p = Pattern.compile("");   //??=. 두 글자 이상 ?=. 한글자 이상
				Pattern p1 = Pattern.compile("010-[0-9]*-[0-9]*");
				for (int i = 0; i < pw.length; i++) {
					Matcher m = p.matcher(pw[i]);
					if (m.matches()) {
						System.out.println("우편 번호 형식이 맞습니다.");
						System.out.println(pw[i]);
			}
		}
	}
}
