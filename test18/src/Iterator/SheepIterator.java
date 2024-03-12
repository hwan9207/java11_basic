package Iterator;

import java.util.Iterator;

//Sheep 을 배열로 선언하고, 분리하고자 할 경우
public class SheepIterator implements Iterator<Sheep> { // Iterator 인터페이스
	private Sheep[] sheeps;
	int position = 0;
	
	public SheepIterator(Sheep[] sheeps, int position) {
		this.sheeps = sheeps;
//		this.position = position; 배열은 알아서 순서가 생기니까
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
