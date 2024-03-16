import java.util.Scanner;
public class BMI
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Input weight in Kgs : ");
		double weight = scan.nextDouble();
		System.out.println("Input height in meters : ");
		double height = scan.nextDouble();
		double BMI = weight / (height * height);
		System.out.println("The Body Mass Index(BMI) is : " + BMI + " kg/m2");
		scan.close();
	}

}
