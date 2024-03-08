package P123;

public class StarCafe extends Menu {
	private String name;
	private int money;
	private String coffee;
	private int count;
	
	public void take(int money) {
		this.money+= money;
		count++;
	}

	public String toString() {
		return "StarCafe [name=" + name + ", money=" + money + ", coffee=" + coffee + ", count=" + count + "]";
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

	public String getCoffee() {
		return coffee;
	}

	public void setCoffee(String coffee) {
		this.coffee = coffee;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}


}
