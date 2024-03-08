package sec3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Visitor {
	private String name;
	private int age;
	private int price;
	
	
	
	public Visitor(){}
	public Visitor(String name, int age, int price) {
		this.name = name;
		this.age = age;
		this.price = price;
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Visitor [name=" + name + ", age=" + age + ", price=" + price + "]";
	}
}
public class StreamExam4 {

	public static void main(String[] args) {
		List<Visitor> vList = new ArrayList<>();
		Visitor v1 = new Visitor("유정환",32,1000);
		Visitor v2 = new Visitor("최여명",31,1000);
		Visitor v3 = new Visitor("김성식",16,500);
		Visitor v4 = new Visitor("김사라",72,0);
		Visitor v5 = new Visitor("박상민",21,0);
		
		vList.add(v1);
		vList.add(v2);
		vList.add(v3);
		vList.add(v4);
		vList.add(v5);
		
		
//		Stream<Visitor> vs = vList.stream();
		System.out.println("객체 순회");
		vList.stream().forEach(vis -> System.out.println(vis));
		System.out.println("이름만 출력");
		vList.stream().map(vis -> vis.getName()).forEach(s -> System.out.println(s));
		System.out.println("나이가 30 이상인 사람의 이름을 정렬하여 출력");
		vList.stream().filter(vis -> vis.getAge()>=30).map(c -> c.getName()).sorted()
		.forEach(s -> System.out.println(s));
		//filter()조건 검색할때 많이 쓴다? sorted() 사전상 순서
	}
}
