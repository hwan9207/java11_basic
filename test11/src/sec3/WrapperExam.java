package sec3;

public class WrapperExam {

	public static void main(String[] args) {
		int a =10;
		Integer b = a; //참조형에 기본형 데이터 대입 
		int c = b;	//
		String e = "3.14";
		double d = (double) a;
		System.out.println(d);
	}

}
