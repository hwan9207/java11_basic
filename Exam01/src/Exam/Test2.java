package Exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> nameList = new ArrayList<>();
		nameList.add("유정환");
		nameList.add("exit");
		System.out.println(nameList);
		while(true){
			System.out.println("추가 할 이름을 입력하세요 : ");
			String name = sc.next();
			
			//if(name=="clear") 주소값 비교.. nameList.equals("clear") 이거는 배열리스트에 있냐고 비교하는거.. 그래서 추가 그쪽으로만 감
			if(name.equals("clear")) {// String 비교는 == 이 아니고 equals
//				continue; //이게 있으면 clear가 입력 했을시에 true가 되기 때문에 진행이 안되지않나? 그래서 순서를 변경 해야함
				System.out.println("이름 목록을 초기화 합니다.");
				nameList.clear();
				continue; // true 여서 다시 위로 올라가서 입력창 뜸
			}
			
			if(name.equals("exit")) {
				System.out.println("<<입력 종료>>");
				//return; 리턴 해줄게 없고.. 모든 이름 출력을 해야하니 아니면 여기서 포문 사용해서 출력을 하거나?
				//return; = false , exit가 입력 될 경우 반복출력을 실행하지 못하고 main 함수의 밖으로 나가버림
				break;
			}
			if(nameList.contains(name)) {
				System.out.println("<이미 존재하는 이름입니다.>");
			}else {
				nameList.add(name); // name 입력시 존재 안하면 추가 할 코드가 없음..
				System.out.println(name+"추가 완료.");
			 }
			
		}
		
		for(String name : nameList) {
			System.out.println(name);
		}
		
	}
}
