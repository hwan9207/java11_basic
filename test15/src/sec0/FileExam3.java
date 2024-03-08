package sec0;

import java.io.File;
import java.util.Date;

public class FileExam3 {

	public static void main(String[] args) {
		File f = new File("student");
		f.mkdir(); //test15가 현재 디렉토리이므로 test15 안에 student 디렉토리 생성
		//mkdir(); 파일 생성?
		
		File f2 = new File("manage/teacher/kt"); 
		f2.mkdirs(); // ->방향으로 갈수록 안쪽 폴더로 생성됨
	
		//디렉토리 생성 날짜와 시간 변경하기
		f.setLastModified(new Date().getTime()); //getTime() 안에 날짜 시간 입력하면 변경 되는듯 입력 안하면 현재 시간
		//디렉토리 읽기 전용으로 변환
		f.setReadOnly();
		
	
	}
}
