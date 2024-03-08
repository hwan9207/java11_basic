package sec1;

public class AnimalExam01 {
	public static void main(String[] args) {
		Animal a1 = new Animal(); 
		Animal a2 = new Mamma1();
		Animal a3 = new Birds();
		
//		Mamma1 m1 = new Animal(); 에러 자식 클래스는 부모를 생성 할 수 없다.
		Mamma1 m2 = new Mamma1();
//		Mamma1 m3 = new Birds(); 에러 형제 클래스도 생성 못한다.
		
		Animal a4; // 선언 
		a4 = new Animal();  // 나중에 뭐를 생성할지 선택 할 수 있다.
		a4.setName("하이에나");
		a4.setSpine(true);
		System.out.println(a4.print()); 
		System.out.println(1);
		
		a4 = new Mamma1();	 //  (형변환)
//		a4.setLeg(4);		// a4가 Animal로 선언되어 있어서..?
		a4.setName("에휴");	   // 오버라이딩에 super.이런 형태로..
		System.out.println(a4.print()); 
		//메소드 오버라이딩 : 부모 클래스로 부터 상속 받은 메소드를 다르게 구현 
		//그러므로 부모 클래스로 선언된 객체는 부모 자신 또는 자식 생성자를 활용하여 다양하게 형 변환 할 수 있다=> 다형성
		//클래스 => 캡슐화 , 정보 은닉, 재사용성, 다형성, 추상화
		
		a4 = new Birds();
		
		Birds b2;
		System.out.println(a4.print());
		
	}
}
