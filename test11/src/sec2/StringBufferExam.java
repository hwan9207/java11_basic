package sec2;

public class StringBufferExam {

	public static void main(String[] args) {
		String str = new String("Java Programmer");
		str +=" Junier Level";
		str +=" Develope";
		System.out.println(str);
		
		StringBuffer sb = new StringBuffer(""); //스택 구조
		byte[] b = str.getBytes();
		for(byte c:b) { //문자배열을 문자열로 변경
			char k = (char) c;
			sb.append(k); //한 문자씩 StringBuffer 추가
		}
		System.out.println(sb);
		
		CharStack cs = new CharStack();
		cs.push('V');
	}
}
