package P123;

public class Q1 {

	public static void main(String[] args) {
		int num1 =10;
		int num2 =2;
		char ch ='+';
		int tmp =0;
		
		if(ch == '+') tmp = num1+num2;
		else if(ch == '-') tmp = num1-num2;
		else if(ch == '*') tmp = num1*num2;
		else if(ch == '/') tmp = num1/num2;	 // else 왜 오류나지?
		else System.out.println("오류");
		
		System.out.println(tmp);
		
		
		switch(ch) {
		case '+': tmp = num1+num2;
			
			break;
		case '-': tmp = num1-num2;
			
			break;
		case '*': tmp = num1*num2;
			
			break;
		case '/': tmp = num1/num2;
			
			break; 
		default :
			 System.out.println("집에 가자아ㅏ");
		}
		System.out.println(tmp);
	}
}
