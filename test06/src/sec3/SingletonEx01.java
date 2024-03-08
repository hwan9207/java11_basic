package sec3;

public class SingletonEx01 {

	public static void main(String[] args) {
		Singleton a1 = Singleton.getInstance();
		Singleton a2 = Singleton.getInstance();
		Singleton a3 = Singleton.getInstance();
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		
	}
}
