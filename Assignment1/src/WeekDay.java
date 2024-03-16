import java.util.Scanner;
public class WeekDay
{
  public static void main(String[] args)
    {
	    String dayName = "";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 1 to 7 to display weekday : ");
        int day = input.nextInt();
        
        switch (day)
        {
            case 1: dayName = "Monday"; 
            System.out.println(dayName); break;
            case 2: dayName = "Tuesday";
            System.out.println(dayName); break;
            case 3: dayName = "Wednesday";
            System.out.println(dayName); break;
            case 4: dayName = "Thurseday";
            System.out.println(dayName); break;
            case 5: dayName = "Friday"; 
            System.out.println(dayName); break;
            case 6: dayName = "Saturday"; 
            System.out.println(dayName); break;
            case 7: dayName = "Sunday"; 
            System.out.println(dayName); break;
        }
       input.close();
    }
}
