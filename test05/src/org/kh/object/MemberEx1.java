package org.kh.object;

public class MemberEx1 {

	public static void main(String[] args) {
			
			Member name = new Member();
			name.birth = 706;
			name.id = "qwe1234"; 				//일반적인 호출
			
			name.setEmail("qwe123@nave.com");  // private를 걸고 public void 메서드를 이용해서 호출 한 상태
			
			System.out.println(name.toString());             // 
			System.out.println("email : " +name.getEmail()); // private를 걸고 public void 메서드를 이용해서 호출 한 상태를 하나만 따로 출력하고 싶을때
														     //	getEmail() 형태 사용
	
	//함수 호출 유형
	
	
	
	
	
	
	
	}
}
