package Iterator;

public class Sheep implements Animal{

	@Override
	public void eat() {
		System.out.println("길쭉한 풀을 뜯어 먹습니다.");
	}

	@Override
	public void sleep() {
		System.out.println("누워서 잘 잡니다.");
	}

	@Override
	public void soud() {
		System.out.println("음메하고 웁니다.");
	}
	
}
