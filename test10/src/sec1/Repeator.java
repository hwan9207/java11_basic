package sec1;

public abstract class Repeator implements Calcurator {
		//추상클래스는 본인이 원하는것만 추상화 할 수 있다
	
		//추상 클래스 : 일부 또는 전부 추상화 메소드가 선언된다.
		//인터페이스로 부터 상속 받은 추상 클래스는 전부 또는 일부만 추상화 할 수 있으며,
		//물려 받은 메소드에 대하여 원하는 메소드만 구현이 가능
		//별도의 추상 메소드도 정의할 수 있음
	
	
		//추상클래스에서는 인스턴스 메소드 가능하니 구현 가능함 
	
	public int add(int num1, int num2) {
		 
		return num1 + num2;
	}

	public int subtract(int num1, int num2) {
		int su = 0;
		if(num1 > num2) su = num1 - num2;
		else su = num2 - num1;
		return su;
	}
//	public int multiply(int num1, int num2) {
//		return num1 * num2;
//	}
//	public int divide(int num1, int num2) {
//		int su = 0;
//		if(num1>num2) su = num1 / num2;
//		else su = num2 / num1;
//		return su;
//	}
	
	abstract int power(int num1, int num2); // Calcurator에 없는 추상화 메소드 선언
	
//	abstract int power(int num1, int num2) { // 추상클래스에서 추상메소드 바로 구현 불가능?
//		int tmp = num1;
//		for(int i=1;i<num2;i++) 
//			num1 = num1 * tmp;
//		return num1;
//	};	
}	

