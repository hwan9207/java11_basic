package sec1;

class Outer {
	private int num = 10; //멤버 필드
	private static int sNum=20; //정적 멤버 필드 (데이터 공유)
	
	public Inner inner; //인스턴스 내부 클래스
	public Outer() {	//Outer 생성자를 사용하게 되면 , 자동적으로 내부클래스에 대한 인스턴스가 생성
		inner = new Inner();
	}
	class Inner{ // 내부 클래스
			int inNum = 1000;
			
			void inMethod() {
				System.out.println("내부 클래스에서 외부 클래스의 멤버 변수 : num "+ num);
				System.out.println("내부 클래스에서 외부 클래스의 정적 멤버 변수 : sNum "+ sNum);
			}
	}
	public void outMethod() { //외부 클래스에서 내부 클래스의 메서드를 호출 
		inner.inMethod(); 		//외부 안에 있는 내부 클래스여도 객체 생성하고 메서드 호출 해야하네?
	}
}
public class InnerClassExam {
//내부 클래스 : 클래스 안에 더 작은 클래스
	
	public static void main(String[] args) {
		Outer out = new Outer();
		out.outMethod(); // 타 클래스에서 객체 생성 후 외부 클래스의 멤버 메소드 호출
		out.inner.inMethod(); //타 클래스에서 객체 생성 후 내부 클래스의 멤버 메소드 호출
	
	}

}
