package sec1;

public class AbstractEx01 {

	public static void main(String[] args) {
		//User a1 = new User(); //추상화 클래스를 생성 해야되서.. 추상 메소드의 구현 내용이 기술되어 있지 않아 생성할 수 없다.
		User a1;
		a1 = new Member();
		a1.setIp("1121");
		a1.setPort(80);
		a1.connect();
	
		a1=new Staff();
		a1.connect();    //추상클래스 추상메소드 연걸?
		
		Member a2;
		a2=new Member();
		a2.setIp("123123");
		a2.setId("sdf");
		a2.connect();
		
		Staff s1;
		s1 = new Staff();	 
		s1.setIp("1232164");
		a2.connect();		//선언을 하면 어디서든 가능
		s1.connect();
		
//		User u1;
//		u1 = new User();  //추상화 클래스는 자기 자신을 객체로 바로 생성하지 못하고 자식 클래스를 인스턴스화 하여 사용한다.
//		public Member
	
	}
}
