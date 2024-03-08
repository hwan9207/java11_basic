package sec2;

public class BookEx01 {

	public static void main(String[] args) {
		Book[] book = new Book[100];
		for(int i=0;i<5;i++) {
			book[i] = new Book("제 목 :"+i,"저 자 :"+i);
		}
		for(int i=0;i<5;i++) {
			System.out.println(book[i].toString());
		}
	}
}
