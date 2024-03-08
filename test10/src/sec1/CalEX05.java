package sec1;

public class CalEX05 {

	public static void main(String[] args) {
		
		int num1 = 100;
		int num2 =  20;	
		
		Repeator r1;
		r1 = new Repeator() {
			public int multiply(int num1, int num2) {
				return num1 * num2;
			}
			public int divide(int num1, int num2) {
				int su = 0;
				if(num1>num2) su = num1 / num2;
				else su = num2 / num1;
				return su;
			}
			int power(int num1, int num2) {
				int tmp = num1;
				for(int i=1;i<num2;i++) {
					num1 = num1 * tmp;
				}
				return num1;
			}
			
		};	 
		System.out.println("원주율 : "+r1.PI);
		System.out.println("덧셈 : "+r1.add(num1, num2));
		System.out.println("뺄셈 : "+r1.subtract(num1, num2));
		System.out.println("곱셈 : "+r1.multiply(num1, num2));
		System.out.println("나눗셈 : "+r1.divide(num1, num2));
		System.out.println("거듭제곱 : "+r1.power(num1, num2));
	}
}
