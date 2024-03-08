package org.kh.object;

public class personEx1 {

	public static void main(String[] args) {
		
		Person yu = new Person();
		
		yu.name = "유정환";
		yu.year = 1992;
		yu.gender = "남성";
		yu.job = "사람";
		yu.running();
		
		int name;
		Person lee = new Person();
		lee.name = "최여명";
		System.out.println(lee.name);
		System.out.println(yu.name);
		System.out.println(yu.year);
		System.out.println(yu.gender);
		System.out.println(yu.job);
		
	}
}
