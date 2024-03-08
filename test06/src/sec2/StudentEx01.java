package sec2;

public class StudentEx01 {

	public static void main(String[] args) {
		Student a1 = new Student();
		a1.setName("유정환");
		a1.setAge(32);
		a1.setGrade(1);
		a1.setMoney(10000);
		
		Student a2 = new Student();
		a2.setName("김씨");
		a2.setAge(32);
		a2.setGrade(1);
		a2.setMoney(10000);
		
		Bus bus1 = new Bus(6629); // bus1 이랑 bus2는 다른 버스
		a1.takeBus(bus1);
		a1.print();
		bus1.show();
		
		Bus bus2 = new Bus(652);
		a2.takeBus(bus2);
		a2.takeBus(bus2);
		a2.takeBus(bus2);
		a2.print();
		bus2.show();  // Bus 클래스에서 받아옴
		
		
		
//		Subway s1 = new Subway(6629);
//		s1.takeSubway(s1);
//		s1.show();
		
		
		
		
	}
}
