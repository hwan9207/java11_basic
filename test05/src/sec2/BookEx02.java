package sec2;

public class BookEx02 {

	public static void main(String[] args) {

		Board b1 = new Board();
		b1.setBno(101);
		b1.setTitle("목차");
		b1.setUname("이름");
		b1.setContent("에휴");
		b1.setAuthor("난감하다");
		b1.setVisited(5);
		System.out.println(b1.toString());
	
		Notice a1 = new Notice(101,"dif","sdfdf","dfdf");
		System.out.println(a1.toString());
	}

}
