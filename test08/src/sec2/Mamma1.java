package sec2;
//Anlmal(qnah)
public class Mamma1 extends Animal { //Animal 로 부터 상속 받은 Mammal 클래스
	private int leg;

	public int getLeg() {
		return leg;
	}

	public void setLeg(int leg) {
		this.leg = leg;
	}

//	@Override
//	public String print() {
//		return "Mamma1 [leg=" + leg + "]";
//	}

	public String print() {
		return "Mamma1 [leg=" + leg + "] , name=["+name+"]"; //super 안붙여도 상관 무? 
	}														 // 같은 패키지여서 super 안붙여도 상관없음	
															 //private 이면 name=["+ super.getName() +"]";
}
