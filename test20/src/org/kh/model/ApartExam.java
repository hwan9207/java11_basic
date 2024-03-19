package org.kh.model;

import java.util.ArrayList;
import java.util.List;

import section.Apartment;

public class ApartExam {

	public static void main(String[] args) {
		
		List<Apartment> apList = new ArrayList<>();
		for(int i=0; i<3;i++) {
			Apartment ap = new Apartment("화곡동", "힐스테이트", i, i, i, 84.5);
			apList.add(ap);
		}
		for(Apartment a : apList) {
			System.out.println(a.toString());
		}
		
	}
}
