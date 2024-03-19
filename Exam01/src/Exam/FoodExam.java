package Exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FoodExam {
	
	Scanner sc = new Scanner(System.in);
	List<Food> fList = new ArrayList<>();

	public static void main(String[] args) {
		FoodExam fTest = new FoodExam();
		fTest.mainMenu();
	}		
		
	public void mainMenu() {
		boolean sw = true;
		while(sw){
			System.out.println("===음식 메뉴 리스트===");
			System.out.println("1.음식 추가");
			System.out.println("2.음식 정보");
			System.out.println("3.음식 삭제");
			System.out.println("4.프로그램 종료");
			System.out.print("번호 선택 : ");
//			int num = sc.nextInt();
			
			switch(sc.nextInt()) {
				case 1:
					add();
					break;
				case 2:	
					info();
					break;
				case 3:	
					remove();
					break;
				case 4:	
					sw=false;
					break;
			}
		 
		}
	}
	void add() {
		System.out.print("추가 할 음식 입력 : ");
		String fName = sc.next();
		System.out.print("칼로리 입력 : ");
		int k = sc.nextInt();
		fList.add(new Food(fName,k));
		System.out.println(fName+" 음식 정보가 추가 되었습니다.");
	}
	void info() {
		for(Food f:fList) {
			System.out.println(f.toString());// 이거는 fList중 하나의 해당하는 객체만 출력. 그래서 반복문을 통해 모두 출력해야 한다.
		}
	}
	void remove() {
		System.out.print("삭제하고 싶은 음식 입력 : ");
		String fName = sc.next();
		for(int i=0; i<fList.size(); i++) {
			Food fd = fList.get(i);
			if(fList.get(i).getName().equals(fName)) {
				System.out.println(fd.toString()+"이 삭제 되었습니다.");
				fList.remove(i);
			}
		}
		//fList.remove(fName); // 입력하는 객체에 접근 불가능..
	}
	
	
}
