package sec1;

//인터페이스 끼리 상속 가능함 extends 로 (동급끼리는 extends)

//인터페이스이므로 모든 메소드는 추상 메소드이므로 선언만 하여야 한다
//인터페이스에서는 인스턴스 메소드 사용 불가하니까 선언만 가능함


public interface Calcurator {
	double PI = 3.1415;  // 인터페이스 public static final(상수) 생략 가능함
	int ERROP = -9999999;
	int add(int num1, int num2);  //abstract 생략 가능
	int subtract(int num1, int num2);
	int multiply(int num1, int num2);
	int divide(int num1, int num2);
	
}
