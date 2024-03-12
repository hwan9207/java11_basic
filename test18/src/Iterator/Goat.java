package Iterator;

public class Goat implements Animal {

	@Override
	public void eat() {
		System.out.println("초식 동물 입니다");
	}

	@Override
	public void sleep() {
		System.out.println("알아서 잘 잡니다.");
	}

	@Override
	public void soud() {
		System.out.println("띠껍습니다.");
	}

}
