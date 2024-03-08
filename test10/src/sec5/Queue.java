package sec5;

public interface Queue {
	void enQueue(String title);		// 저장된 데어터의 끝
	String deQueue();				//저장된 데이터의 시
	int getSize();					//현재 Queue에 저장된 개수
	
}
