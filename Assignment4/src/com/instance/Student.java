package com.instance;
public class Student
{
	int id, age;
	String name;
	
	public void display()
	{
		System.out.println("...Student details...");
		System.out.println("Student ID: " + id);
		System.out.println("Student name : "+name);
		System.out.println("Student age: "+age);
	}
	public static void main(String args[])
	{
		Student std = new Student();
		std.display();
	}
}