package Iterator;

import java.util.Iterator;

//Sheep �� �迭�� �����ϰ�, �и��ϰ��� �� ���
public class SheepIterator implements Iterator<Sheep> { // Iterator �������̽�
	private Sheep[] sheeps;
	int position = 0;
	
	public SheepIterator(Sheep[] sheeps, int position) {
		this.sheeps = sheeps;
//		this.position = position; �迭�� �˾Ƽ� ������ ����ϱ�
	}

	@Override
	public boolean hasNext() {
		if(position >= sheeps.length || sheeps[position] == null) {
			return false;
		}else {
			return true;
		}
	}

	@Override
	public Sheep next() {
		Sheep tmpSheep = sheeps[position];
		position++;
		return tmpSheep;
	}
	
}
