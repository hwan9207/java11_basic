package sec3;

public class CodeInspectorExam {
//PMD -> 
	public static void main(String[] args) {
		Reader r1 = new Reader();
		Reader r2 = new Reader(2,"www.co.kr","³×¹ö",123);
//		System.out.println(r2.toString());
		System.out.println(r2.def);
	}

}
