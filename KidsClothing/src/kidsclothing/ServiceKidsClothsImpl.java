package kidsclothing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ServiceKidsClothsImpl implements ServiceKidsCloths{

	@Override
	public void kidscloths() {
		
		int answer = 0;
		
		do {
            final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

			System.out.println();
            System.out.println("Give a Number to Select Kids Clothing Category :");
			System.out.println();
			System.out.println("#######################");
			System.out.println("#                     #");
			System.out.println("#     1. T Shirts     #");
			System.out.println("#     2. Frocks       #");
			System.out.println("#     3. Trousers     #");
			System.out.println("#     4. Toys         #");
			System.out.println("#     5. Socks        #");
			System.out.println("#     6. Shoes        #");
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
					System.out.println("-----------------------------------------------------------------------------------------");
					System.out.println("|                                         T-SHIRTS                                      |");
					System.out.println("-----------------------------------------------------------------------------------------");
					System.out.println("| Product Name                       |    Model No   |      Price       |    Quantity   |");
					System.out.println("-----------------------------------------------------------------------------------------");
					System.out.println("| U.S polo                           |     T0001     |     4500.00      |       21      |");
					System.out.println("| Buff & Blu                         |     T0002     |     4450.00      |       19      |");
					System.out.println("| OVS                                |     T0003     |     2700.00      |       22      |");
					System.out.println("| Cotton collection                  |     T0004     |     1190.00      |       11      |");
					System.out.println("| Amani                              |     T0005     |     1500.00      |       19      |");
					System.out.println("| PEPE                               |     T0006     |     4450.00      |       14      |");
					System.out.println("| Disney                             |     T0007     |     5300.00      |       13      |");
					System.out.println("-----------------------------------------------------------------------------------------");
					System.out.println();
                    continue;
                }
                case 2: {
                	System.out.println();
					System.out.println("-----------------------------------------------------------------------------------------");
					System.out.println("|                                         FROCKS                                        |");
					System.out.println("-----------------------------------------------------------------------------------------");
					System.out.println("| Product Name                       |    Model No   |      Price       |    Quantity   |");
					System.out.println("-----------------------------------------------------------------------------------------");
					System.out.println("| Mothercare                         |     F0001     |     4500.00      |       22      |");
					System.out.println("| Pinkabelle                         |     F0002     |     3450.00      |       19      |");
					System.out.println("| OVS                                |     F0003     |     2700.00      |       20      |");
					System.out.println("| Pinkabuds                          |     F0004     |     3190.00      |       11      |");
					System.out.println("| Guess                              |     F0005     |     3500.00      |       18      |");
					System.out.println("| PEPE                               |     F0006     |     4450.00      |       16      |");
					System.out.println("| Disney                             |     F0007     |     3300.00      |       12      |");
					System.out.println("-----------------------------------------------------------------------------------------");
					System.out.println();
                    continue;
                }
                case 3: {
                	System.out.println();
					System.out.println("------------------------------------------------------------------------------------------");
					System.out.println("|                                         TROUSERS                                       |");
					System.out.println("------------------------------------------------------------------------------------------");
					System.out.println("| Product Name                       |    Model No   |      Price       |    Quantity    |");
					System.out.println("------------------------------------------------------------------------------------------");
					System.out.println("| U.S polo                           |     TR0001     |     3600.00      |       14      |");
					System.out.println("| Pinkabelle                         |     TR0002     |     1450.00      |       28      |");
					System.out.println("| OVS                                |     TR0003     |     4700.00      |       22      |");
					System.out.println("| Mothercare                         |     TR0004     |     3190.00      |       17      |");
					System.out.println("| United colors of benetton          |     TR0005     |     4400.00      |       19      |");
					System.out.println("| PEPE                               |     TR0006     |     1150.00      |       14      |");
					System.out.println("| Guess                              |     TR0007     |     3300.00      |       13      |");
					System.out.println("------------------------------------------------------------------------------------------");
					System.out.println();
                    continue;
                }
                case 4: {
                	System.out.println();
					System.out.println("------------------------------------------------------------------------------------------");
					System.out.println("|                                         TOYS                                           |");
					System.out.println("------------------------------------------------------------------------------------------");
					System.out.println("| Product Name                       |    Model No   |      Price       |    Quantity    |");
					System.out.println("------------------------------------------------------------------------------------------");
					System.out.println("| Doll house                         |     TO0001     |     5500.00      |       14      |");
					System.out.println("| Dolls                              |     TO0002     |     6450.00      |       28      |");
					System.out.println("| Toy vehicles                       |     TO0003     |     7700.00      |       30      |");
					System.out.println("| Activity toys                      |     TO0004     |     6190.00      |       22      |");
					System.out.println("------------------------------------------------------------------------------------------");
					System.out.println();
                    continue;
                }
                case 5: {
                	System.out.println();
					System.out.println("-----------------------------------------------------------------------------------------");
					System.out.println("|                                         SOCKS                                         |");
					System.out.println("-----------------------------------------------------------------------------------------");
					System.out.println("| Product Name                       |    Model No   |      Price       |    Quantity   |");
					System.out.println("-----------------------------------------------------------------------------------------");
					System.out.println("| Rama                               |     S0001     |     1500.00      |       25      |");
					System.out.println("| CMENIN                             |     S0002     |     1450.00      |       19      |");
					System.out.println("| BestGO                             |     S0003     |     2700.00      |       22      |");
					System.out.println("| ALLGOOD                            |     S0004     |     1190.00      |       22      |");
					System.out.println("| Yfashion                           |     S0005     |     1500.00      |       11      |");
					System.out.println("| JoyLife                            |     S0006     |     2450.00      |       35      |");
					System.out.println("-----------------------------------------------------------------------------------------");
					System.out.println();
                    continue;
                }
                case 6: {
                	System.out.println();
					System.out.println("------------------------------------------------------------------------------------------");
					System.out.println("|                                         SHOES                                          |");
					System.out.println("------------------------------------------------------------------------------------------");
					System.out.println("| Product Name                       |    Model No   |      Price       |    Quantity    |");
					System.out.println("------------------------------------------------------------------------------------------");
					System.out.println("| GUCCI                              |     SH0001     |     9500.00      |       14      |");
					System.out.println("| Addidas                            |     SH0002     |     9450.00      |       15      |");
					System.out.println("| NIKE                               |     SH0003     |     9700.00      |       11      |");
					System.out.println("| DSI                                |     SH0004     |     3190.00      |       30      |");
					System.out.println("| NB                                 |     SH0005     |     5500.00      |       13      |");
					System.out.println("------------------------------------------------------------------------------------------");
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
