package sec1;

public class Employee {
	public String name;	 //메소드(행위) 는 구현을 무조건 해줘야 함	
	public String grade; //필드(속성)여서 구현을 안해줘도 오류가 안남 
	public Employee(String name) {
		this.name = name;
	}
	public Employee() {
		super();
	}
	
}
