import java.util.Scanner;

public class CircleComputation {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter the co-ordinatess of the centre \nand the radius of circle: ");
		int h = input.nextInt();
		int k = input.nextInt();
		int r = input.nextInt();
		System.out.println("Enter the co-ordinates of the point: ");
		int x = input.nextInt();
		int y = input.nextInt();
		input.close();
		
		System.out.println("The equation of the circle is: ");
		System.out.println("(x-h)^2 + (y-k)^2 = r^2");
		
		int a = (x-h)*(x-h) + (y-k)*(y-k);
		
		if(a<(r*r))
		{
			System.out.println("The point ("+x+","+y+") is inside the circle.");
		}
		else if(a==(r*r))
		{
			System.out.println("The point ("+x+","+y+") is on the circle.");
		}
		else if(a>(r*r))
		{
			System.out.println("The point ("+x+","+y+") is outside the circle.");
		}

	}

}
