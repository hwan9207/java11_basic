package sec1;

import java.time.LocalDate;
import java.util.Date;

public class DateExam {

	public static void main(String[] args) {
		Date date1 = new Date();
		
		@SuppressWarnings("deprecation") // ����� ����������
		Date date2 = new Date(1992,06,06,9,30,25);
		
		@SuppressWarnings("deprecation") // ����� ����������
		Date date3 = new Date("Wed, 07 Jul 2001 9:30:25 +0900"); //+0900: RFC 822 ���� Ÿ���� 
		
		
		System.out.println(date1); //���� ��¥ �ð� ���
		System.out.println(date2); //���� �ð� ��¥ �ð� ���
		System.out.println(date3); //���� �ð� ��¥ �ð� ���
		
		LocalDate n1 = LocalDate.now();
		System.out.println(n1);
		//��¥ ��Ƽ�� => ���ڿ� ������
		String n2 = n1.toString();
		//���ڿ� ������ => ��¥ ������
		LocalDate n3 = LocalDate.parse(n2);
		System.out.println(n2);
		
	}
}
