package sec4;

public class Shop implements Delivery {

	public void buy() {
		System.out.println("구매하기");
	}
	public void sell() {
		System.out.println("판매하기");
	}

	public void delivery() {
		System.out.println("판매하기");
	}
}


/*인터페이스는 추상메서드 집합체이다 선언만 가능하나 default 나 static을 이용해 구현 가능하다
 * public static final 다 이 형태 이므로 생략 가능하다
 * 인터페이스 끼리 extends 상속 가능하며 다중 상속도 가능하다
 * 인터페이스로부터 상속받은 추상클래스는 추상클래스에 따로 자기가 메소드 추가 가능 
 * ...........등드읃ㅇ등 알겠고
 */

