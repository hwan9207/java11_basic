package sec1;

import java.text.SimpleDateFormat;
import java.util.Date;
//SimpleDateFormat : ��¥ ǥ�������� ������ �� Ȱ���ϴ� Ŭ����
public class DateFormatExam {

	public static void main(String[] args) {
		Date today = new Date();
		//ǥ������ �ڵ� : y-�� , M-�� (�빮�ڷθ� �е� m�̶�), d-��, h-��, m-��, s-�� E(�빮��!)-����, a-����/���� W(�빮��)-�� �� �� ��° �� w-�� �� ���° ��
		SimpleDateFormat f1 = new SimpleDateFormat("yyyy��MM��dd��hh��mm��ss��");
		SimpleDateFormat f2 = new SimpleDateFormat("yyyy-MM-dd (E), hh:mm:ss (a)");
	
		//��¥ �����Ϳ��� Ư�� ǥ�������� �ο��� ���ڿ��� ��ȯ
		String t1 = f1.format(today);
		String t2 = f2.format(today);
	
		System.out.println(t1);
		System.out.println(t2);
	}
}
