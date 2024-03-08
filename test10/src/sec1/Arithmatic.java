package sec1;

public class Arithmatic extends Repeator {
	//추상 클래스로 부터 물려 받은 메소드는 구현 클래스에서 반드시 그 구현내용을 기술해야 한다.
	
	//Repeator 추상클래스가 인터페이스 Cal로 부터 받아온 속성도 Ari로 상속을 해서 여기서 구현 가능	
	
	
	public int multiply(int num1, int num2) {
		return num1 * num2;
	}
	public int divide(int num1, int num2) {
		int su = 0;
		if(num1>num2) su = num1 / num2;
		else su = num2 / num1;
		return su;
	}
	int power(int num1, int num2) {//2, 3
		int tmp = num1;
		for(int i=1;i<num2;i++) {//1 2 
			num1 = num1 * tmp;
		}
		return num1;
	}
	public void print() {
		System.out.println("계산기, 중계기, 연산기를 구현합니다.");
	}

}
