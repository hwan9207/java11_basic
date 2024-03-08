package sec3;

public class PeopleEx01 {

	public static void main(String[] args) {
		People a1 = new People();
		People.selNum =2400;	
		a1.name="유정환";	 	    
		a1.age=32;
		a1.add="강서구";

		People a2 = new People();
		People.selNum =400; //a1에서 selnum 초기화값 먼저 줬지만 static 형태라 나중값으로 초기화됨
		a2.name="최여명";
		a2.age=30;
		a2.add="영등포";
		
		
		People.print2(); //클래스명.메소드명 
		
		System.out.println(a1.selNum+","+a1.name); // static 붙이니 a1 값이 a2 따라감 .. static 메모리 공유
		System.out.println(a2.selNum+","+a2.name);
	}
}
