//package sec2;
//
//import java.io.File;
//import java.io.IOException;
//
//import com.fasterxml.jackson.core.JsonGenerationException;
//import com.fasterxml.jackson.databind.ObjectMapper;
//
//class User{
//	private String name;
//	private int age;
//	
//	public User() {}
//	public User(String name, int age) {
//		this.name = name;
//		this.age = age;
//	}
//	
//}
//public class JacksonExam1 {
//	public static void main(String[] args) throws IOException{
//		
//		ObjectMapper mapper = new ObjectMapper();
//		User u1 = new User("yu",32);
//		
//		try {//��ü�� JSON Ÿ���� ���Ϸ� ��ȯ
//			mapper.writeValue(new File("member.json"), u1);
//			//��ü�� JSON Ÿ���� String���� ��ȯ
//			String jsonUser = mapper.writeValueAsString(u1);
//			System.out.println(jsonUser);
//			
//		}catch(JsonGenerationException e) {
//			System.out.println("1111");
//		}
//	}
//}
