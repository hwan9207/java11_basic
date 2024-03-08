package org.kh.object2;

import org.kh.object.Member;           // 같은 프로젝트내 다른 패키지에서 임폴트 자동 생성 , 다른 패키지에서 호출받아와 사용 하려고..

public class Member2 {

	public static void main(String[] args) {
		Member name = new Member();
		
		name.id = "qwe1234"; 				//일반적인 호출
		
		name.setEmail("qwe123@nave.com");  // private를 걸고 public void 메서드를 이용해서 호출 한 상태
		
		System.out.println(name.toString());
		System.out.println("email : " +name.getEmail()); // private를 걸고 public void 메서드를 이용해서 호출 한 상태를 하나만 따로 출력하고 싶을때
													     //	getEmail() 형태 사용
		
	}

}
