package sec0;

import java.io.File;
import java.io.IOException;

public class FileExam2 {

	public static void main(String[] args) throws IOException{
		//������ ��� ��� ����
		File f1 = new File("a.txt"); //���� ���丮�� ������ �ֵ� ���� ���� ��ü�� ����..
		File f2 = new File("../sec1/a.txt"); // ../ -> �������丮 , ���� ���丮 sec0���� ���� ���丮�� �̵��� �� sec1 ���丮�� �̵��Ͽ� a.txt ..
		
		//������ ���� ��� ����
		File f3 = new File("d:"+File.separator+"yu"+File.separator+"java2"+File.separator+"a.txt");
		System.out.println(f3);
		//= d:\\yu\\java2\\a.txt �� ����.. , File.separator = \
		String path = "d:\\yu\\java2\\a.txt";
		File f4 = new File(path, "a.txt");
		File f5 = new File(path,"d:\\yu\\java2\\a.txt");
		System.out.println(f4);
		
//		if(f1==null) {
//			System.out.println("���� ������ �������� �ʽ��ϴ�");
//		}else {
//			System.out.println("����");
//		}
		
		
	}
}
