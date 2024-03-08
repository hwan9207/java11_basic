package P123;

public class Q5 {

	public static void main(String[] args) {
		for(int i=1;i<=7;i++) {
		 if(i<=4) {	
			for(int j=4-i; j>0;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++) {
				System.out.print("*");
			}
				System.out.println();
		    }
		else {
			for(int j1=1;j1<i-3;j1++) {
				System.out.println();
			}
				
			}
			
		}
	}
}
