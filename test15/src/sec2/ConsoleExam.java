package sec2;

import java.io.Console;

public class ConsoleExam {

	public static void main(String[] args) {
		Console c = System.console();
		
		System.out.println("이름 : ");
		String name = c.readLine("1"); // scanner 와는 달리 입력 대기가 없어 잘 안쓴다 그럼 왜 만들었냐 개발자 개놈아
		
		System.out.println("점수 : ");
		int point = Integer.parseInt(c.readLine("1"));
		
		System.out.println("체중 : ");
		double d = Double.parseDouble(c.readLine("1.0"));
		
		System.out.println("pw : ");
		char[] pwc = c.readPassword(); // readPassword 문자배열로 받야아함
		String pw = new String(pwc); //문자배열을 문자열로 형 변환
		
		Person p = new Person(name, point, d);
		System.out.println(p.toString());
	}
}
