package sec4;

public class StudentEx01 {

	public static void main(String[] args) {
		Student a1 = new Student();
		a1.setNum(1);
		a1.setKor(95);
		a1.setEng(82);
		a1.setMat(85);
		System.out.println(a1.toString());
		System.out.println("총점은 "+a1.tot()+" 입니다.");
		System.out.println("평균은 "+a1.vag()+" 입니다.");
		
		Student a2 = new Student();
		a2.setNum(2);
		a2.setKor(90);
		a2.setEng(80);
		a2.setMat(88);
		System.out.println(a2.toString());
		System.out.println("총점은 "+a2.tot()+" 입니다.");
		System.out.println("평균은 "+a2.vag()+" 입니다.");
		
		Student a3 = new Student();
		a3.setNum(3);
		a3.setKor(91);
		a3.setEng(86);
		a3.setMat(82);
		System.out.println(a3.toString());
		System.out.println("총점은 "+a3.tot()+" 입니다.");
		System.out.println("평균은 "+a3.vag()+" 입니다.");
				
	}

}
