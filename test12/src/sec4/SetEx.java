package sec4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SetEx {
//Set : 값만 저장, 중복 혀용하지 않음, 순서 유지 하지 않음
//Set 종류 : HashSer, TreeSet
	
	public static void main(String[] args) {
		Set<String> set1 = new HashSet<>();
		Set<Integer> set2 = new TreeSet<>();
		
		set1.add("유정환");
		set1.add("최여명");
		set1.add("김지우");
		set1.add("유정환"); //중복 허용 안함
		set1.add("이은진");
		set1.add("박성래");
		set1.add("박상민");
	
		System.out.println("요소의 수 : "+set1.size());
		System.out.println(set1);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력 : ");
		String name = sc.next();
		
		if(set1.contains(name)) {
			System.out.println("해당 이름이 존재");
		}else {
			set1.add(name);
			System.out.println(name+"이 추가 되었습니다");
		}
		set1.remove("박성래");
		set1.clear();
		
		
		if(set2.isEmpty()) {
			System.out.println("set2 가 비어 있습니다.");
		}else {
			System.out.println("set2 의 요소의 수 : "+set2.size());
		}
	
		Set<Integer> set3 = new TreeSet<>(Arrays.asList(1,2,3,4,6,5,6));
		System.out.println(set3);
		
		//Set의 순회
		for(Integer s:set3) {
			System.out.print(s+" ");
		}
		
		System.out.println();
		//Set의 순회2 -> Iterator에 의한 순회
		Iterator it = set3.iterator();
		System.out.println("\nIterator에 의한 순회");
		while(it.hasNext()) {
			System.out.print(it.next()+"\t");
		}
		System.out.println();
	}
}
