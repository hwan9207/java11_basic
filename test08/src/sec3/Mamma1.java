package sec3;


public class Mamma1 extends Animal { //Animal 로 부터 상속 받은 Mammal 클래스
	protected int leg; //같은 패키지거나 상속 관계에서 접근 가능

	public int getLeg() {
		return leg;
	}

	public void setLeg(int leg) {
		this.leg = leg;
	}

	@Override
	public String toString() {
		return "Mamma1 [leg=" + leg + "], name=["+super.name+"]";
	}
	
}
