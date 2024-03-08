package sec1;

public class Desktop implements Computer {

	@Override
	public void display() {
		System.out.println("display 모니터");
	}

	@Override
	public void typing() {
		System.out.println("typing");
	}

	@Override
	public void power(boolean sw) {	 //인터페이스에서 void 타입을 해서 바꾸면 에러남
		if(sw) System.out.println("전원 온");
		else System.out.println("전원 오프");
	}
	public void power(String name, boolean sw) {
		//오버로딩.. 에러 안난다 오버라이드랑 유형 타입이 달라서? 위에는 boolean 인데 / String, boolean 타입 
	}
}
