package accessories;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ServiceAccessoriesImpl implements ServiceAccessories{
	
	@Override
	public void accessories() {
		
		int answer = 0;
		
		do {
            final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

			System.out.println();
            System.out.println("Give a Number to Select Accessory Category :");
			System.out.println();
			System.out.println("######################################");
			System.out.println("#                                    #");
			System.out.println("#     1. WATCHES                     #");
			System.out.println("#     2. SUNGLASSES AND SPECTACLES   #");
			System.out.println("#     3. JEWELLERY                   #");
			System.out.println("#     4. BAGS                        #");
			System.out.println("#     5. BELTS                       #");
			System.out.println("#                                    #");
			System.out.println("#    99. Go Back                     #");
			System.out.println("#                                    #");
			System.out.println("######################################");
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
					System.out.println("|                                                  WATCHES                                              |");
					System.out.println("---------------------------------------------------------------------------------------------------------");
					System.out.println("| Product Name                                      |    Model No    |      Price       |    Quantity   |");
					System.out.println("---------------------------------------------------------------------------------------------------------");
					System.out.println("| Swatch Windy Dune Watch                           |     WT0001     |     37000.00     |       12   	|");
					System.out.println("| Swatch Silver In Blue Watch                       |     WT0002     |     22500.00     |       15   	|");
					System.out.println("| Calvin Klein Men's Even Stainless Steel Watch     |     WT0003     |     11500.00     |       11      |");
					System.out.println("| Diesel Men's Mega Chief Stainless Steel Watch     |     WT0004     |     16750.00     |       15      |");
					System.out.println("| Guess Women's Stainless Steel Watch               |     WT0005     |     43450.00     |       14      |");
					System.out.println("| Flik Flak Sauruses Return Textile Watch           |     WT0006     |     50000.00     |       16      |");
					System.out.println("| Fossil Virginia Stainless Steel Watch             |     WT0007     |     80500.00     |       13      |");
					System.out.println("| Jesse Rose-Tone Stainless Steel Watch             |     WT0008     |     23600.00     |       08      |");
					System.out.println("| Skagen Freja Two-Tone Steel-Mesh Watch            |     WT0009     |     36000.00     |       11      |");
					System.out.println("| Skagen Men's Holst Leather Watch                  |     WT0010     |     25500.00     |       15      |");
					System.out.println("---------------------------------------------------------------------------------------------------------");
					System.out.println();
                    continue;
                }
                case 2: {
					System.out.println();
					System.out.println("---------------------------------------------------------------------------------------------------------");
					System.out.println("|                                         SUNGLASSES AND SPECTACLES                                     |");
					System.out.println("---------------------------------------------------------------------------------------------------------");
					System.out.println("| Product Name                                      |    Model No    |      Price       |    Quantity   |");
					System.out.println("---------------------------------------------------------------------------------------------------------");
					System.out.println("| Aldo Women's Betiah Aviator Sunglasses            |     SG0001     |     4500.00      |       15      |");
					System.out.println("| Aldo Unisex Galaolla Round Sunglasses             |     SG0002     |     2250.00      |       25      |");
					System.out.println("| Tommy Hilfiger Rectangular Unisex Sunglasses      |     SG0003     |     7800.00      |       14      |");
					System.out.println("| Love Moschino Cat Eye Women Sunglasses            |     SG0004     |     6450.00      |       18      |");
					System.out.println("| Armani Exchange Square Women Sunglasses           |     SG0005     |     22420.00     |       22      |");
					System.out.println("| Prada Linea Rossa Pillow Men Sunglasses           |     SG0006     |     3800.00      |       21      |");
					System.out.println("| Oakley Rectangular Men Sunglasses                 |     SG0007     |     8300.00      |       13      |");
					System.out.println("| Prada Linea Rossa Irregular Men Sunglasses        |     SG0008     |     5100.00      |       17      |");
					System.out.println("| Ray Ban Square Men Sunglasses                     |     SG0009     |     11200.00     |       12      |");
					System.out.println("| Ray Ban Pilot Men Sunglasses                      |     SG0010     |     6600.00      |       18      |");
					System.out.println("---------------------------------------------------------------------------------------------------------");
					System.out.println();
                    continue;
                }
                case 3: {
					System.out.println();
					System.out.println("----------------------------------------------------------------------------------------------------------");
					System.out.println("|                                                  JEWELLERY                                             |");
					System.out.println("----------------------------------------------------------------------------------------------------------");
					System.out.println("| Product Name                                      |    Model No    |      Price        |    Quantity   |");
					System.out.println("----------------------------------------------------------------------------------------------------------");
					System.out.println("| ALDO BAERIEN Green Women's Earrings               |     FJ0001     |      1550.00      |       12      |");
					System.out.println("| ALDO BUTTERCUP White Women's Earrings             |     FJ0002     |      3550.00      |       16      |");
					System.out.println("| Cotton Collection Earrings by COCO                |     FJ0003     |      1290.00      |       22      |");
					System.out.println("| Cotton Collection Black White Earrings by COCO    |     FJ0004     |      1490.00      |       21      |");
					System.out.println("| Aldo Morigino Medium Blue Women's Necklace        |     FJ0005     |      4420.00      |       33      |");
					System.out.println("| Cotton Collection 3 layer Necklace by COCO        |     FJ0006     |      1650.00      |       14      |");
					System.out.println("| ALDO FRAREDON Men's Black/Gold Bracelet           |     FJ0007     |      2950.00      |       14      |");
					System.out.println("| ALDO POIKITH Men's Metallic Bracelet              |     FJ0008     |      2320.00      |       17      |");
					System.out.println("| Aldo Mareena Light/Pastel Pink Women's Keychains  |     FJ0009     |      3950.00      |       13      |");
					System.out.println("| Aldo Nalen Light/Pastel Pink Women's Brooches     |     FJ0010     |      4150.00      |       16      |");
					System.out.println("----------------------------------------------------------------------------------------------------------");
					System.out.println();
                    continue;
                }
                case 4: {
					System.out.println();
					System.out.println("---------------------------------------------------------------------------------------------------------");
					System.out.println("|                                                  BAGS                                                 |");
					System.out.println("---------------------------------------------------------------------------------------------------------");
					System.out.println("| Product Name                                      |    Model No    |      Price       |    Quantity   |");
					System.out.println("---------------------------------------------------------------------------------------------------------");
					System.out.println("| Swarovski Bella Pierced Earrings Rhodium Plating  |     LJ0001     |     22900.00     |       11      |");
					System.out.println("| Swarovski Stone Bangle, White, Rhodium Plated     |     LJ0002     |     30900.00     |       14      |");
					System.out.println("| Swarovski Orbita Stud Octagon Cut Crystal         |     LJ0003     |     19500.00     |       15      |");
					System.out.println("| Swarovski Dulcis Cocktail Ring, Green             |     LJ0004     |     49750.00     |       17      |");
					System.out.println("| Vogue Symbolic Evil Eye Mixed Plating             |     LJ0005     |     30450.00     |       18      |");
					System.out.println("| Vogue Constella Braceletwhite, Gold-Tone Plated   |     LJ0006     |     67900.00     |       19      |");
					System.out.println("| Amanda Angelic Necklace, Blue, Rhodium Plated     |     LJ0007     |     35900.00     |       10      |");
					System.out.println("| Amanda Attract Cluster Pendant,Rhodium Plated     |     LJ0008     |     27250.00     |       18      |");
					System.out.println("| Mandala Dancing Swan Necklace, Rhodium Plated     |     LJ0009     |     37600.00     |       14      |");
					System.out.println("| Swarovski Rollerball Pen, Rose-Gold Tone Plated   |     LJ0010     |     17500.00     |       17      |");
					System.out.println("---------------------------------------------------------------------------------------------------------");
					System.out.println();
                    continue;
                }
                case 5: {
					System.out.println();
					System.out.println("----------------------------------------------------------------------------------------------------------");
					System.out.println("|                                                  BELTS                                                 |");
					System.out.println("----------------------------------------------------------------------------------------------------------");
					System.out.println("| Product Name                                      |    Model No    |       Price       |    Quantity   |");
					System.out.println("----------------------------------------------------------------------------------------------------------");
					System.out.println("| Tumi Voyageur Just In Case Cordovan Tote          |     CB0001     |      7550.00      |       07      |");
					System.out.println("| Aldo Acera Women's City Handbags                  |     CB0002     |      6490.00      |       09      |");
					System.out.println("| Aldo Olerrasean Women's Dress Handbags            |     CB0003     |      11950.00     |       13      |");
					System.out.println("| Hemago Women's Crossbody Bag                      |     CB0004     |      8700.00      |       16      |");
					System.out.println("| David Jones Women's Green Crossbody Bag           |     CB0005     |      11200.00     |       06      |");
					System.out.println("| David Jones Womens Green Backpacks                |     CB0006     |      6950.00      |       04      |");
					System.out.println("| UCB Men's Blue School Style Backpack              |     CB0007     |      7350.00      |       15      |");
					System.out.println("| Fossil Men's Haskell Leather Workbag              |     CB0008     |      43920.00     |       05      |");
					System.out.println("| Fossil Men's Spo Leather Crossbody Bag            |     CB0009     |      27000.00     |       03      |");
					System.out.println("| Fossil Men's Buckner Nylon Crossbody Bag          |     CB0010     |      24000.00     |       12      |");
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
