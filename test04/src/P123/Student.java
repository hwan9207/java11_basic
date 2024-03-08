package P123;

public class Student {
	private String name;
	private int money;
	
	public void print() {
		System.out.println(name+"은"+money+"가 남았습니다.");
	}
	public void starTake(StarCafe star) {
		star.take(4500);
		this.money-= money;
	}
	
	public Student() {}

	public Student(String name, int money) {
		this.name = name;
		this.money = money;
	}

	public void showInfo() {
		System.out.println(name+"님의 남은 돈은 "+money+" 입니다.");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String toString() {
		return "Student [name=" + name + ", money=" + money + "]";
	}

}
