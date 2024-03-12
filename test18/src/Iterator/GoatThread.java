package Iterator;

import java.util.HashMap;
import java.util.Iterator;

//Goat를 Map으로 선언하고, 키와 값들로 분리
public class GoatThread {
	public static final int MAX_GOATS = 100;
	private int goatNum = 0;
	public static final HashMap<Integer, Goat> GOATS = new HashMap<>();
	
	public GoatThread() {
		int i;
		for(i=0;i<30;i++) { //0~29 => 30마리의 임의 GOATS Map을 생성
			GOATS.put(i,new Goat()); 
		}
		goatNum = i;
	}
	
	public void addGoat() {
		if(GOATS.size()<=MAX_GOATS) {
			GOATS.put(++goatNum, new Goat());
		}
	}
	
	public void removeGoat() {
		if(GOATS.size()>0) {
			GOATS.remove(--goatNum);
		}
	}
	
	public Iterator<Integer> createIterator(){
		return GOATS.keySet().iterator(); //key만 따로 분리하는게 keyset
	}
	
	public Iterator<Goat> goatIterator(){
		return GOATS.values().iterator(); //값 value 분리
	}
	
	public GoatThread(int goatNum) {
		this.goatNum = goatNum;
	}
	
	
}
