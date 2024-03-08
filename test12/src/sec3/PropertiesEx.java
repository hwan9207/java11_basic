package sec3;

import java.util.Enumeration;
import java.util.Properties;

public class PropertiesEx {

	public static void main(String[] args) {
		//Properties 선언 및 생성
		Properties pro = new Properties();
		pro.setProperty("job", "developer"); //"job" element
		pro.setProperty("name", "hwan");
		pro.setProperty("age", "32");
		pro.setProperty("local", "seoul");
		
		System.out.println(pro);
		System.out.println("엘리먼트 수 : "+pro.size());
		System.out.println("pro의 nmae : "+pro.getProperty("name")); //개별접근
		System.out.println("pro의 nmae : "+pro.getProperty("age")); //개별접근 앞의 키로 접근해야함
		
		//Properties의 순회 => 열거형으로 해당 엘리먼트의 키(속성)를 가져와 처리해야함
//		for(String s : pro) { 에러
//			
//		}
		Enumeration e =pro.propertyNames(); // = keySet
		while(e.hasMoreElements()) {
			String el = (String) e.nextElement();
			System.out.println(el+":"+pro.getProperty(el));
		}
	}

}
