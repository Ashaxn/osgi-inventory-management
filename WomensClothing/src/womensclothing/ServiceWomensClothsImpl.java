package womensclothing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ServiceWomensClothsImpl implements ServiceWomensCloths{
	
	@Override
	public void womenscloths() {
		
		int answer = 0;
		
		do {
            final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

			System.out.println();
            System.out.println("Give a Number to Select Women Clothing Category :");
			System.out.println();
			System.out.println("##############################");
			System.out.println("#                            #");
			System.out.println("#     1. Tops & T Shirts     #");
			System.out.println("#     2. Skirts & Shorts     #");
			System.out.println("#     3. Dresses             #");
			System.out.println("#     4. Bottoms             #");
			System.out.println("#     5. Pants & Trousers    #");
			System.out.println("#                            #");
			System.out.println("#    99. Go Back             #");
			System.out.println("#                            #");
			System.out.println("##############################");
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
					System.out.println("|                                           TOPS AND T-SHIRTS                                           |");
					System.out.println("---------------------------------------------------------------------------------------------------------");
					System.out.println("| Product Name                                      |    Model No    |      Price       |    Quantity   |");
					System.out.println("---------------------------------------------------------------------------------------------------------");
					System.out.println("| Solid Colour sleeve Top                           |     WSG0001    |     4500.00      |       20      |");
					System.out.println("| White sleeve Top                                  |     WSG0002    |     2250.00      |       22      |");
					System.out.println("| Basic Cami Top                                    |     WSG0003    |     3500.00      |       25      |");
					System.out.println("| Long Sleeve Frill Top                             |     WSG0004    |     4490.00      |       26      |");
					System.out.println("| Vero Moda Gudrun Black Sleeveless Top             |     WSG0005    |     3600.00      |       23      |");
					System.out.println("| Only Black Round Neck Lace Up Top                 |     WSG0006    |     3800.00      |       16      |");
					System.out.println("| Black Pintuck Long Sleeve Shirt                   |     WSG0007    |     8300.00      |       23      |");
					System.out.println("| Leopard Print Long sleeve Top                     |     WSG0008    |     4490.00      |       18      |");
					System.out.println("| Skriped Lone sleeve Shirt                         |     WSG0009    |     3990.00      |       21      |");
					System.out.println("| Polka Dot Top                                     |     WSG0010    |     1990.00      |       29      |");
					System.out.println("---------------------------------------------------------------------------------------------------------");
					System.out.println();
                    continue;
                }
                case 2: {
					System.out.println();
					System.out.println("----------------------------------------------------------------------------------------------------------");
					System.out.println("|                                           Skirts & Shorts                                              |");
					System.out.println("----------------------------------------------------------------------------------------------------------");
					System.out.println("| Product Name                                      |    Model No    |      Price        |    Quantity   |");
					System.out.println("----------------------------------------------------------------------------------------------------------");
					System.out.println("| Blue Printed Buttoned Down Midi Dress             |     WS0001     |      4500.00      |       12      |");
					System.out.println("| White Buttoned Denim Dungaree Dress               |     WS0002     |      3550.00      |       16      |");
					System.out.println("| Navy Front Cutway Button Down Dress               |     WS0003     |      3290.00      |       22      |");
					System.out.println("| Black Strappy Midi Dress                          |     WS0004     |      4490.00      |       21      |");
					System.out.println("| Blue Belted Bishop Sleeve Shirt Dress             |     WS0005     |      4420.00      |       33      |");
					System.out.println("| Orange Dolman Sleeve Midi Dress                   |     WS0006     |      3650.00      |       14      |");
					System.out.println("| Navy Striped V Neck Tie Up Dress                  |     WS0007     |      4950.00      |       14      |");
					System.out.println("| Pink Belted Bishop Sleeve Shirt Dress             |     WS0008     |      4320.00      |       17      |");
					System.out.println("| Green Striped Waist Tie Shirt Dress               |     WS0009     |      3950.00      |       13      |");
					System.out.println("| Hayathi Solid Color Puffed Sleeves A Line Dress   |     WS0010     |      4150.00      |       16      |");
					System.out.println("----------------------------------------------------------------------------------------------------------");
					System.out.println();
                    continue;
                }
                case 3: {
					System.out.println();
					System.out.println("--------------------------------------------------------------------------------------------------------");
					System.out.println("|                                              Dresses                                                 |");
					System.out.println("--------------------------------------------------------------------------------------------------------");
					System.out.println("| Product Name                                      |    Model No    |      Price      |    Quantity   |");
					System.out.println("--------------------------------------------------------------------------------------------------------");
					System.out.println("| Biconic Denim Jeans                               |     WB0001     |     2900.00     |       11      |");
					System.out.println("| Biconic Textured Leggings                         |     WB0002     |     3090.00     |       14      |");
					System.out.println("| Biconic Crop Jogger                               |     WB0003     |     1500.00     |       15      |");
					System.out.println("| Biconic Flared Trousers                           |     WB0004     |     4750.00     |       17      |");
					System.out.println("| Biconic Printed Lounge Pants                      |     WB0005     |     3000.00     |       18      |");
					System.out.println("| Biconic Grey And Black Jogger                     |     WB0006     |     6900.00     |       19      |");
					System.out.println("| Biconic Purple Rib Pant                           |     WB0007     |     3590.00     |       10      |");
					System.out.println("| Biconic Mint Side Heart Print Jogger              |     WB0008     |     2250.00     |       18      |");
					System.out.println("| Solid Colour Ribbed Bell Bottom Pant              |     WB0009     |     3760.00     |       14      |");
					System.out.println("| Pritned Wide Leg Relaxed Pant                     |     WB0010     |     1750.00     |       17      |");
					System.out.println("--------------------------------------------------------------------------------------------------------");
					System.out.println();
                    continue;
                }
                case 4: {
					System.out.println();
					System.out.println("--------------------------------------------------------------------------------------------------------");
					System.out.println("|                                                  Bottoms                                             |");
					System.out.println("--------------------------------------------------------------------------------------------------------");
					System.out.println("| Product Name                                      |    Model No    |      Price       |    Quantity  |");
					System.out.println("--------------------------------------------------------------------------------------------------------");
					System.out.println("| Biconic Denim Jeans                               |     WB0001     |     2900.00     |       11      |");
					System.out.println("| Biconic Textured Leggings                         |     WB0002     |     3090.00     |       14      |");
					System.out.println("| Biconic Crop Jogger                               |     WB0003     |     1500.00     |       15      |");
					System.out.println("| Biconic Flared Trousers                           |     WB0004     |     4750.00     |       17      |");
					System.out.println("| Biconic Printed Lounge Pants                      |     WB0005     |     3000.00     |       18      |");
					System.out.println("| Biconic Grey And Black Jogger                     |     WB0006     |     6900.00     |       19      |");
					System.out.println("| Biconic Purple Rib Pant                           |     WB0007     |     3590.00     |       10      |");
					System.out.println("| Biconic Mint Side Heart Print Jogger              |     WB0008     |     2250.00     |       18      |");
					System.out.println("| Solid Colour Ribbed Bell Bottom Pant              |     WB0009     |     3760.00     |       14      |");
					System.out.println("| Pritned Wide Leg Relaxed Pant                     |     WB0010     |     1750.00     |       17      |");
					System.out.println("--------------------------------------------------------------------------------------------------------");
					System.out.println();
                    continue;
                }
                case 5: {
					System.out.println();
					System.out.println("----------------------------------------------------------------------------------------------------------");
					System.out.println("|                                           Pants & Trousers                                             |");
					System.out.println("----------------------------------------------------------------------------------------------------------");
					System.out.println("| Product Name                                      |    Model No    |       Price       |    Quantity   |");
					System.out.println("----------------------------------------------------------------------------------------------------------");
					System.out.println("| Only Black Poptrash Front Tie Pants               |     WT0001     |      7550.00      |       10      |");
					System.out.println("| Only Solid Colur Straight Cut FormalwearPants     |     WT0002     |      6490.00      |       19      |");
					System.out.println("| Closet Sreiped Wide Leg Pant                      |     WT0003     |      11950.00     |       13      |");
					System.out.println("| Closet Solid Colour Cropped Pant                  |     WT0004     |      8700.00      |       16      |");
					System.out.println("| Closet Solid Colour Paper Bag Pant                |     WT0005     |      11200.00     |       26      |");
					System.out.println("| Closet Solid Colour High Wasited Pant             |     WT0006     |      6950.00      |       24      |");
					System.out.println("| Tara Red Mid Waist Skinny Pant                    |     WT0007     |      7350.00      |       15      |");
					System.out.println("| Armani Exchange Solid Colour Belted Trousers      |     WT0008     |      43920.00     |       25      |");
					System.out.println("| Armani Exchange Black Culottes                    |     WT0009     |      27000.00     |       23      |");
					System.out.println("| Armani Exchange Cigarette Pants                   |     WT0010     |      24000.00     |       12      |");
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
