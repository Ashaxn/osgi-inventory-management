package clothingprofitcalculator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ServiceProfitCalcImpl implements ServiceProfitCalc {

	@Override
	public void profitcalculate() {

		Scanner s = new Scanner(System.in);
		String answer;
		DecimalFormat df = new DecimalFormat("#.##");

		do {
			System.out.println();
			System.out.print("Enter the Cost Price of One Product: ");
			double costprice = s.nextDouble();
			System.out.println();
			System.out.print("Enter the Selling Price of One Product: ");
			double sellingprice = s.nextDouble();
			System.out.println();
			System.out.print("Enter the Product Quantity: ");
			int quantity = s.nextInt();

			if (costprice - sellingprice > 0) {
				System.out.println();
				System.out.println("Loss Per One Product: " + df.format(costprice - sellingprice));
				System.out.println("Total Loss: " + df.format(quantity*(costprice - sellingprice)));
				System.out.println();
			} else if (costprice - sellingprice < 0) {
				System.out.println();
				System.out.println("Profit Per One Product: " + df.format(sellingprice - costprice));
				System.out.println("Total Profit: " + df.format(quantity*(sellingprice - costprice)));
				System.out.println();
			} else {
				System.out.println();
				System.out.println("NEUTRAL");
				System.out.println("There are No Profit or Loss");
				System.out.println();
			}
			
			System.out.print("Do you want to calculate another profit or loss? Yes or No : ");
			answer = s.next();
			
		} while (answer.equalsIgnoreCase("Yes"));
	}
}
