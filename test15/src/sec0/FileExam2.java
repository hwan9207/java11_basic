package sec0;

import java.io.File;
import java.io.IOException;

public class FileExam2 {

	public static void main(String[] args) throws IOException{
		//파일의 상대 경로 지정
		File f1 = new File("a.txt"); //현재 디렉토리에 파일이 있든 없든 파일 객체가 생성..
		File f2 = new File("../sec1/a.txt"); // ../ -> 상위디렉토리 , 현재 디렉토리 sec0에서 상위 디렉토리로 이동한 후 sec1 디렉토리로 이동하여 a.txt ..
		
		//파일의 절대 경로 지정
		File f3 = new File("d:"+File.separator+"yu"+File.separator+"java2"+File.separator+"a.txt");
		System.out.println(f3);
		//= d:\\yu\\java2\\a.txt 랑 같은.. , File.separator = \
		String path = "d:\\yu\\java2\\a.txt";
		File f4 = new File(path, "a.txt");
		File f5 = new File(path,"d:\\yu\\java2\\a.txt");
		System.out.println(f4);
		
//		if(f1==null) {
//			System.out.println("현재 파일이 존재하지 않습니다");
//		}else {
//			System.out.println("존재");
//		}
		
		
	}
}
