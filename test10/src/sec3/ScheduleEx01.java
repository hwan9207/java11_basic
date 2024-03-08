package sec3;

import java.io.IOException;

public class ScheduleEx01 {

	public static void main(String[] args) throws IOException {
		
		Scheduler s = null;
		
//		Scheduler s;

		s = new Scheduler() {

		public void getNextCall() {
			System.out.println("LLL");
		}

		public void sendCallTOAgent() {
			System.out.println("ooo");
		}
	};
		
		System.out.println("전화 상담 방식[A-Z] :");
		int ch = System.in.read();
		
		if(ch=='R' || ch == 'r') s = new RoundRobin(); 
		else if(ch=='P' || ch == 'p') s= new Priority();
		else if(ch=='L' || ch == 'l') s= new LeastJob();
		else System.out.println("지원 안해");
		
		s.getNextCall();
		s.sendCallTOAgent();
	}

}
