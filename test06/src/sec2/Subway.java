package sec2;

public class Subway {
	int no;
	int cut;
	int time;
	String name;
	int money;
	
	public void takeSubway(int money) {
		this.money += money;
		cut++;
	}
	public void show() {
		System.out.println("노선 :"+this.no+"지하철역 이름 :"+this.name+"지하철 요금 :"+this.money);
		
	}
	
	
	@Override
	public String toString() {
		return "Subway [no=" + no + ", cut=" + cut + ", time=" + time + ", name=" + name + ", money=" + money + "]";
	}
	public Subway() {
		this(5);
	}
	public Subway(int no) {
		this(no, 20);
	}
	public Subway(int no, int cut) {
		this(no, cut, 750);
	}
	public Subway(int no, int cut, int time) {
		this(no, cut, time, "화곡역");
	}
	public Subway(int no, int cut, int time, String name) {
		this(no, cut, time, name, 2000);
	}
	public Subway(int no, int cut, int time, String name, int money) {
		this.no = no;
		this.cut = cut;
		this.time = time;
		this.name = name;
		this.money = money;
	}
	public void takeSubway(Subway s1) {
		// TODO Auto-generated method stub
		
	}
	public void print() {
		// TODO Auto-generated method stub
		
	}
}
