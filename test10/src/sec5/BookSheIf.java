package sec5;
//두 개의 인터페이스 상속 >> 각각의 인터페이스에 선언된 메소드를 하나의 클래스로 합치기(다중 상속)
//두 개의 클래스는 다중 상속이 안되므로 부모 클래스 조상 클래스 식으로 상속
//하나의 클래스와 하나의 인터페이스 상속 >> 클래스는 필드나 생성자를 인터페이스는 메소드를 하나의 클래스로 합치기
public class BookSheIf extends SheIf implements Queue {

	public void enQueue(String title) {
		sheIf.add(title);
	}

	public String deQueue() {
		return sheIf.remove(0);
	}

	public int getSize() {
		return getCount();
	}
}
