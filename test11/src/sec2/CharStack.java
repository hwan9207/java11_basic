package sec2;

public class CharStack {
	private StringBuffer stack;
	
	public CharStack() {}

	public CharStack(int capacity) {
		stack = new StringBuffer(capacity); //capacity 공간이 10글자 생긴다고?
	}
	public void push(char c) {
		
	}
	public int pop() { 
		char ch = stack.charAt(stack.length()-1);
		stack = stack.deleteCharAt(stack.length()-1);
		return ch;
	}
	public char[] list() {
		char[] arr= stack.substring(0).toCharArray();
		return arr;
	}
	public String tostring() {
		return this.stack.toString();
	}
}
