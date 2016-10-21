import java.util.Scanner;

public class WeekHolidays {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter the number of the day: ");
		int dayNumber = input.nextInt();
	
		input.close();
		
		switch(dayNumber)
		{
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("Not holiday :( ");
			break;
		case 6:
		case 7:
			System.out.println("It's holiday :D ");
			break;
		default:
			System.out.println("Invalid input. Enter between 1 and 7");				
		}

	}

}
