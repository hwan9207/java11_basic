package Lunch;

public class Go {

	public static void main(String[] args) {
		Lunch01 b1;
//		b1 = new Lunch01();
		
		
		b1 = new Korean();
		b1.print();
//		b1.print("김찌"); //오류난다..
		
		Lunch01 b2;
		b2 = new Chinese();   
		b2.show();				//에러- Lunch에 show 안만들어 줬더니 오류
//		b2.show("중식");
	}
}
