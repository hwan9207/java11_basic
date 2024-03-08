package sec4;

public class ShopEX01 {

	public static void main(String[] args) {
		Shop s1;
		Delivery s2;
		
		s1 = new Shop();
		s1.buy();
		s1.delivery();
		s1.sell();
		
		s2 = new Shop();
		s2.buy();
		s2.delivery();
		s2.sell();
	
//		s2 = new Delivery(); 			 //구현 내용 기술 했는데 객체 생성이 안된다?
//		public void buy() {
//			System.out.println("구매하기");
//		}
//		public void sell() {
//			System.out.println("판매하기");
//		}
//
//		public void delivery() {
//			System.out.println("배송하기");
//		}
	}

}
