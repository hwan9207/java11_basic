package templatemethod;
//House(��)�� ¢�� ���� �޼ҵ带 �����ϵ�, ��ᰡ �������� ���� �͵��� �߻� �޼ҵ�� ����
public abstract class HouseTemplate {
	protected void buildHouse() {
		buildPillars();
		buildWalls();
		buildWindows();
		buildFoundation();
	}
	private void buildWindows() {//������ ��ü ����� ��������� �ƴϿ���  private �ɾ ���� ���ϰ�!?
		System.out.println("���� â�� �����");
	}
	public abstract void buildWalls(); //���� ��ü�� ��� ���� ���� ��
	public abstract void buildPillars();
	private void buildFoundation() {
		System.out.println("��ü/��� ���� ��ῡ �´� �����縦 �����Ͽ����ϴ�.");
	}
}