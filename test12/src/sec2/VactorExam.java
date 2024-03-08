package sec2;

import java.util.List;
import java.util.Vector;

public class VactorExam {

	public static void main(String[] args) {
		List<Notice> nVector = new Vector<>();
		nVector.add(new Notice("제목1","내용1","유정환1"));
		nVector.add(new Notice("제목2","내용2","유정환2"));
		nVector.add(new Notice("제목3","내용3","유정환3"));
		nVector.add(new Notice("제목4","내용4","유정환4"));
		nVector.add(new Notice("제목5","내용5","유정환5"));
		nVector.add(new Notice("제목6","내용6","유정환6"));
		
		System.out.println("제목\t내용\t작성자");
		for(Notice n : nVector) {
			System.out.println(n.getTitle()+"\t"+n.getContent()+"\t"+n.getAuthor());
		}
		for(Notice n : nVector) {
			System.out.println(n);
		}
		nVector.remove(2);
		Notice no = new Notice("제목","내용","유정환");
		nVector.set(2, no); // 그 자리에 있는 값을 지우고 그 자리에 추가 되버림
		for(int i=0;i<nVector.size();i++) {
			Notice n = nVector.get(i);
			System.out.println(n.getTitle()+"\t"+n.getContent()+"\t"+n.getAuthor());
		}
				System.out.println(nVector.get(0)); 
				System.out.println(nVector.get(3));
				System.out.println(nVector.get(2));
				for(Notice n : nVector) {
					System.out.println(n);
				}		
//ArrayList는 내용이 없는 인스턴스의 메모리가 그대로 차지 되고 있으나 Vector는 내용이 없으면, 메모리에서 자동 제거됨.
	}
}
