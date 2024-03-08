package sec4;
//객체 배열
//5명의 국어, 영어, 수학 점수를 Scanner를 활용하여 키보드로 입력받아 총점, 평균, 학점을 계산하여
//아래와 같은 출력 형태로 출력하도록 하는 프로그램을 작성하시오.

/*
	번호	국어	영어	수학	총점	평균		학점
	1	90	90	90	270	90.0	A
	2	80	70	60	210	70.0	C
	3	90	80	70	240	80.0	B
	4	60	90	70	220	73.3	C
	5	70	90	90	250	83.3	B
*/

public class Student {
	int num;
	private int kor;
	private int eng;
	private int mat;
	
	int tot(){ //private 붙으면 왜 오류가 나는거지..;;
		return this.kor+this.eng+this.mat;
	}
	double vag() {
		return (this.kor + this.eng + this.mat) /3.0f;
	}
	
	public String hak() {
		String h = "A";
		if(this.vag()>=90) h ="A";
		else if(this.vag()>=80) h="B";
		else if(this.vag()>=70) h="C";
		else if(this.vag()>=60) h="D";
		else h="F";
		return  h;
	}
	
	public void print() {
		System.out.printf("%d\t%d\t%d\t%d\t%d\t%2.f\t",this.num, this.kor, this.eng, 
				this.mat, this.tot(), this.vag() );
	}
	
	public String toString() {
		return "Student [num=" + num + ", kor=" + kor + ", eng=" + eng + ", mat=" + mat + "]";
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	
	}
}
