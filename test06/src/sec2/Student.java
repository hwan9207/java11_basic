package sec2;

public class Student {
	private String name;
	private	int age;
	private int grade;
	private int money;
	
	public Student(String name, int money) {
		this.name = name;		// 학생 이름과 돈을 매개변수로 받는 생성자
		this.money = money;
	}
	public void takeBus(Bus bus) {
		bus.take(2000);			//Bus 클래스에서 
		this.money-=2000;
	}
	public void showInfo() {
		System.out.println(name+"님의 남은 돈은 "+money+" 입니다.");
	}
	
	
	public void print() {
		System.out.println("Student [name=" + name + ", age=" + age + ", grade=" + grade + ", money=" + money + "]");
	}

	public Student() { 
		super();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	
	
	
	
}	
	
	

