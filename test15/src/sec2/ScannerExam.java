package sec2;

import java.util.Scanner;


class Person {
	private String name;
	private int point;
	private double d;
	public Person(String name, int point, double d) {
		this.name = name;
		this.point = point;
		this.d = d;
	}
	public Person() {}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public double getD() {
		return d;
	}
	public void setD(double d) {
		this.d = d;
	}
	@Override
	public String toString() {
		return "person [name=" + name + ", point=" + point + ", d=" + d + "]";
	}
	
	
}
public class ScannerExam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 입력 : ");
		String name = sc.next();
		
		System.out.println("점수 입력 : ");
		int point = sc.nextInt();
		
		System.out.println("몸무게 : ");
		double d = sc.nextDouble();
		
		Person p = new Person(name, point, d);
		System.out.println(p.toString());
	}
}
