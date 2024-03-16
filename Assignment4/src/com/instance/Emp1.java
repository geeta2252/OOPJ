package com.instance;

public class Emp1
{	
	public static void display(int emp_id, String name)
	{
		System.out.println("Employee id : " +emp_id);
		System.out.println("Employee name : "+name);
	}
	public static void display(int age, double salary)
	{
		System.out.println("Age of the employee : " +age);
		System.out.println("Employee salary per month : Rs."+salary);
	}
	public static void main(String[] args)
	{
		display(342, "Geeta");		//direct method calling
		Emp1.display(29, 52745.5);		//method calling with class name
	}
}