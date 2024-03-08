package sec1;

class StudentMap<K, V>{
	private K key;
	private V value;
	
	public StudentMap() {}

	public StudentMap(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "StudentMap [key=" + key + ", value=" + value + "]";
	}
	
	
	
	
}

public class GenericExam2 {

	public static void main(String[] args) {
		StudentMap<Integer, String> s1 = new StudentMap<>(1, "yu"); 
		StudentMap<Integer, String> s2 = new StudentMap<>(2, "kim");
		StudentMap<Integer, String> s3 = new StudentMap<>(3, "park");
		StudentMap<Integer, String> s4 = new StudentMap<>(4, "cho");
		StudentMap<String, Integer> s5 = new StudentMap<>("cho",5); 
		
		System.out.println(s5.toString());
		
	}

}
