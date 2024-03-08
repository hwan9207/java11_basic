package sec5;
//Queue : FIFO(First In First Out) 구조  ex) 태스크 작업 순서
//Stack : LIFO(Last In First Out) 구조 ex) 최근 작업 목록
public class BookSheIfEX01 {

	public static void main(String[] args) {
		Queue a1;
		a1 = new BookSheIf();
		a1.enQueue("관악산 등산 경로");
		a1.enQueue("아방구 짜장면");
		a1.enQueue("ArrayList는 끝에 저장하고 중간에 저장하고 싶은곳에 저장 할 수 있나?");

		System.out.println(a1.deQueue());
		System.out.println(a1.deQueue());
		System.out.println(a1.deQueue());
	}
}
