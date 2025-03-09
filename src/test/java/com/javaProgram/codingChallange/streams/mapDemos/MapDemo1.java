package com.javaProgram.codingChallange.streams.mapDemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>vehicals=Arrays.asList("Pulsur","Honda","Scooty");
		List<String>resultInUppercase=new ArrayList<String>();
		
		//Without using streams
//		for(String vehical:vehicals)
//		{
//			resultInUppercase.add(vehical.toUpperCase());
//		}
//		System.out.println("Resultanat list is "+resultInUppercase);
		
		//With stream
		//Map=> Map is basically used to perform operation on streamed elements
		//Map==>Map is basically used to performed some operation on elemnets from collections while processing data
		resultInUppercase=vehicals.stream().map(vehical->vehical.toUpperCase()).collect(Collectors.toList());
		System.out.println("Resultanat list is "+resultInUppercase);
		
		vehicals.stream().map(vehical->vehical.toUpperCase()).forEach(vehical->System.out.print(vehical+" "));

	}

}
