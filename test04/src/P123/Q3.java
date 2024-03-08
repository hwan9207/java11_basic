package P123;

public class Q3 {

	public static void main(String[] args) {
		for(int i=2;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				if(j>i) break;
				System.out.println(i+"x"+j+"="+i*j);
			}
			System.out.println();
		}
	
		for(int i=2;i<=9;i++) {
			for(int j=1;j<=i;j++) {
				System.out.println(i+"x"+j+"="+i*j);
			}
			System.out.println();
		}}

}
