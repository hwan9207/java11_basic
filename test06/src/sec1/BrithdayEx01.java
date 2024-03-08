package sec1;

public class BrithdayEx01 {

	public static void main(String[] args) {
		Birthday a1 = new Birthday();
		a1.setName("유정환");
		a1.setYear(92);
		a1.setMonth(7);
		a1.setDay(6);
		a1.birth();
		a1.birthAdd();
		
		Birthday a2 = new Birthday();
		a2.setName("김씨");
		a2.setYear(93);
		a2.setMonth(5);
		a2.setDay(10);
		a2.birth(); 
	}
}
