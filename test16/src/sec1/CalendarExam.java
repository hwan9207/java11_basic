package sec1;

import java.util.Calendar;

public class CalendarExam {
//static
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance(); //��Ŭ��
		int year = today.get(Calendar.YEAR);
		int month = today.get(Calendar.MONTH)+1; //0~11.. ����Ҷ� +1
		int day = today.get(Calendar.DATE);
		
		int doy = today.get(Calendar.DAY_OF_YEAR);
		int dom = today.get(Calendar.DAY_OF_MONTH);
		int dow = today.get(Calendar.DAY_OF_WEEK);
		
		int hour12 = today.get(Calendar.HOUR); //12�ð���
		int hour24 = today.get(Calendar.HOUR_OF_DAY); //24�ð���
		int minute = today.get(Calendar.MINUTE); // ��
		int second = today.get(Calendar.SECOND); 
		int ampm = today.get(Calendar.AM_PM); //�����̸� 0 ���ĸ� 1
		
		int timeZone = today.get(Calendar.ZONE_OFFSET);
		int lastDate = today.getActualMaximum(Calendar.DATE); // �̴��� ������ ��
		int firstDate = today.getActualMinimum(Calendar.DATE); // �̴��� ù��
		
		
		System.out.println("���� �⵵ : "+year);
		System.out.println("���� �� : "+month);
		System.out.println("���� �� : "+day);
		
		System.out.println("������ "+year+"����"+doy+"�� ° ��");
		System.out.println("������ "+month+"���� "+dom+"��° ��");
		System.out.println("���� �̹� ���� "+dow+"�� ° ��");
		
		String[] wk = {"", "��", "��", "ȭ", "��", "��", "��", "��", "��"};
		System.out.println("������ "+wk[dow]+"���� �Դϴ�.");
		System.out.println(timeZone);
		
	}

}
