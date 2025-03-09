package com.javaProgram.codingChallange.streams.mapDemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>numbers=Arrays.asList(1,2,3,4,5,6);
		List<Integer>resultList=new ArrayList<Integer>();
		resultList=numbers.stream().map(number->number*3).collect(Collectors.toList());
		System.out.println(resultList);
		numbers.stream().map(number->number*3).forEach(number->System.out.println(number));
	}

}
