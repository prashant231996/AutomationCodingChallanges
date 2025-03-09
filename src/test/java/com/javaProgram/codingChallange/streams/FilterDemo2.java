package com.javaProgram.codingChallange.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo2 {
	
	public static void main(String args[])
	{
		List<String>names=Arrays.asList("Prashant","Jyoti","Purva","Soumya");
		List<String>result=new ArrayList<String>();
		//Filter ==> Filter are basically use to filter elements from the stream element
		result=names.stream().filter(name->name.length()>6 && name.length()<15).collect(Collectors.toList());
		System.out.println("Resultant list is "+result);
		names.stream().filter(name->name.length()>6 && name.length()<12).forEach(name->System.out.println(name));
	}

}
