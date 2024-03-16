package com.instance;

public class Vehicle
{	
	public void feature(String model, String owner_name)
	{
		System.out.println("Model Name is : " +model);
		System.out.println("Name of the Owner is: "+owner_name);
	}
	public void feature(String model, String owner_name, String plate_no)
	{
		System.out.println("Model Name is : " +model);
		System.out.println("Name of the Owner is: "+owner_name);
		System.out.println("Plate number of the Vehicle is: "+plate_no);
	}
	public static void main(String[] args)
	{
		Vehicle v = new Vehicle();
		v.feature("Mercedese", "Geeta");
		System.out.println("------------");
		v.feature("Audi", "CDAC", "MH04 AU 888");
	}
}