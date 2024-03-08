package sec4;

//인터페이스는 다중 상속 가능함 - 추상메소드만 있어서?
public class Market implements Buy, Sell {

	public void sell() {
		System.out.println("sell");
	}
	public void buy() {
		System.out.println("buy");
	}
}
