import java.util.Scanner;
public class ElectricBill {

	public static void main(String[] args) {
			Scanner input = new Scanner (System.in);
			System.out.println("Enter the number of units consumed: ");
			int units = input.nextInt();
			double subcharge = 0;
			int originalUnits=units;
			
			if(units<=50)
			{
				subcharge += units*0.5;
			}
			else if(units>=50 && units<=150)
			{
				subcharge += 50*0.5;
				units = units-50;
				subcharge += units*0.75;
			}
			else if(units>=150 && units<=250)
			{
				subcharge += (50*0.5+100*0.75);
				units = units-150;
				subcharge += units*1.2;				
			}
			else if(units>250)
			{
				subcharge += (50*0.5+100*0.75+100*1.2);
				units=units-250;
				subcharge+=units*1.5;
			}
			
			double totalCharge = subcharge+(0.2*subcharge);
			System.out.println("The total cost for " +originalUnits +" units is BDT " +totalCharge);
	}

}
