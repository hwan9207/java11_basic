package P123;

public class Q2 {

	public static void main(String[] args) {
		System.out.println("2단\t4단\t6단\t8단");
			for(int i=1;i<=9;i++) {
				for(int j=2;j<=9;j+=2) {
					System.out.print(j+"x"+i+"="+j*i+"\t");
				}
				System.out.println();
			}
			for(int i=1;i<=9;i++) {
				for(int j=2;j<=9;j++) {
					if(j%3==0) continue; 
					System.out.print(j+"x"+i+"="+j*i+"\t");
				}
				System.out.println();
			}
	}

}
