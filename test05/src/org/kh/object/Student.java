package org.kh.object;

public class Student {

	String name = "유정환";
	int kor = 80; 						//접근 제어자가 없으면 같은 패키지에서만 사용 가능
	int eng = 70;
	int mat = 60;
	int tot() {
			return this.kor+this.eng+this.mat;
	}
	double avg() {
		    return (this.kor+this.eng+this.mat) / 3.0f;
	}
	 void resulting() {								// void 사용 반환이 필요없는 경우
		 System.out.println("이름 :" +this.name+",총점 : "+this.tot()+"평균 : "+this.avg());
	 }
}

