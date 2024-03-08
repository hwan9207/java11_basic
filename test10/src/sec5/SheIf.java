package sec5;

import java.util.ArrayList;

public class SheIf {
	//ArrayList<String> => 배열..
	protected ArrayList<String> sheIf;
	public SheIf() {
			sheIf = new ArrayList<String>();
	}
	public ArrayList<String> getSheIf() {
		return sheIf;
	}
	public int getCount() {
		return sheIf.size();
	}
}
