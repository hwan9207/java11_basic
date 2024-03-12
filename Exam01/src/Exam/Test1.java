package Exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<IPInfo> ipInfoList = new ArrayList<>(); //2번째 null 값, 
		
		ipInfoList.add(new IPInfo("123.123.123.123","홍길동"));
		ipInfoList.add(new IPInfo("123.15.123.17")); // 1번째 생성자
		ipInfoList.add(new IPInfo("177.233.111.222","홍길동"));
		
		System.out.print("ip 입력  : ");
		String ip = sc.next();
		
//			if(ipInfoList.getIp(i).equals(ip)) {  ip는 String ,ipInfoList.get(i)는 IPInfo 클래스의 객체  
		
//		for(int i=0; i<ipInfoList.size();i++) {
//			if(ipInfoList.get(i).getIp().equals(ip)){
//				System.out.println(ipInfoList.get(i).toString());
//				break;
//			}else System.out.println("일치하는 ip 사용자가 없습니다."); //4번째 
//		}
//		System.out.println("일치하는 ip 사용자가 있습니다.");
	
		if(ipInfoList.contains(ip)){
			System.out.println(ipInfoList.getIp(0).toString());
			System.out.println("일치하는 ip 사용자가 있습니다.");
		}else {
			System.out.println("일치하는 ip 사용자가 없습니다.");
		}
	}
}
