package sec0;

import java.io.File;
import java.util.Date;

public class FileExam3 {

	public static void main(String[] args) {
		File f = new File("student");
		f.mkdir(); //test15�� ���� ���丮�̹Ƿ� test15 �ȿ� student ���丮 ����
		//mkdir(); ���� ����?
		
		File f2 = new File("manage/teacher/kt"); 
		f2.mkdirs(); // ->�������� ������ ���� ������ ������
	
		//���丮 ���� ��¥�� �ð� �����ϱ�
		f.setLastModified(new Date().getTime()); //getTime() �ȿ� ��¥ �ð� �Է��ϸ� ���� �Ǵµ� �Է� ���ϸ� ���� �ð�
		//���丮 �б� �������� ��ȯ
		f.setReadOnly();
		
	
	}
}
