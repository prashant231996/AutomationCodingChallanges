package com.javaProgram.codingChallange.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamWithFilters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>arrayList=new ArrayList<Integer>();
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(5);
		arrayList.add(11);
		List<Integer>resultList=new ArrayList<Integer>();
		resultList=arrayList.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println("Before filtering the result is "+arrayList);
		System.out.println("After filtering the result is "+resultList);
		arrayList.stream().filter(n->n%2==0).forEach(n->System.out.println(n));
	}

}
