package com.javaProgram.codingChallange;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class NthHighesElementFromList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arrayList=new ArrayList<Integer>();
		arrayList.add(3);
		arrayList.add(1);
		arrayList.add(2);
		//Sorting list in descending order using Collections.sort() method
		Collections.sort(arrayList);
		System.out.println("Largest element from list is"+arrayList.get(arrayList.size()-1));
		System.out.println("Second largest element from list is "+arrayList.get(arrayList.size()-2));
	}

}
