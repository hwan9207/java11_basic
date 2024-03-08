package sec2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Pattern : Ư�� �����Ͱ� ������ �´��� ���Ϸ��� �� ��� ������ ������ �����ϴ� Ŭ����
//Matcher : Ư�� ������ ���°� �´��� ���ϴ� Ŭ����
//���Խ�(Reg Expression)
public class PatternExam2 {
	public static void main(String[] args) {
		String[] dt = {"bag", "yu", "9to6", "8to5", "single", "home", "�ѱ�", "!@#$"};
		//������ ����
//		Pattern p = Pattern.compile("[a-z]*"); //* ���� .. * ������ ��ü������ ���� ���ϴµ�
		Pattern p1 = Pattern.compile("[a-z0-9]*"); 
		Pattern p2 = Pattern.compile("s[a-z]*"); 
//		Pattern p = Pattern.compile("[��-��]*"); 
		Pattern p = Pattern.compile("^[0-9]*"); 
		for(int i=0; i<dt.length;i++) {
			Matcher m = p2.matcher(dt[i]);
			if(m.matches()) {
				System.out.println("���� ��ġ : "+dt[i]);
			}
		}
		
	}
}
