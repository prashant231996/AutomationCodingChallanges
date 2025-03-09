package com.javaProgram.codingChallange.streams.mapDemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>vehicals=Arrays.asList("Pulsur","Honda","Scooty");
		List<Integer>resultList=new ArrayList<Integer>();
		//WIthout using stream
//		for(String vehical:vehicals)
//		{
//			resultList.add(vehical.length());
//		}
//		System.out.println("Result list is "+resultList);
		//With STreams
		resultList=vehicals.stream().map(vehical->vehical.length()).collect(Collectors.toList());
		System.out.println("Result list is "+resultList);
		vehicals.stream().map(vehical->vehical.length()).forEach(vehical->System.out.println(vehical));

	}

}
