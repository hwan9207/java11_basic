package sec1;
//Enum : ���������� ����̳� �ν��Ͻ��� ������ �� ���� => public, static, final(����� �� �� ���� �빮��!)
//������ ���� �ǹ̸� ��Ȯ�ϰ� �ؾ� �ϰų� �����Ͻÿ� ������ Ÿ�� �� ��ȿ�� üũ�� �Ϸ��� �� ��� Ȱ��
enum Week1{
	SUN, MON, TUE, WED, THU, FRI, SAT
}
//valueOf(String str) - ���ڿ� str�� ��ġ�ϴ� ���Ű��� ��ȯ
//values() : ����(��)�� ��ü�� �迭�� ��ȯ
//ordinal() : ����(��)�� ������ ��ȯ , index 
enum Week2{
	SUN("��"), MON("��"), TUE("ȭ"), WED("��"), THU("��"), FRI("��"), SAT("��");
	final private String day;
	
	Week2(String day){
		this.day=day;
	}
	String getDay() {
		return day;
	}
}

public class EnumExam1 {
	public static void main(String[]args) {
		String s = "MON";
		Week1 w1 = Week1.SUN;
		Week2 w2 = Week2.valueOf(s);
		
		System.out.println(w1);
		System.out.println(w2);
		
		Week1[] arrWeek1 = Week1.values();
		for(Week1 w : arrWeek1) {
			switch(w) {
				case SAT :
					System.out.println("�����");
				case SUN :
					System.out.println("�Ͽ���");
				default :
					System.out.println("����");
			}
		}
		Week2[] arrWeek2 = Week2.values();
		for(Week2 w: arrWeek2) {
			System.out.println();
			System.out.println(w.ordinal()+"��° ����=>"+w.getDay());
		}
	
	
	}
}