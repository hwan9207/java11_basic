package sec2;

import java.io.Console;

public class ConsoleExam {

	public static void main(String[] args) {
		Console c = System.console();
		
		System.out.println("�̸� : ");
		String name = c.readLine("1"); // scanner �ʹ� �޸� �Է� ��Ⱑ ���� �� �Ⱦ��� �׷� �� ������� ������ �����
		
		System.out.println("���� : ");
		int point = Integer.parseInt(c.readLine("1"));
		
		System.out.println("ü�� : ");
		double d = Double.parseDouble(c.readLine("1.0"));
		
		System.out.println("pw : ");
		char[] pwc = c.readPassword(); // readPassword ���ڹ迭�� �޾߾���
		String pw = new String(pwc); //���ڹ迭�� ���ڿ��� �� ��ȯ
		
		Person p = new Person(name, point, d);
		System.out.println(p.toString());
	}
}
