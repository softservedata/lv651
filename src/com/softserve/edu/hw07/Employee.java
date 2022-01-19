package com.softserve.edu.hw07;

import java.util.Comparator;

public  class Employee {
	private String name;
	private int age;
	int salary;
	
	
	
	public Employee() {
		name= "";
		age = 0;
		salary =0; 
		
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}
		
		public Employee(String name, int age) {
			this.name = name;
			this.age = age;
		}


//		public class BySalary implements Comparator<Employee>	{
//		    @Override
//		    public int compare(Employee e1, Employee e2) {
//		        return e1.salary - e2.salary;
//		    }
//
//
//		    public class ByName implements Comparator<Employee>	{
//			    @Override
//			    public int compare(Employee e1, Employee e2) {
//			        return (e1).getName().compareTo((e1).getName());
//					    }
//			
		
		
		}
