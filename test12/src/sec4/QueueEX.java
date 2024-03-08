package sec4;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEX {

	public static void main(String[] args) {
//		Queue<String> q = new Queue<>(); 에러 // Queue : 자바에서는 인터페이스 이므로 같으 구조를 가진 LinkedList를 이용하여 생성한다. 
		Queue<String> q = new LinkedList<>();
		
		//요소 추가
		q.offer("김");
		q.offer("이");
		q.offer("최");
		q.offer("박");
		q.offer("유");
		
		System.out.println(q.peek()); // 먼저 출력될거 체크
		System.out.println(q);
		System.out.println(q.poll()); // 출력 된 후에 삭제됨 , 선입선출
		System.out.println(q.poll());
		System.out.println(q);
	}
}
