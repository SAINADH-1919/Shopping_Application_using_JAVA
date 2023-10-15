
import java.util.*;

/**
 * @author sainadh
 *
 */
public class ShoppingEkart
{
	public static int num_1;
	public static String s1;
	public static String s2="Yes";



	public static void collectInput() 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Select the Item from above options :\n");
		num_1=scanner.nextInt();

	}
	public static void collectInput2() 
	{
		Scanner scanner=new Scanner(System.in);

		s1=scanner.next();

	}
	public static void main(String[] args) {
		//  Main Method
		Scanner scanner=new Scanner(System.in);
		System.out.println(""
				+ "\t\t\t\t\t\t! Welcome to the Online Shopping App!");
		System.out.println();

		System.out.println("\t\t\t\t\t\tCategories available  in Shoppping app \n"
				+"\t\t\t\t\t\t1.Home Decors\n"
				+"\t\t\t\t\t\t2.Electronics\n"
				+"\t\t\t\t\t\t3.Fashion\n"
				+"\t\t\t\t\t\t4.Instamart\n"
				+"\t\t\t\t\t\t5.Sports\n"
				+ "\t\t\t\t\t\t6.Exit");
		collectInput();
		//    Case 1  For Home Decors 


		switch(num_1) 
		{
		case 1:{

			System.out.println("Category available  from Home decors:\n"
					+"1.furniture\n"
					+"2.Blankets\n"
					+"3.Carpets\n"
					+"4.Kitchen Decors\n");

			collectInput();
			switch(num_1) 
			{
			case 1:
			{

				System.out.println("Products  available  in Furnitures:\n"
						+"1.Bed\n"
						+"2.Laptop Table\n"
						);

				collectInput();
				switch(num_1) 
				{
				case 1:
				{
					System.out.println("----------------------------------------------------------------\n"
							+ "Wake fit taurus Engineered Wood king Box Bed color-Walnut\n"
							+ "Depth                     187.4 cm\n"
							+ "width                     209.7 cm\n"
							+ "Height                    79.5 cm\n\n"
							+ "cost  =  13455");
					System.out.println("Do you  want to purchase \n please Select :Yes/No ");
					collectInput2();
					if(s1.equalsIgnoreCase(s2))
					{
						System.out.println("----------------------------------------------------------------\n"
								+ "Here is the Recipt of Your Purchasing Details\n"
								+"----------------------------------------------------------------\n"
								+ "Wake fit taurus Engineered Wood king Box Bed color-Walnut\n"
								+ "Depth                     187.4 cm\n"
								+ "width                     209.7 cm\n"
								+ "Height                    7	9.5 cm\n\n"
								+ " Amount paid   =  13455\n"
								+ "Product succefully purchased");

						main(null);
					}
					else
					{
						System.out.println("Thanks For visting Shopping Application\n\n");
						main(null);
					}
				}

				case 2:
				{

					System.out.println("----------------------------------------------------------------\n"
							+ "Wake fit taurus Engineered wood laptop Table color-Walnut\n"
							+ "height                     187.4 cm\n"
							+ "width                     209.7 cm\n"
							+ "cost  =  555");
					System.out.println("Do you  want to purchase \n please Select :Yes/No ");
					collectInput2();
					if(s1.equalsIgnoreCase(s2))
					{
						System.out.println("-------------Here is the Recipt of Your Purchasing Details---------------\n"
								+ "Wake fit taurus Engineered wood laptop Table color-Walnut\n"
								+ "height                     187.4 cm\n"
								+ "width                     209.7 cm\n"
								+ " Amount paid   =  13455\n"
								+ "Product succefully purchased");

						main(null);
					}
					else
					{
						System.out.println("Thanks For visting Shopping Application\n\n");
						main(null);
					}

				}
				default:


					System.out.println(" please select correct product\n\n ");
					main(null);
				}
			}


			case 2:
			{


				System.out.println("Products  available  in Blankets:\n"
						+"1.Cotton Blanket\n"
						+"2.Double blaket\n"
						);
				System.out.println("Choose  the product you want to purchase in Blankets :\n ");
				collectInput();
				switch(num_1) 
				{
				case 1:
				{
					System.out.println("\t\t\t\t\t\t----------------------------------------------------------------\n"
							+ "\t\t\t\t\t\tCotton Blanket              \n"
							+ "\t\t\t\t\t\tcost        =   899");
					System.out.println("Do you  want to purchase \n please Select :Yes/No ");
					collectInput2();
					if(s1.equalsIgnoreCase(s2))
					{
						System.out.println("\t\t\t\t\t\t-------------Here is the Recipt of Your Purchasing Details---------------\n"
								+ "\t\t\t\t\t\tCotton Blanket                   \n"

						+ "\t\t\t\t\t\t Amount paid   =  899   \n"
						+ "\t\t\t\t\t\t Product succefully purchased\n");

						main(null);
					}
					else
					{
						System.out.println("Thanks For visting Shopping Application\n\n");
						main(null);
					}

				}

				case 2:
				{
					System.out.println("\t\t\t\t\t\t----------------------------------------------------------------\n"
							+ "\t\t\t\t\t\tDouble Blanket                \n"

						+ "\t\t\t\t\t\tcost        =   1999");
					System.out.println("Do you  want to purchase \n please Select :Yes/No ");
					collectInput2();
					if(s1.equalsIgnoreCase(s2))
					{
						System.out.println("\t\t\t\t\t\t-------------Here is the Recipt of Your Purchasing Details---------------\n"
								+ "\t\t\t\t\t\tDouble Blanket                  \n"

						+ "\t\t\t\t\t\t Amount paid   =  1999   \n"
						+ "\t\t\t\t\t\t Product succefully purchased\n");

						main(null);
					}
					else
					{
						System.out.println("Thanks For visting Shopping Application\n\n");
						main(null);
					}

				}

				default:


					System.out.println(" please select correct product ");
				}
			}
			case 3:
			{


				System.out.println("Products  available  in Carpets:\n"
						+"1.Red Carpet\n"
						+"2.Blue Carpet\n"
						);
				System.out.println("Choose  the product you want to purchase in Carpets \n: ");
				collectInput();
				switch(num_1) 
				{
				case 1:
				{
					System.out.println("\t\t\t\t\t\t----------------------------------------------------------------\n"
							+ "\t\t\t\t\t\tRed Carpet              \n"
							+ "\t\t\t\t\t\tcost        =   199");
					System.out.println("Do you  want to purchase \n please Select :Yes/No ");
					collectInput2();
					if(s1.equalsIgnoreCase(s2))
					{
						System.out.println("\t\t\t\t\t\t-------------Here is the Recipt of Your Purchasing Details---------------\n"
								+ "\t\t\t\t\t\tRed Carpet                   \n"

							+ "\t\t\t\t\t\t Amount paid   =  199   \n"
							+ "\t\t\t\t\t\t Product succefully purchased\n");

						main(null);
					}
					else
					{
						System.out.println("Thanks For visting Shopping Application\n\n");
						main(null);
					}

				}

				case 2:
				{
					System.out.println("\t\t\t\t\t\t----------------------------------------------------------------\n"
							+ "\t\t\t\t\t\tBlue Carpet                \n"

							+ "\t\t\t\t\t\tcost        =   199");
					System.out.println("Do you  want to purchase \n please Select :Yes/No ");
					collectInput2();
					if(s1.equalsIgnoreCase(s2))
					{
						System.out.println("\t\t\t\t\t\t-------------Here is the Recipt of Your Purchasing Details---------------\n"
								+ "\t\t\t\t\t\tBlue carpet                  \n"

							+ "\t\t\t\t\t\t Amount paid   =  199   \n"
							+ "\t\t\t\t\t\t Product succefully purchased\n");

						main(null);
					}
					else
					{
						System.out.println("Thanks For visting Shopping Application\n\n");
						main(null);
					}

				}
				default:


					System.out.println(" please select correct product ");
				}
			}
			case 4:
			{

				System.out.println("Products  available  in Kitechen Decors:\n"
						+"1.Wall stickers\n"
						+"2.stickers\n"
						);
				System.out.println("Choose  the product you want to purchase in Kitechen Decors  ");

				collectInput();
				switch(num_1) 
				{
				case 1:
				{
					System.out.println("\t\t\t\t\t\t----------------------------------------------------------------\n"
							+ "\t\t\t\t\t\tWall Stickers             \n"
							+ "\t\t\t\t\t\tcost        =   899");
					System.out.println("Do you  want to purchase \n please Select :Yes/No ");
					collectInput2();
					if(s1.equalsIgnoreCase(s2))
					{
						System.out.println("\t\t\t\t\t\t-------------Here is the Recipt of Your Purchasing Details---------------\n"
								+ "\t\t\t\t\t\tWall Stickers                   \n"

							+ "\t\t\t\t\t\t Amount paid   =  899   \n"
							+ "\t\t\t\t\t\t Product succefully purchased\n");

						main(null);
					}
					else
					{
						System.out.println("Thanks For visting Shopping Application\n\n");
						main(null);
					}

				}

				case 2:
				{
					System.out.println("\t\t\t\t\t\t----------------------------------------------------------------\n"
							+ "\t\t\t\t\t\tStickers                \n"

							+ "\t\t\t\t\t\tcost        =   1999");
					System.out.println("Do you  want to purchase \n please Select :Yes/No ");
					collectInput2();
					if(s1.equalsIgnoreCase(s2))
					{
						System.out.println("\t\t\t\t\t\t-------------Here is the Recipt of Your Purchasing Details---------------\n"
								+ "\t\t\t\t\t\tStickers                  \n"

							+ "\t\t\t\t\t\t Amount paid   =  1999   \n"
							+ "\t\t\t\t\t\t Product succefully purchased\n");

						main(null);
					}
					else
					{
						System.out.println("Thanks For visting Shopping Application\n\n");
						main(null);
					}
				}
				default:


					System.out.println(" please select correct product ");
				}
			}
			default:
				System.out.println(" please select correct product ");
			}
		}
		//case2 for  Electronics
		case 2:{

			System.out.println("Category available  from Electronics:\n"
					+"1.Mobiles\n"
					+"2.Chargers\n"
					+"3.Laptops\n"
					+"4.Headphones\n");
			System.out.println("Choose  the category in Electronic:\n ");
			collectInput();
			switch(num_1) 
			{
			case 1:
			{


				System.out.println("Products  available  in Mobiles:\n"
						+"1.Oppo\n"
						+"2.Realme\n"
						);
				collectInput();
				switch(num_1) 
				{
				case 1:
				{
					System.out.println("\t\t\t\t\t\t----------------------------------------------------------------\n"
							+ "\t\t\t\t\t\tReno 85G (ShiMmer Black)            \n"
							+ "\t\t\t\t\t\tRam                          8 GB \n"
							+ "\t\t\t\t\t\tROM                          128GB\n"
							+ "\t\t\t\t\t\tRear Camera           50MP+8MP+2MP\n"
							+ "\t\t\t\t\t\tDisplay           Amoled HD Display\n"


							+ "\t\t\t\t\t\tcost             =           29999");
					System.out.println("Do you  want to purchase \n please Select :Yes/No ");
					collectInput2();
					if(s1.equalsIgnoreCase(s2))
					{
						System.out.println("\t\t\t\t\t\t-------------Here is the Recipt of Your Purchasing Details---------------\n"
								+ "\t\t\t\t\t\tReno 85G (ShiMmer Black)\n"


								+ "\t\t\t\t\t\t Amount paid   =  29999\n"
								+ "\t\t\t\t\t\t Product succefully purchased\n");

						main(null);
					}
					else
					{
						System.out.println("Thanks For visting Shopping Application\n\n");
						main(null);
					}
				}

				case 2:
				{

					System.out.println("\t\t\t\t\t\t----------------------------------------------------------------\n"
							+ "\t\t\t\t\t\t Realme 85G (ShiMmer Black)       \n  "
							+ "\t\t\t\t\t\tRam                          8 GB \n"
							+ "\t\t\t\t\t\tROM                          128GB\n"
							+ "\t\t\t\t\t\tRear Camera           50MP+8MP+2MP\n"
							+ "\t\t\t\t\t\tDisplay           Amoled HD Display\n"

							+ "\t\t\t\t\t\tcost                        =  29999");
					System.out.println("Do you  want to purchase \n please Select :Yes/No ");
					collectInput2();
					if(s1.equalsIgnoreCase(s2))
					{
						System.out.println("\t\t\t\t\t\t-------------Here is the Recipt of Your Purchasing Details---------------\n"
								+ "\t\t\t\t\t\tRealme 85G (ShiMmer Black)\n"
								+ "\t\t\t\t\t\t Amount paid   =  29999\n"
								+ "\t\t\t\t\t\t Product succefully purchased\n");

						main(null);
					}
					else
					{
						System.out.println("Thanks For visting Shopping Application\n\n");
						main(null);
					}
				}
				default:
					System.out.println("Please Enter valid option");
				}
			}

			case 2:
			{


				System.out.println("Products  available  in Chargers:\n"
						+"1.Ctype charger\n"
						+"2.Btype Charger\n"
						);
				System.out.println("Choose  the product you want to purchase in Chargers \n ");
				collectInput();
				switch(num_1) 
				{
				case 1:
				{
					System.out.println("\t\t\t\t\t\t----------------------------------------------------------------\n"
							+ "\t\t\t\t\t\tCtype cable ( Black color)        \n"
							+ "\t\t\t\t\t\tsuper fast charging               \n"
							+ "\t\t\t\t\t\tcost             =           299");
					System.out.println("Do you  want to purchase \n please Select :Yes/No ");
					collectInput2();
					if(s1.equalsIgnoreCase(s2))
					{
						System.out.println("\t\t\t\t\t\t-------------Here is the Recipt of Your Purchasing Details---------------\n"
								+ "\t\t\t\t\t\tCtype cable ( Black color)        \n"
								+ "\t\t\t\t\t\tsuper fast charging               \n"

							+ "\t\t\t\t\t\t Amount paid   =  29999\n"
							+ "\t\t\t\t\t\t Product succefully purchased\n");

						main(null);
					}
					else
					{
						System.out.println("Thanks For visting Shopping Application\n\n");
						main(null);
					}
				}

				case 2:
				{

					System.out.println("\t\t\t\t\t\t----------------------------------------------------------------\n"
							+ "\t\t\t\t\t\tBtype cable ( Black color)        \n"
							+ "\t\t\t\t\t\tsuper fast charging               \n"
							+ "\t\t\t\t\t\tcost             =           299");
					System.out.println("Do you  want to purchase \n please Select :Yes/No ");
					collectInput2();
					if(s1.equalsIgnoreCase(s2))
					{
						System.out.println("\t\t\t\t\t\t-------------Here is the Recipt of Your Purchasing Details---------------\n"
								+ "\t\t\t\t\t\tCtype cable ( Black color)        \n"
								+ "\t\t\t\t\t\tsuper fast charging               \n"

							+ "\t\t\t\t\t\t Amount paid   =  29999\n"
							+ "\t\t\t\t\t\t Product succefully purchased\n");

						main(null);
					}
					else
					{
						System.out.println("Thanks For visting Shopping Application\n\n");
						main(null);
					}
				}
				default:
					System.out.println("Please Enter valid option");
				}

			}
			case 3:
			{


				System.out.println("Products  available  in Laptops\n"
						+"1.HP\n"
						+"2.Dell\n"
						);
				System.out.println("Choose  the products you want to purchase in Laptop list ");
				collectInput();
				switch(num_1) 
				{
				case 1:
				{
					System.out.println("\t\t\t\t\t\t----------------------------------------------------------------\n"
							+ "\t\t\t\t\t\tHP Laptop                          \n"
							+ "\t\t\t\t\t\tRam                            12GB\n"
							+ "\t\t\t\t\t\tRom                            1TB\n"
							+ "\t\t\t\t\t\tBattery                        6hrs\n"
							+ "\t\t\t\t\t\tcost             =           59999");
					System.out.println("Do you  want to purchase \n please Select :Yes/No ");
					collectInput2();
					if(s1.equalsIgnoreCase(s2))
					{
						System.out.println("\t\t\t\t\t\t-------------Here is the Recipt of Your Purchasing Details---------------\n"
								+ "\t\t\t\t\t\tHP Laptop                          \n"
								+ "\t\t\t\t\t\tRam                            12GB\n"
								+ "\t\t\t\t\t\tRom                            1TB\n"
								+ "\t\t\t\t\t\tBattery                        6hrs\n"

							+ "\t\t\t\t\t\t Amount paid   =  29999\n"
							+ "\t\t\t\t\t\t Product succefully purchased\n");

						main(null);
					}
					else
					{
						System.out.println("Thanks For visting Shopping Application\n\n");
						main(null);
					}

				}

				case 2:
				{
					System.out.println("\t\t\t\t\t\t----------------------------------------------------------------\n"
							+ "\t\t\t\t\t\tDell Laptop                       \n"
							+ "\t\t\t\t\t\tRam                            12GB\n"
							+ "\t\t\t\t\t\tRom                            1TB\n"
							+ "\t\t\t\t\t\tBattery                        6hrs\n"
							+ "\t\t\t\t\t\tcost             =           59999");
					System.out.println("Do you  want to purchase \n please Select :Yes/No ");
					collectInput2();
					if(s1.equalsIgnoreCase(s2))
					{
						System.out.println("\t\t\t\t\t\t-------------Here is the Recipt of Your Purchasing Details---------------\n"
								+ "\t\t\t\t\t\tDell Laptop                       \n"
								+ "\t\t\t\t\t\tRam                            12GB\n"
								+ "\t\t\t\t\t\tRom                            1TB\n"
								+ "\t\t\t\t\t\tBattery                        6hrs\n"

								+ "\t\t\t\t\t\t Amount paid   =  29999\n"
								+ "\t\t\t\t\t\t Product succefully purchased\n");

						main(null);
					}
					else
					{
						System.out.println("Thanks For visting Shopping Application\n\n");
						main(null);
					}

				}
				default:


					System.out.println(" please select correct product ");
				}
			}
			case 4:
			{

				System.out.println("Choose  the products you want to purchase in Headphones  ");
				System.out.println("Products  available  in Headphones:\n"
						+"1.Bluetoot Headphones\n"
						+"2.Wire Headphones\n"
						);
				collectInput();
				switch(num_1) 
				{
				case 1:
				{
					System.out.println("\t\t\t\t\t\t----------------------------------------------------------------\n"
							+ "\t\t\t\t\t\tBluetoothHeadphones                \n"
							+ "\t\t\t\t\t\tSpeakers                3mm drivers\n"
							+ "\t\t\t\t\t\tBattery                        50hrs\n"
							+ "\t\t\t\t\t\tcost             =           999");
					System.out.println("Do you  want to purchase \n please Select :Yes/No ");
					collectInput2();
					if(s1.equalsIgnoreCase(s2))
					{
						System.out.println("\t\t\t\t\t\t-------------Here is the Recipt of Your Purchasing Details---------------\n"
								+ "\t\t\t\t\t\tBluetoothHeadphones                \n"
								+ "\t\t\t\t\t\tSpeakers                3mm drivers\n"
								+ "\t\t\t\t\t\tBattery                        50hrs\n"
								+ "\t\t\t\t\t\t Amount paid   =  999   \n"
								+ "\t\t\t\t\t\t Product succefully purchased\n");

						main(null);
					}
					else
					{
						System.out.println("Thanks For visting Shopping Application\n\n");
						main(null);
					}

				}

				case 2:
				{
					System.out.println("\t\t\t\t\t\t----------------------------------------------------------------\n"
							+ "\t\t\t\t\t\tBluetoothHeadphones                \n"
							+ "\t\t\t\t\t\tSpeakers                3mm drivers\n"
							+ "\t\t\t\t\t\tBattery                        50hrs\n"
							+ "\t\t\t\t\t\tcost             =           999");
					System.out.println("Do you  want to purchase \n please Select :Yes/No ");
					collectInput2();
					if(s1.equalsIgnoreCase(s2))
					{
						System.out.println("\t\t\t\t\t\t-------------Here is the Recipt of Your Purchasing Details---------------\n"
								+ "\t\t\t\t\t\tWire Headphones                    \n"
								+ "\t\t\t\t\t\tspeakers                       10Mm\n"

								+ "\t\t\t\t\t\t Amount paid   =  299   \n"
								+ "\t\t\t\t\t\t Product succefully purchased\n");

						main(null);
					}
					else
					{
						System.out.println("Thanks For visting Shopping Application\n\n");
						main(null);
					}

				}
				default:


					System.out.println(" please select correct product ");
				}
			}
			default:
				System.out.println(" please select correct product ");

			}
		}
		//case 3 for Fashions
		case 3:{
			System.out.println("Choose  the category in Fashions ");
			System.out.println("Category available  from Fashions:\n"
					+"1.Gents\n"
					+"2.Ladies\n"
					+"3.Kids\n"
					+"4.NightWear\n");
			collectInput();
			switch(num_1) 
			{
			case 1:
			{

				System.out.println("Choose  the products you want to purchase in Gents  ");
				System.out.println("Products  available  in Gents:\n"
						+"1.Shirt\n"
						+"2.Pant\n"
						);
				collectInput();
				switch(num_1) 
				{
				case 1:
				{
					System.out.println("\t\t\t\t\t\t----------------------------------------------------------------\n"
							+ "\t\t\t\t\t\tShirt                \n"
							+ "\t\t\t\t\t\tcost        =    999");
					System.out.println("Do you  want to purchase \n please Select :Yes/No ");
					collectInput2();
					if(s1.equalsIgnoreCase(s2))
					{
						System.out.println("\t\t\t\t\t\t-------------Here is the Recipt of Your Purchasing Details---------------\n"
								+ "\t\t\t\t\t\tshirt                   \n"

							+ "\t\t\t\t\t\t Amount paid   =  999   \n"
							+ "\t\t\t\t\t\t Product succefully purchased\n");

						main(null);
					}
					else
					{
						System.out.println("Thanks For visting Shopping Application\n\n");
						main(null);
					}

				}

				case 2:
				{
					System.out.println("\t\t\t\t\t\t----------------------------------------------------------------\n"
							+ "\t\t\t\t\t\tPant                \n"
							+ "\t\t\t\t\t\tcost        =    1299");
					System.out.println("Do you  want to purchase \n please Select :Yes/No ");
					collectInput2();
					if(s1.equalsIgnoreCase(s2))
					{
						System.out.println("\t\t\t\t\t\t-------------Here is the Recipt of Your Purchasing Details---------------\n"
								+ "\t\t\t\t\t\tPant                   \n"

							+ "\t\t\t\t\t\t Amount paid   =  1299   \n"
							+ "\t\t\t\t\t\t Product succefully purchased\n");

						main(null);
					}
					else
					{
						System.out.println("Thanks For visting Shopping Application\n\n");
						main(null);
					}


				}
				default:


					System.out.println(" please select correct product ");
				}
			}
			case 2:
			{

				System.out.println("Choose  the products you want to purchase in Ladies  ");
				System.out.println("Products  available  in Ladies:\n"
						+"1.Dress\n"
						+"2.Saree\n"
						);
				collectInput();
				switch(num_1) 
				{
				case 1:
				{
					System.out.println("\t\t\t\t\t\t----------------------------------------------------------------\n"
							+ "\t\t\t\t\t\tDress                \n"
							+ "\t\t\t\t\t\tcost        =    1999");
					System.out.println("Do you  want to purchase \n please Select :Yes/No ");
					collectInput2();
					if(s1.equalsIgnoreCase(s2))
					{
						System.out.println("\t\t\t\t\t\t-------------Here is the Recipt of Your Purchasing Details---------------\n"
								+ "\t\t\t\t\t\tDress                   \n"

							+ "\t\t\t\t\t\t Amount paid   =  999   \n"
							+ "\t\t\t\t\t\t Product succefully purchased\n");

						main(null);
					}
					else
					{
						System.out.println("Thanks For visting Shopping Application\n\n");
						main(null);
					}

				}

				case 2:
				{
					System.out.println("\t\t\t\t\t\t----------------------------------------------------------------\n"
							+ "\t\t\t\t\t\tsaree                \n"
							+ "\t\t\t\t\t\tcost        =    1299");
					System.out.println("Do you  want to purchase \n please Select :Yes/No ");
					collectInput2();
					if(s1.equalsIgnoreCase(s2))
					{
						System.out.println("\t\t\t\t\t\t-------------Here is the Recipt of Your Purchasing Details---------------\n"
								+ "\t\t\t\t\t\tSaree                   \n"

							+ "\t\t\t\t\t\t Amount paid   =  1299   \n"
							+ "\t\t\t\t\t\t Product succefully purchased\n");

						main(null);
					}
					else
					{
						System.out.println("Thanks For visting Shopping Application\n\n");
						main(null);
					}
				}

				default:


					System.out.println(" please select correct product ");
				}
			}
			case 3:
			{

				System.out.println("Choose  the products you want to purchase in Kids  ");
				System.out.println("Products  available  in Kids:\n"
						+"1.Shirt\n"
						+"2.Pant\n"
						);
				collectInput();
				switch(num_1) 
				{
				case 1:
				{
					System.out.println("\t\t\t\t\t\t----------------------------------------------------------------\n"
							+ "\t\t\t\t\t\tShirt                \n"
							+ "\t\t\t\t\t\tcost        =    999");
					System.out.println("Do you  want to purchase \n please Select :Yes/No ");
					collectInput2();
					if(s1.equalsIgnoreCase(s2))
					{
						System.out.println("\t\t\t\t\t\t-------------Here is the Recipt of Your Purchasing Details---------------\n"
								+ "\t\t\t\t\t\tshirt                   \n"

							+ "\t\t\t\t\t\t Amount paid   =  999   \n"
							+ "\t\t\t\t\t\t Product succefully purchased\n");

						main(null);
					}
					else
					{
						System.out.println("Thanks For visting Shopping Application\n\n");
						main(null);
					}

				}

				case 2:
				{
					System.out.println("\t\t\t\t\t\t----------------------------------------------------------------\n"
							+ "\t\t\t\t\t\tPant                \n"
							+ "\t\t\t\t\t\tcost        =    1299");
					System.out.println("Do you  want to purchase \n please Select :Yes/No ");
					collectInput2();
					if(s1.equalsIgnoreCase(s2))
					{
						System.out.println("\t\t\t\t\t\t-------------Here is the Recipt of Your Purchasing Details---------------\n"
								+ "\t\t\t\t\t\tPant                   \n"

							+ "\t\t\t\t\t\t Amount paid   =  1299   \n"
							+ "\t\t\t\t\t\t Product succefully purchased\n");

						main(null);
					}
					else
					{
						System.out.println("Thanks For visting Shopping Application\n\n");
						main(null);
					}


				}
				default:


					System.out.println(" please select correct product ");
				}
			}
			case 4:
			{

				System.out.println("Choose  the products you want to purchase in Nightwear ");
				System.out.println("Products  available  in Nightwear:\n"
						+"1.Tshirt\n"
						+"2.Night pant\n"
						);
				collectInput();
				switch(num_1) 
				{
				case 1:
				{
					System.out.println("\t\t\t\t\t\t----------------------------------------------------------------\n"
							+ "\t\t\t\t\t\tTShirt                \n"
							+ "\t\t\t\t\t\tcost        =    999");
					System.out.println("Do you  want to purchase \n please Select :Yes/No ");
					collectInput2();
					if(s1.equalsIgnoreCase(s2))
					{
						System.out.println("\t\t\t\t\t\t-------------Here is the Recipt of Your Purchasing Details---------------\n"
								+ "\t\t\t\t\t\tTshirt                   \n"

							+ "\t\t\t\t\t\t Amount paid   =  999   \n"
							+ "\t\t\t\t\t\t Product succefully purchased\n");

						main(null);
					}
					else
					{
						System.out.println("Thanks For visting Shopping Application\n\n");
						main(null);
					}

				}

				case 2:
				{
					System.out.println("\t\t\t\t\t\t----------------------------------------------------------------\n"
							+ "\t\t\t\t\t\tNightPant                \n"
							+ "\t\t\t\t\t\tcost        =    1299");
					System.out.println("Do you  want to purchase \n please Select :Yes/No ");
					collectInput2();
					if(s1.equalsIgnoreCase(s2))
					{
						System.out.println("\t\t\t\t\t\t-------------Here is the Recipt of Your Purchasing Details---------------\n"
								+ "\t\t\t\t\t\tNightPant                   \n"

							+ "\t\t\t\t\t\t Amount paid   =  1299   \n"
							+ "\t\t\t\t\t\t Product succefully purchased\n");

						main(null);
					}
					else
					{
						System.out.println("Thanks For visting Shopping Application\n\n");
						main(null);
					}


				}
				default:


					System.out.println(" please select correct product ");
				}
			}
			default:
				System.out.println(" please select correct product ");
			}
		}
		//Case 4 For instaMart
		case 4:{
			System.out.println("Choose  the category in InstaMart ");
			System.out.println("Category available  from InstaMart:\n"
					+"1.Rice\n"
					+"2.Lays\n"
					+"3.Biscuits\n"
					+"4.Juice\n");
			collectInput();
			switch(num_1) 
			{
			case 1:
			{

				System.out.println("Choose  the Items you want to purchase in Rice  ");
				System.out.println("Items  available  in Rice:\n"
						+"1.Sonamasoori Rice\n"
						+"2.Idily Rice\n"
						);
				collectInput();
				switch(num_1) 
				{
				case 1:
				{
					System.out.println("\t\t\t\t\t\t----------------------------------------------------------------\n"
							+ "\t\t\t\t\t\tSonamassoori                \n"
							+ "\t\t\t\t\t\tcost        =    1999");
					System.out.println("Do you  want to purchase \n please Select :Yes/No ");
					collectInput2();
					if(s1.equalsIgnoreCase(s2))
					{
						System.out.println("\t\t\t\t\t\t-------------Here is the Recipt of Your Purchasing Details---------------\n"
								+ "\t\t\t\t\t\tSonamasoori                   \n"

							+ "\t\t\t\t\t\t Amount paid   =  999   \n"
							+ "\t\t\t\t\t\t Product succefully purchased\n");

						main(null);
					}
					else
					{
						System.out.println("Thanks For visting Shopping Application\n\n");
						main(null);
					}

				}

				case 2:
				{
					System.out.println("\t\t\t\t\t\t----------------------------------------------------------------\n"
							+ "\t\t\t\t\t\tIdily Rice                \n"
							+ "\t\t\t\t\t\tcost        =    1299");
					System.out.println("Do you  want to purchase \n please Select :Yes/No ");
					collectInput2();
					if(s1.equalsIgnoreCase(s2))
					{
						System.out.println("\t\t\t\t\t\t-------------Here is the Recipt of Your Purchasing Details---------------\n"
								+ "\t\t\t\t\t\tIdily Rice                 \n"

							+ "\t\t\t\t\t\t Amount paid   =  1299   \n"
							+ "\t\t\t\t\t\t Product succefully purchased\n");

						main(null);
					}
					else
					{
						System.out.println("Thanks For visting Shopping Application\n\n");
						main(null);
					}

				}
				default:


					System.out.println(" please select correct product ");
				}
			}
			case 2:
			{

				System.out.println("Choose  the Items you want to purchase in Lays  ");
				System.out.println("Items  available  in INstamart:\n"
						+"1.Red Lays\n"
						+"2.Greeen Lays\n"
						);
				collectInput();
				switch(num_1) 
				{
				case 1:
				{
					System.out.println("\t\t\t\t\t\t----------------------------------------------------------------\n"
							+ "\t\t\t\t\t\tRed Lays                                             \n"
							+ "\t\t\t\t\t\tcost        =    20");
					System.out.println("Do you  want to purchase \n please Select :Yes/No ");
					collectInput2();
					if(s1.equalsIgnoreCase(s2))
					{
						System.out.println("\t\t\t\t\t\t-------------Here is the Recipt of Your Purchasing Details---------------\n"
								+ "\t\t\t\t\t\tRed Lays                    \n"

							+ "\t\t\t\t\t\t Amount paid   =  999   \n"
							+ "\t\t\t\t\t\t Product succefully purchased\n");

						main(null);
					}
					else
					{
						System.out.println("Thanks For visting Shopping Application\n\n");
						main(null);
					}

				}

				case 2:
				{
					System.out.println("\t\t\t\t\t\t----------------------------------------------------------------\n"
							+ "\t\t\t\t\t\tGreenLays              \n"
							+ "\t\t\t\t\t\tcost        =    ");
					System.out.println("Do you  want to purchase \n please Select :Yes/No ");
					collectInput2();
					if(s1.equalsIgnoreCase(s2))
					{
						System.out.println("\t\t\t\t\t\t-------------Here is the Recipt of Your Purchasing Details---------------\n"
								+ "\t\t\t\t\t\tPant                   \n"

							+ "\t\t\t\t\t\t Amount paid   =  1299   \n"
							+ "\t\t\t\t\t\t Product succefully purchased\n");

						main(null);
					}
					else
					{
						System.out.println("Thanks For visting Shopping Application\n\n");
						main(null);
					}


				}

				default:


					System.out.println(" please select correct product ");
				}
			}
			case 3:
			{

				System.out.println("Choose  the Items you want to purchase in Biscuits ");
				System.out.println("Items  available  in Biscuits:\n"
						+"1.MariGold\n"
						+"2.KrackJackn"
						);
				collectInput();
				switch(num_1) 
				{
				case 1:
				{
					System.out.println("\t\t\t\t\t\t----------------------------------------------------------------\n"
							+ "\t\t\t\t\t\tMariGold              \n"
							+ "\t\t\t\t\t\tcost        =    999");
					System.out.println("Do you  want to purchase \n please Select :Yes/No ");
					collectInput2();
					if(s1.equalsIgnoreCase(s2))
					{
						System.out.println("\t\t\t\t\t\t-------------Here is the Recipt of Your Purchasing Details---------------\n"
								+ "\t\t\t\t\t\tMariGold                   \n"

						+ "\t\t\t\t\t\t Amount paid   =  99   \n"
						+ "\t\t\t\t\t\t Product succefully purchased\n");

						main(null);
					}
					else
					{
						System.out.println("Thanks For visting Shopping Application\n\n");
						main(null);
					}

				}

				case 2:
				{
					System.out.println("\t\t\t\t\t\t----------------------------------------------------------------\n"
							+ "\t\t\t\t\t\tKrackJack                \n"

						+ "\t\t\t\t\t\tcost        =    29");
					System.out.println("Do you  want to purchase \n please Select :Yes/No ");
					collectInput2();
					if(s1.equalsIgnoreCase(s2))
					{
						System.out.println("\t\t\t\t\t\t-------------Here is the Recipt of Your Purchasing Details---------------\n"
								+ "\t\t\t\t\t\tKrackJack                  \n"

						+ "\t\t\t\t\t\t Amount paid   =  1299   \n"
						+ "\t\t\t\t\t\t Product succefully purchased\n");

						main(null);
					}
					else
					{
						System.out.println("Thanks For visting Shopping Application\n\n");
						main(null);
					}


				}
				default:


					System.out.println(" please select correct product ");
				}
			}
			case 4:
			{

				System.out.println("Choose  the flavour you want to purchase in Juice  ");
				System.out.println("Flavours  available  in Juice:\n"
						+"1.Vannela mix\n"
						+"2.Butterscotch\n"
						);
				collectInput();
				switch(num_1) 
				{
				case 1:
				{
					System.out.println("\t\t\t\t\t\t----------------------------------------------------------------\n"
							+ "\t\t\t\t\t\tVannela mix              \n"
							+ "\t\t\t\t\t\tcost        =    99");
					System.out.println("Do you  want to purchase \n please Select :Yes/No ");
					collectInput2();
					if(s1.equalsIgnoreCase(s2))
					{
						System.out.println("\t\t\t\t\t\t-------------Here is the Recipt of Your Purchasing Details---------------\n"
								+ "\t\t\t\t\t\tVannela mix                   \n"

						+ "\t\t\t\t\t\t Amount paid   =  99   \n"
						+ "\t\t\t\t\t\t Product succefully purchased\n");

						main(null);
					}
					else
					{
						System.out.println("Thanks For visting Shopping Application\n\n");
						main(null);
					}

				}

				case 2:
				{
					System.out.println("\t\t\t\t\t\t----------------------------------------------------------------\n"
							+ "\t\t\t\t\t\tButterscotch                \n"

						+ "\t\t\t\t\t\tcost        =    99");
					System.out.println("Do you  want to purchase \n please Select :Yes/No ");
					collectInput2();
					if(s1.equalsIgnoreCase(s2))
					{
						System.out.println("\t\t\t\t\t\t-------------Here is the Recipt of Your Purchasing Details---------------\n"
								+ "\t\t\t\t\t\tButterscotch                  \n"

						+ "\t\t\t\t\t\t Amount paid   =  99   \n"
						+ "\t\t\t\t\t\t Product succefully purchased\n");

						main(null);
					}
					else
					{
						System.out.println("Thanks For visting Shopping Application\n\n");
						main(null);
					}

				}
				default:


					System.out.println(" please select correct product ");
				}
			}
			default:
				System.out.println(" please select correct product ");
			}
		}
		//case 5 Sports 
		case 5:{
			System.out.println("Choose  the category in Sports ");
			System.out.println("Category available  from Sports:\n"
					+"1.Cricket kit\n"
					+"2.Volley ball kit\n"
					+"3.Clothes\n"
					+"4.safety kit\n");
			collectInput();
			switch(num_1) 
			{
			case 1:
			{

				System.out.println("Choose  the products you want to purchase in Cricket kit  ");
				System.out.println("Products  available  in Furnitures:\n"
						+"1.Bat\n"
						+"2.Ball\n"
						);
				collectInput();
				switch(num_1) 
				{
				case 1:
				{
					System.out.println("\t\t\t\t\t\t----------------------------------------------------------------\n"
							+ "\t\t\t\t\t\tBat              \n"
							+ "\t\t\t\t\t\tcost        =    999");
					System.out.println("Do you  want to purchase \n please Select :Yes/No ");
					collectInput2();
					if(s1.equalsIgnoreCase(s2))
					{
						System.out.println("\t\t\t\t\t\t-------------Here is the Recipt of Your Purchasing Details---------------\n"
								+ "\t\t\t\t\t\tBat                  \n"

							+ "\t\t\t\t\t\t Amount paid   =  999   \n"
							+ "\t\t\t\t\t\t Product succefully purchased\n");

						main(null);
					}
					else
					{
						System.out.println("Thanks For visting Shopping Application\n\n");
						main(null);
					}

				}

				case 2:
				{
					System.out.println("\t\t\t\t\t\t----------------------------------------------------------------\n"
							+ "\t\t\t\t\t\tBall                \n"

							+ "\t\t\t\t\t\tcost        =    99");
					System.out.println("Do you  want to purchase \n please Select :Yes/No ");
					collectInput2();
					if(s1.equalsIgnoreCase(s2))
					{
						System.out.println("\t\t\t\t\t\t-------------Here is the Recipt of Your Purchasing Details---------------\n"
								+ "\t\t\t\t\t\tBall                  \n"

							+ "\t\t\t\t\t\t Amount paid   =  99   \n"
							+ "\t\t\t\t\t\t Product succefully purchased\n");

						main(null);
					}
					else
					{
						System.out.println("Thanks For visting Shopping Application\n\n");
						main(null);
					}

				}
				default:


					System.out.println(" please select correct product ");
				}
			}
			case 2:
			{

				System.out.println("Choose  the products you want to purchase in volleyball  ");
				System.out.println("Products  available  in Blankets:\n"
						+"1.Volley ball\n"
						+"2.volley ball Net\n"
						);
				collectInput();
				switch(num_1) 
				{
				case 1:
				{System.out.println("\t\t\t\t\t\t----------------------------------------------------------------\n"
						+ "\t\t\t\t\t\tVolleyBall             \n"
						+ "\t\t\t\t\t\tcost        =    99");
				System.out.println("Do you  want to purchase \n please Select :Yes/No ");
				collectInput2();
				if(s1.equalsIgnoreCase(s2))
				{
					System.out.println("\t\t\t\t\t\t-------------Here is the Recipt of Your Purchasing Details---------------\n"
							+ "\t\t\t\t\t\tVolley Ball                   \n"

						+ "\t\t\t\t\t\t Amount paid   =  999   \n"
						+ "\t\t\t\t\t\t Product succefully purchased\n");

					main(null);
				}
				else
				{
					System.out.println("Thanks For visting Shopping Application\n\n");
					main(null);
				}

				}

				case 2:
				{
					System.out.println("\t\t\t\t\t\t----------------------------------------------------------------\n"
							+ "\t\t\t\t\t\tVollleyBall Net                \n"

						+ "\t\t\t\t\t\tcost        =    900");
					System.out.println("Do you  want to purchase \n please Select :Yes/No ");
					collectInput2();
					if(s1.equalsIgnoreCase(s2))
					{
						System.out.println("\t\t\t\t\t\t-------------Here is the Recipt of Your Purchasing Details---------------\n"
								+ "\t\t\t\t\t\tVolleyBall Net                  \n"

						+ "\t\t\t\t\t\t Amount paid   =  900   \n"
						+ "\t\t\t\t\t\t Product succefully purchased\n");

						main(null);
					}
					else
					{
						System.out.println("Thanks For visting Shopping Application\n\n");
						main(null);
					};


				}

				default:


					System.out.println(" please select correct product ");
				}
			}
			case 3:
			{

				System.out.println("Choose  the products you want to purchase in Clothes  ");
				System.out.println("Products  available  in Clothes:\n"
						+"1.Thshirt\n"
						+"2.Short\n"
						);
				collectInput();
				switch(num_1) 
				{
				case 1:
				{
					System.out.println("\t\t\t\t\t\t----------------------------------------------------------------\n"
							+ "\t\t\t\t\t\tTshirt              \n"
							+ "\t\t\t\t\t\tcost        =    199");
					System.out.println("Do you  want to purchase \n please Select :Yes/No ");
					collectInput2();
					if(s1.equalsIgnoreCase(s2))
					{
						System.out.println("\t\t\t\t\t\t-------------Here is the Recipt of Your Purchasing Details---------------\n"
								+ "\t\t\t\t\t\tTShirt                   \n"

							+ "\t\t\t\t\t\t Amount paid   =  199   \n"
							+ "\t\t\t\t\t\t Product succefully purchased\n");

						main(null);
					}
					else
					{
						System.out.println("Thanks For visting Shopping Application\n\n");
						main(null);
					}

				}

				case 2:
				{
					System.out.println("\t\t\t\t\t\t----------------------------------------------------------------\n"
							+ "\t\t\t\t\t\tShort                \n"

							+ "\t\t\t\t\t\tcost        =    299");
					System.out.println("Do you  want to purchase \n please Select :Yes/No ");
					collectInput2();
					if(s1.equalsIgnoreCase(s2))
					{
						System.out.println("\t\t\t\t\t\t-------------Here is the Recipt of Your Purchasing Details---------------\n"
								+ "\t\t\t\t\t\tSHort                  \n"

							+ "\t\t\t\t\t\t Amount paid   =  299   \n"
							+ "\t\t\t\t\t\t Product succefully purchased\n");

						main(null);
					}
					else
					{
						System.out.println("Thanks For visting Shopping Application\n\n");
						main(null);
					};


				}
				default:


					System.out.println(" please select correct product ");
				}
			}
			case 4:
			{

				System.out.println("Choose  the products you want to purchase in Safetykit  ");
				System.out.println("Products  available  in Kitechen Decors:\n"
						+"1.Helmet\n"
						+"2.Gloves\n"
						);
				collectInput();
				switch(num_1) 
				{
				case 1:
				{
					System.out.println("\t\t\t\t\t\t----------------------------------------------------------------\n"
							+ "\t\t\t\t\t\tHelmet              \n"
							+ "\t\t\t\t\t\tcost        =    499");
					System.out.println("Do you  want to purchase \n please Select :Yes/No ");
					collectInput2();
					if(s1.equalsIgnoreCase(s2))
					{
						System.out.println("\t\t\t\t\t\t-------------Here is the Recipt of Your Purchasing Details---------------\n"
								+ "\t\t\t\t\t\tHelmet                  \n"

							+ "\t\t\t\t\t\t Amount paid   =  499   \n"
							+ "\t\t\t\t\t\t Product succefully purchased\n");

						main(null);
					}
					else
					{
						System.out.println("Thanks For visting Shopping Application\n\n");
						main(null);
					}

				}

				case 2:
				{
					System.out.println("\t\t\t\t\t\t----------------------------------------------------------------\n"
							+ "\t\t\t\t\t\tGloves                \n"

							+ "\t\t\t\t\t\tcost        =    299");
					System.out.println("Do you  want to purchase \n please Select :Yes/No ");
					collectInput2();
					if(s1.equalsIgnoreCase(s2))
					{
						System.out.println("\t\t\t\t\t\t-------------Here is the Recipt of Your Purchasing Details---------------\n"
								+ "\t\t\t\t\t\tGloves                  \n"

							+ "\t\t\t\t\t\t Amount paid   =  299   \n"
							+ "\t\t\t\t\t\t Product succefully purchased\n");

						main(null);
					}
					else
					{
						System.out.println("Thanks For visting Shopping Application\n\n");
						main(null);
					};



				}
				default:


					System.out.println(" please select correct product \n");
					main(null);
				}
			}
			default:
				System.out.println(" please select correct product\n ");
				main(null);
			}
		}
		case 6:
		{
			System.out.println("Thanks For Visiting Shopping Application");
			System.exit(0);
		}

		default:

			System.out.println(" please select correct product\n ");
			main(null);

		}
	}
}