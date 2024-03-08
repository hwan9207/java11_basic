package sec3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

//String 타입의 List Stream 방식 활용
public class StreamExam2 {

	public static void main(String[] args) {
		List<String> lst = new ArrayList<>();
		lst.add("김");
		lst.add("이");
		lst.add("박");
		lst.add("최");
		lst.add("유");
		
		//ArrayList의 Stream화 
		Stream<String> stream = lst.stream(); //스트림화 한거?
		stream.forEach(s -> System.out.println(s)); //forEach
		System.out.println();
		lst.stream().sorted().forEach(a -> System.out.println(a)); //sorted() 배열 순이 아니고 사전상 순서?
		
		int cnt = (int) lst.stream().count();
		System.out.println(cnt);
	
	}
}
