package com.javaProgram.codingChallange.streams.mapDemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class employee
{
	int id;
	String name;
	double salary;
	
	public employee(int id, String name, double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
}

public class FilterAndMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<employee>employeeList=Arrays.asList(new employee(1,"Prashant",25000.23),new employee(2, "Jyoti", 55000.34));
		List<Double>resultList=new ArrayList<Double>();
		resultList=employeeList.stream().
				filter(employee->employee.salary>50000.0).
				map(employee->employee.salary*2).
				collect(Collectors.toList());
		System.out.println("Result list is "+resultList);
		

	}

}
