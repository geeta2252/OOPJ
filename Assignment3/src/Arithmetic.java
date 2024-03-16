
public class Arithmetic
{
	public static void main(String[] args)
	{
		int a = 5;
		double b = 10.2;
		float c = 13.1f;
		
		double r1 = a+b+c;
		int r2 = a+(int)b+(int)c;
		System.out.println("Addition Stored as 'double' is : " + r1);
		System.out.println("Addition Stored as 'integer' is : " + r2);
	}

}
