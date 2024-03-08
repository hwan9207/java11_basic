package sec2;
//추상체
//추상 클래스는 추상 메소드뿐만 아니라 생성자, 필드, 일반 메소드도 포함할 수 있습니다.
//하지만 인터페이스(interface)는 오로지 추상 메소드와 상수만을 포함할 수 있습니다.
//모든 필드는 public static final 이어야 하며, 모든 메소드는 public abstract 이어야 합니다.
//이 부분은 모든 인터페이스에 공통으로 적용되는 부분이므로 이 제어자는 생략할 수 있습니다.
//이렇게 생략된 제어자는 컴파일 시 자바 컴파일러가 자동으로 추가해 줍니다.
//인터페이스는 추상 클래스와 마찬가지로 자신이 직접 인스턴스를 생성할 수는 없습니다.
//따라서 인터페이스가 포함하고 있는 추상 메소드를 구현해 줄 클래스를 작성해야만 합니다.
//자바에서 인터페이스는 다음과 같은 문법을 통해 구현합니다.
//문법
//class 클래스이름 implements 인터페이스이름 { ... }
//만약 모든 추상 메소드를 구현하지 않는다면, abstract 키워드를 사용하여 추상 클래스로 선언해야 합니다.
//자바에서는 다음과 같이 상속과 구현을 동시에 할 수 있습니다.
//문법
//class 클래스이름 extend 상위클래스이름 implements 인터페이스이름 { ... }
//인터페이스는 인터페이스로부터만 상속을 받을 수 있으며, 여러 인터페이스를 상속받을 수 있습니다.


public interface Database {
	void connect(String url, String port, String id, String pw);
	void close(Connection conn, PreparedStatement pstmt, ResultSet rs);
	void select(String tbname, String condition);
	void insert(String tbname, String field, int field2);
	void update(String tbname, String field, int value1, String condition);
	void delete(String tbname, String condition);
	void deldte(String tbname, String condition);

	
}
