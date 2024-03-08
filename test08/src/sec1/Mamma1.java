package sec1;
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
//		return "Mamma1 [leg=" + leg + "]";  // name이 여기에는 없고 Animal에 있음... 근데 상속 받아서 있는거 아닌가?
//	}

	

	@Override
	public String print() {     		//name = ["+super.getName()+"]"; => 이런식으로 부모에게 상속 받은거 겟으로 가져와야만 쓸수 있는건가?
		return "Mamma1 [leg=" + leg + "], name = ["+name+"]";
	}
//	
}
