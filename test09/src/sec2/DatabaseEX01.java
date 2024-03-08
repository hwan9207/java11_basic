package sec2;

public class DatabaseEX01 {

	public static void main(String[] args) {
		Database db; 
		db = new Oracle(); // 오라클 쓰고 싶을때...
		db.connect(null, null, null, null);
	}
}
