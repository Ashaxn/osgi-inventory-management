package mensclothing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ServiceMensClothsImpl implements ServiceMensCloths{
	
	@Override
	public void menscloths() {
		
		int answer = 0;
		
		do {
            final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

			System.out.println();
            System.out.println("Give a Number to Select Mens Clothing Category :");
			System.out.println();
			System.out.println("#######################");
			System.out.println("#                     #");
			System.out.println("#     1. TSHIRTS      #");
			System.out.println("#     2. BOTTOMS      #");
			System.out.println("#     3. SHIRTS       #");
			System.out.println("#     4. SHORTS       #");
			System.out.println("#     5. JACKETS      #");
			System.out.println("#                     #");
			System.out.println("#    99. Go Back      #");
			System.out.println("#                     #");
			System.out.println("#######################");
			System.out.println();
			System.out.print("Enter Number: ");
            try {
            	answer = Integer.parseInt(in.readLine());
            }
            catch (NumberFormatException e) {
                e.printStackTrace();
            }
            catch (IOException e2) {
                e2.printStackTrace();
            }
            switch (answer) {
                case 1: {
					System.out.println();
					System.out.println("---------------------------------------------------------------------------------------------------------");
					System.out.println("|                                              TSHIRTS                                                  |");
					System.out.println("---------------------------------------------------------------------------------------------------------");
					System.out.println("| Product Name                                      |    Model No    |      Price       |    Quantity   |");
					System.out.println("---------------------------------------------------------------------------------------------------------");
					System.out.println("| Odel Solid Color Tshirt Black                     |     MCT0001    |     3450.00      |       32      |");
					System.out.println("| Calvin Klein Solid Color Tshirt Navy              |     MCT0002    |    12250.00      |       15      |");
					System.out.println("| Blooms Solid Color Tshirt White                   |     MCT0003    |     2500.00      |       18      |");
					System.out.println("| Jack & Jones Solid Color Tshirt Black             |     MCT0004    |     9490.00      |       19      |");
					System.out.println("| Levis Solid Color Tshirt White                    |     MCT0005    |     8000.00      |       25      |");
					System.out.println("---------------------------------------------------------------------------------------------------------");
					System.out.println();
                    continue;
                }
                case 2: {
					System.out.println();
					System.out.println("---------------------------------------------------------------------------------------------------------");
					System.out.println("|                                              BOTTOMS                                                  |");
					System.out.println("---------------------------------------------------------------------------------------------------------");
					System.out.println("| Product Name                                      |    Model No    |      Price       |    Quantity   |");
					System.out.println("---------------------------------------------------------------------------------------------------------");
					System.out.println("| LEVI'S MEN 551Z JEANS BLACK                       |     MCB0001    |     4500.00      |       21      |");
					System.out.println("| LEVI'S MEN 512 JEANS BLUE                         |     MCB0002    |     2250.00      |       12      |");
					System.out.println("| ODEL MEN JEANS BLACK                              |     MCB0003    |     3500.00      |       15      |");
					System.out.println("| BLOOM MEN JEANS BLUE                              |     MCB0004    |     4490.00      |       16      |");
					System.out.println("| GUCCI MEN JEANS GREY                              |     MCB0005    |     3600.00      |       23      |");
					System.out.println("---------------------------------------------------------------------------------------------------------");
					System.out.println();
                    continue;
                }
                case 3: {
					System.out.println();
					System.out.println("----------------------------------------------------------------------------------------------------------");
					System.out.println("|                                              SHIRTS                                                    |");
					System.out.println("----------------------------------------------------------------------------------------------------------");
					System.out.println("| Product Name                                      |    Model No    |      Price        |    Quantity   |");
					System.out.println("----------------------------------------------------------------------------------------------------------");
					System.out.println("| Pepe Spedo Men's Shirt Beige                      |     MCS0001    |      9950.00      |       12      |");
					System.out.println("| Odel Men's Shirt Black                            |     MCS0002    |      3550.00      |       16      |");
					System.out.println("| Levis Men's Shirt Denim Blue                      |     MCS0003    |      9900.00      |       22      |");
					System.out.println("| Odel Men's Shirt Denim Grey                       |     MCS0004    |      6890.00      |       21      |");
					System.out.println("| Odel Short Sleeves Men's Shirt Linen Purple       |     MCS0005    |      5290.00      |       33      |");
					System.out.println("----------------------------------------------------------------------------------------------------------");
					System.out.println();
                    continue;
                }
                case 4: {
					System.out.println();
					System.out.println("---------------------------------------------------------------------------------------------------------");
					System.out.println("|                                              SHORTS                                                   |");
					System.out.println("---------------------------------------------------------------------------------------------------------");
					System.out.println("| Product Name                                      |    Model No    |      Price       |    Quantity   |");
					System.out.println("---------------------------------------------------------------------------------------------------------");
					System.out.println("| Embark basic white short                          |     MS0001     |     2900.00      |       11      |");
					System.out.println("| Gucci signature black short                       |     MS0002     |     7900.00      |       14      |");
					System.out.println("| Levis chino white short                           |     MS0003     |     6500.00      |       15      |");
					System.out.println("| levis blue denim short                            |     MS0004     |     6750.00      |       17      |");
					System.out.println("| Odel basic khaki short                            |     MS0005     |     3450.00      |       18      |");
					System.out.println("---------------------------------------------------------------------------------------------------------");
					System.out.println();
                    continue;
                }
                case 5: {
					System.out.println();
					System.out.println("----------------------------------------------------------------------------------------------------------");
					System.out.println("|                                              JACKETS                                                   |");
					System.out.println("----------------------------------------------------------------------------------------------------------");
					System.out.println("| Product Name                                      |    Model No    |       Price       |    Quantity   |");
					System.out.println("----------------------------------------------------------------------------------------------------------");
					System.out.println("| Levis Blue denim Jacket                           |     MJ0001     |      7550.00      |       10      |");
					System.out.println("| Odel  Blue Jacket with zipper                     |     MJ0002     |      6490.00      |       15      |");
					System.out.println("| Levis Black bomber Jacket                         |     MJ0003     |      11950.00     |       14      |");
					System.out.println("| Supreme Red Jacket limited edition                |     MJ0004     |      8700.00      |       09      |");
					System.out.println("| Champion Black signature Jacket                   |     MJ0005     |      11200.00     |       05      |");
					System.out.println("----------------------------------------------------------------------------------------------------------");
					System.out.println();
                    continue;
                }
                case 99: {
                    continue;
                }
                default: {
                	System.out.println();
                    System.out.println("The number you entered is invalid!!!");
                    continue;
                }
            }
        } while (answer != 99);
	}
	
	
}
