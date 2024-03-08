package org.kh.object;
																	
public class Member {
						
	public String id;                 // public 다른 패키지에서 사용 가능함
			String pw;		         // default - 이렇게만 선언되면 같은 패키지에서만 사용 가능함	
	private String email;	        //private 개인용 여기 해당 클래스에서만 사용 가능함	(다른곳 접근 방지 보안 정보은닉,(캡슐화..))
			int birth; 			   // 마우스 우클릭 소스 to string
			String tel;
	
//	public void setEamail(String email) { // private 를 걸어도 public void 메서드 이용해서 다른곳에서 사용 가능!
//		this.email = email; //(String email) < 매개변수 email 랑 이름이 같아서 this.email this를 붙여야함
//	}
	
	
	@Override  // 상속 받아서 내용을 바꿔서 ... 뭐 한댄다
	public String toString() { // 마우스 우클릭 소스 to string 자동으로.. 스트링 어쩌고
		return "Member [id=" + id + ", pw=" + pw + ", email=" + email + ", birth=" + birth + ", tel=" + tel + "]";
	}

	// 마우스 우클릭 소스 겟엔 셋털
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	} 
}

//public > protected > default > private>
//모든패키지  같은 패키지    같은 패키지  해당 클래스에서만
//			상속/연관	
//        다른 패키지에서?