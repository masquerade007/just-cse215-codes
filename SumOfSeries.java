import java.util.Scanner;

public class SumOfSeries {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter n: ");
		int n = input.nextInt();
		
		double sum = 0, term = 1;
		int i=1;
		
		while(i<=n)
		{
			term = term/(double)i;
			if(i%2==0)
				{
				sum = sum - term;
				}
			else
				{
				sum = sum + term;
				}
			i++;
		}
		
		input.close();
		System.out.println("The sum of the series is " + sum);
		
	}
}
