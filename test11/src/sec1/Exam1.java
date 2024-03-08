package sec1;

public class Exam1 {

	public static void main(String[] args) {
		int a = 1004;
		int b = 1004;
		System.out.println("a==b :"+(a==b)); //단순 변수의 정수 값 비교
		String s1 = "유정환"; 	//String은 기본형,참조형이 아님.
		String s2 = "유정환";
		System.out.println("s1==s2 :"+(s1==s2));	//틀린 문자열의 값 비교
		System.out.println("s1 equals s2 :"+(s1.equals(s2))); //문자열 비교는 equals 사용이 옳다 -> String 클래스로 연산해야 되므로..
		
		Integer c = new Integer(1004);	//c d는참조형 
		Integer d = 1004;
		
		System.out.println("a==c :"+(a==c)); //기본형과 참조형의 비교는 값 비교
		System.out.println("c==d :"+(c==d)); //참조형과 참조형의 비교는 주소 비교
		System.out.println("c epuals d :"+(c.equals(d))); //참조형의 비교는 equals 사용
		
		
	}
}
