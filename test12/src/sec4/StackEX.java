package sec4;

import java.util.Stack;

public class StackEX {
//스택 : 탑 같이 입력할 때는 쌓아 올려지고, 출력할 때는 맨 마지막에 입력한 가장 위에 입력된 데이터 부터 출력된다 
	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		
		//요소 추가
		stack.push("사과");
		stack.push("오렌지");
		stack.push("수박");
		stack.push("복숭아");
		stack.push("메론");
		
		System.out.println(stack);
		
		System.out.println(stack.peek()); // 요소 맨 위에 있는거 체크만 함
		System.out.println(stack.pop()); //맨 위에 있는 요소 반환 후 제거
	}
}
