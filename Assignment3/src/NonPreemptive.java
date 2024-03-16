
public class NonPreemptive
{
	public static void main(String[] args)
	{
		int a = 32;
		double d = (double) a;
		float f = (float) a;
		boolean b = (a==15);
		String str = Integer.toString(a);
		
		System.out.println("Originally Integer value is: " + a);
		System.out.println("Double value is: " + d);
		System.out.println("Float value is: " + f);
		System.out.println("Boolean value is: " + b);
		System.out.println("String value is: " + str);
	}

}
