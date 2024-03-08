package P123;

public class BeenCafe extends Menu {
	private String name;
	private int money;
	private String coffee;
	private int count;
	
	public void take() {
		this.money+= money;
		count++;
	}

	public void show() {
		System.out.println(this.name + "에서");
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
