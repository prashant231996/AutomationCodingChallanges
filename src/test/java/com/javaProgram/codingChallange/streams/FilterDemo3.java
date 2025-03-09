package com.javaProgram.codingChallange.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>words=Arrays.asList("Prashant",null,"Jyoti");
		List<String>result=new ArrayList<String>();
        result=words.stream().filter(word->word!=null).collect(Collectors.toList());
        System.out.println("Result list is "+result);
	}

}
