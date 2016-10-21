import java.util.Scanner;

public class AlgebraicRoots {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int a, b, c; double x1, x2;
		System.out.println("Enter a, b, c: ");
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		
		if((b*b-4*a*c)<0)
		{
			System.out.println("The equation has complex roots");
		}
		else
		{
			x1 = -(double)b+Math.sqrt((double)b*(double)b-4*(double)a*(double)c)/(2*(double)a);
			x2 = -(double)b-Math.sqrt((double)b*(double)b-4*(double)a*(double)c)/(2*(double)a);
			if(x1 == x2)
			{
				System.out.println("The roots are equal.\nx = " +x1);
			}
			else
			{
				System.out.println("x = " +x1 +", " +x2);
			}
		}

	}

}
