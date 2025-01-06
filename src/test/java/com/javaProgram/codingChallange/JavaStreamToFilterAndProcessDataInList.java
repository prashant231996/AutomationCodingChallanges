package com.javaProgram.codingChallange;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class JavaStreamToFilterAndProcessDataInList {
	
	private int productId;
	private String productName;
	private double productPrice;
	

	public JavaStreamToFilterAndProcessDataInList(int productId, String productName,double productPrice )
	{
		this.productId=productId;
		this.productName=productName;
		this.productPrice=productPrice;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<JavaStreamToFilterAndProcessDataInList>products=new ArrayList<JavaStreamToFilterAndProcessDataInList>();
		products.add(new JavaStreamToFilterAndProcessDataInList(1,"TV",3000.0));
		products.add(new JavaStreamToFilterAndProcessDataInList(1,"Washing Machine",5000.0));
		products.add(new JavaStreamToFilterAndProcessDataInList(1,"Fridge",4000.0));
		products.add(new JavaStreamToFilterAndProcessDataInList(1,"Fridge",11000.0));
		
		List<Double>productPrice=products.stream().filter(p->p.productPrice>3000.0)
				                .filter(p->p.productName.contains("Fridge"))
                                .map(p->p.productPrice)
                                .collect(Collectors.toList());
		
		System.out.println("Printing product prices which are greater than 3000");
		for(double price:productPrice)
		{
			System.out.println("Product price is "+price);
		}
		
	}

}
