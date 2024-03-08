package sec1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

//FileOutputStream : ������ ������ ����Ʈ ������ ���� ���� Ŭ���� 
public class FileOutputStreamExam {
	public static void main(String[] args) throws IOException {
		File f1 = new File("b.txt");
		if(f1.createNewFile()) {
			System.out.println("���� ����");
		}else {
			System.out.println("�̹� ����");
		}
		
		String data = "Hello Java";
		FileOutputStream fos = new FileOutputStream(f1);
		fos.write(data.getBytes()); //string > byte ����ȯ 
		fos.close(); 
	}
}
