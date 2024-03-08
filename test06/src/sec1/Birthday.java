package sec1;

public class Birthday {
	private String name;
	private int year;
	private int month;
	private int day;
	
	public void birth() {
		System.out.println(year+"-"+month+"-"+day);
	}
	public void birthAdd() {
		System.out.println();
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	
}
