package com.instance;

public class Employee
{	
	public void display(int emp_id, String name)
	{
		System.out.println("Employee id : " +emp_id);
		System.out.println("Employee name : "+name);
	}
	public void display(int age, double salary)
	{
		System.out.println("Age of the employee : " +age);
		System.out.println("Employee salary per month : Rs."+salary);
	}
	public static void main(String[] args)
	{
		Employee emp = new Employee();
		emp.display(342, "Geeta");
		emp.display(29, 52745.5);
	}
}