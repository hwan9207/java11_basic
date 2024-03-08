package sec4;

//다중 상속 안됨, - 추상메소드가 아닌것도 있어서 같은 이름의 메소드가 충돌할수 있어서?
//public class Pay extends Inventory 이런 식으로 다중 상속 가능
//
public class Store extends Pay {

	public void pay() {
		System.out.println("pay");
		super.pay();
	}

	public void inventory() {
		System.out.println("inventory");
		super.inventory();
	}

}
