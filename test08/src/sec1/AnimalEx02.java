package sec1;

import sec2.Animal;	// 디폴트는 같은 패키지에서만 사용 가능한대 
import sec2.Mamma1;	// 디폴트 제어자 여도 임폴트문 사용하면 다른 패키지에서 사용 가능함
import sec2.Birds;  // 다른 패키지 불러오려고

public class AnimalEx02 { 

	public static void main(String[] args) {
		Animal a1; 	// sec2에 있는 Animal
		a1 = new Animal();
		a1.setName("얼룩말");
		a1.setSpine(true);
		System.out.println(a1.print());
		
		a1 = new Mamma1();
		a1.setName("젠장");
//		a1.leg = 4; // Animal에 없음 에러
		System.out.println(a1.print());
		
		
		
		
	}
}
