package sec4;

import java.util.Deque;
import java.util.LinkedList;

public class DequeEX {
//Deque :  스텍 큐 혼합 구조 => 양쪽에서 입력 출력이 모두 가능한 구조 
	public static void main(String[] args) {
		Deque<String> d = new LinkedList<>();
		//요소 추가
		d.addFirst("앞1");
		d.addFirst("앞2");
		d.addLast("뒤1");
		d.addLast("뒤2");
		d.addLast("뒤3");
		System.out.println(d);
		
		System.out.println(d.peek()); //큐처럼 동작
		System.out.println(d.peekLast()); //스텍처럼 동작
		System.out.println(d.peekFirst()); //큐처럼 동작
		System.out.println();
		
		System.out.println(d.poll()); //큐처럼 맨 앞 요소 반환 후 제거
		System.out.println(d.pollFirst()); //큐처럼 맨 앞 요소 반환 후 제거
		System.out.println(d.pollLast()); //스택처럼 맨 뒤 요소 반환 후 제거
		System.out.println(d.pop()); //큐처럼 맨 앞 요소 반환 후 제거 
		System.out.println(d);
	}
}
