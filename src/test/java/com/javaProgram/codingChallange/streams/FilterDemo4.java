package com.javaProgram.codingChallange.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product
{
	int id;
	String name;
	double price;
	
	public Product(int id,String name,double price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
	}
}
public class FilterDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product>list=new ArrayList<Product>();
		list.add(new Product(1,"TV",3456.33));
		list.add(new Product(2,"Fan",4838.44));
		list.add(new Product(3,"Fridge",5636.12));
		
		List<Product>resultlist=list.stream().filter(product->product.price>3000.0).collect(Collectors.toList());
		System.out.println(resultlist.size());
		list.stream().filter(product->product.price>4000).forEach(product->System.out.println(product.name));

	}

}
