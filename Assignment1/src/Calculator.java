import java.util.Scanner;
public class Calculator
{
  public static void main(String[] args)
    {
	    float result;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter first number : ");
        int num1 = input.nextInt();
        
        System.out.println("Choose an operator : +, -, * or /");
        char operator = input.next().charAt(0);
        
        System.out.println("Enter Second number : ");
        int num2 = input.nextInt();
        
        switch (operator)
        {
        	case '+': result = num1 + num2;
        	System.out.println("Addition is : " + result); break;
        	case '-': result = num1 - num2;
        	System.out.println("Subtraction is : " + result); break;
        	case '*': result = num1 * num2;
        	System.out.println("Multiplication is : " + result); break;
        	case '/': result = num1 / num2;
        	System.out.println("Division is : " + result); break;
        	default: result = num1 + num2;
        	System.out.println("Invalid Operator"); break;
        }
        input.close();
    }
}