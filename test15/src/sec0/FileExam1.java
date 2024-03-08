package sec0;

import java.io.File;
import java.io.IOException;

public class FileExam1 {

	public static void main(String[] args) throws IOException{
		String file1 = "d:\\yu\\java2\\a.txt"; // ���� ��� ,��� ������ \\
		String file2 = "http:192.168.1.104/data/menual/java.txt"; // ���� ��� (���� ��� url) ��� ������ /
		
		File f1 = new File(file1); //File�� ������ ����ó�� �������
		File f2 = new File(file2); 
		
		String fileName = f1.getName();
		String fileName1 = f2.getName(); 
		System.out.println(fileName);
		System.out.println(fileName1);
		int pos = fileName.lastIndexOf(".");
		System.out.println("Ȯ���ڿ� ���ϸ��� ������ ��Ÿ���� ���� ��ġ : "+pos);
		System.out.println("Ȯ���ڸ� ������ ������ �̸� : "+fileName.substring(0,pos));
		System.out.println("Ȯ���� : "+fileName.substring(pos+1));
		System.out.println("��θ� ������ ������ �̸�(������) : "+f1.getAbsolutePath());
		System.out.println("��θ� ������ ������ �̸�(�����) : "+f1.getPath()); //������ ���� ���..
		System.out.println("������ ���� �ִ� ���� ���丮 : "+f1.getParent());
		System.out.println("��� ������ : "+ File.separator);
		//�ý��� ���� �� �������� => System.getProperty("�ý��� ������")
		System.out.println("���� ����� ���丮(user.dir) : "+System.getProperty("user.dir"));
		System.out.println("�ڹ� ���丮(sun.boot.class.path) : "+System.getProperty("sun.boot.class.path"));
		System.out.println("�ü��(OS) ȯ�溯�� �� : "+System.getenv()); 
		System.out.println("JAVA_HOME : "+System.getenv("JAVA_HOME")); // ������ �Է��ϸ� �� �ش� �� ���
		
	}
}
