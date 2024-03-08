package sec3;

public class People {
	public static int selNum;   // static 정적 필드(공유 데이터) , 공통 속성.. 객체와 관계없이 메모리가 공유된다
	public String name;			//인스턴스 변수 - 동적 필드
	public int age;
	public String add;
	
	public void print1() {
		System.out.println("selnum : "+ selNum);
		System.out.println("name : "+this.name);
	}
	public static void print2() {
//			System.out.println("name : "+name); 	// 에러  static this 사용안됨 , 
//			System.out.println("age : "+this.age);	// 에러	객체생성 없이 해당 클래스에서 바로 활용
	
	
	}
}
