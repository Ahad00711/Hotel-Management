import java.sql.*;
import java.util.*;

public class TestHotel {

	private static Scanner input;
	private static Scanner input1;
	private static Scanner input2;
	private static Scanner input3;
	private static Scanner input4;

	public static void main(String[] args) {

		ROOM room1 = new ROOM();
		FurnishedRoom Froom1 = new FurnishedRoom();
		LuxuriousRoom Lroom1 = new LuxuriousRoom();
		input = new Scanner(System.in);
		input1 = new Scanner(System.in);
		input2 = new Scanner(System.in);
		input3 = new Scanner(System.in);
		input4 = new Scanner(System.in);

		HOTEL H = new HOTEL();
		H.hotelwelcome();

		System.out.println(
				"\n**************************************\n"
				+ "Select options Below  :              *\n"
				+ "**************************************\n"
				+ "1: Room Booking .                    *\n"
				+ "2: Room information .                *\n"
				+ "3: Restaurant(For food Order).       *\n"
				+ "4: Hotel Leaving Feedbacks.          *\n"
				+ "5: Exit .                            *\n"
	            + "**************************************");
	
		int z;
		
		do {
		
		int select = input.nextInt();
        z = select;
		Receptionist R1 = new Receptionist();
		System.out.println("\nYou Have Selected ---->  "
				+ "<< " + select + " >>");

		switch (select) {
		case 1:
			System.out.println("You Have Choose ---> << Room Booking. >>");
			// welcome
			System.out.println(R1.getrecepWelcomeMessage());
			System.out.println("--------------------------------------------------------");
			System.out.println("Enter your Name for Booking Room : ");
			R1.setCustomerName(input1.nextLine());
			System.out.println("Enter your ID Card Number for Booking Room : ");
			R1.setCustomerID(input2.nextLine());
			System.out.println("Enter your Phone Number for Booking Room : ");
			R1.setCustomerPhone(input3.nextLine());
			System.out.println("Enter your Address for Booking Room : ");
			R1.setCustomerAddress(input4.nextLine());

			 
	        try {
				// create connection
				Connection conn = DriverManager.getConnection("jdbc:ucanaccess://" + "E://3rd semester//OOP//final project//Database1.accdb");
				
				PreparedStatement s = conn.prepareStatement("INSERT INTO C(Customer,Name,ID Card,Phone,Address)" + " VALUES (1,'"+R1.getCustomerName()+"','"+R1.getCustomerID()+"','"+R1.getCustomerPhone()+"','"+R1.getCustomerAddress()+"')");
    
				
	                        int numRows = s.executeUpdate();
	            			if (numRows == 1) // numRows: number of affected rows
	            				System.out.println("Record Inserted Successfully!");

	                        
				
			
				// execute insert query and check if successfully inserted
			}
	        catch (SQLException e) {
				System.out.println(e.getMessage());
			}

	               
			
			System.out.println(
					"--------------------------------------------------------\n"
					+ "________________________________________________________\n"
					+ "   You have enter your information for booking a Room \n"
					+ "________________________________________________________\n");
			System.out.println(R1);
			System.out.println("\nEnter   'y' , 'Y' , 'Yes' , 'yes' to check room Information\n");
			String enter = input.next();

			switch (enter) {
			case "yes":
				System.out.println ("\n*******************************************************");
				System.out.println ("*****************  Room Information   *****************");
				System.out.println ("*******************************************************");
				System.out.println(room1.toString());
				System.out.println("-------------------------------------------------------");
				System.out.println(Froom1.toString());
				System.out.println("-------------------------------------------------------");
				System.out.println(Lroom1.toString());
				System.out.println("-------------------------------------------------------");
				break;
			case "Y":
				System.out.println("\n*******************************************************");
				System.out.println("*****************  Room Information   *****************");
				System.out.println("*******************************************************");
				System.out.println(room1.toString());
				System.out.println("-------------------------------------------------------");
				System.out.println(Froom1.toString());
				System.out.println("-------------------------------------------------------");
				System.out.println(Lroom1.toString());
				System.out.println("-------------------------------------------------------");
				break;
			case "y":
				System.out.println("\n*******************************************************");
				System.out.println("*****************  Room Information   *****************");
				System.out.println("*******************************************************");
				System.out.println(room1.toString());
				System.out.println("-------------------------------------------------------");
				System.out.println(Froom1.toString());
				System.out.println("-------------------------------------------------------");
				System.out.println(Lroom1.toString());
				System.out.println("-------------------------------------------------------");
				break;
			case "Yes":
				System.out.println("\n*******************************************************");
				System.out.println("*****************  Room Information   *****************");
				System.out.println("*******************************************************");
				System.out.println(room1.toString());
				System.out.println("-------------------------------------------------------");
				System.out.println(Froom1.toString());
				System.out.println("-------------------------------------------------------");
				System.out.println(Lroom1.toString());
				System.out.println("-------------------------------------------------------");
				break;

			}

			System.out
					.println("\n***************************\n"
							+ "*********  Enter  *********\n"
							+ "***************************");
			System.out.println(
					  "1: to Buy Room\n"
					+ "2: to Buy Furnished Room\n"
					+ "3: to Buy Luxurious Room\n"
					+ "0: To recheck Rooms Info\n\n"
					+ "---------------------------");
	int i;	
	do {
			int select1 = input.nextInt();
			i=select1;
	
				switch (select1) {
				case 1:
					System.out.println("You Have Enter (1)---> For Rent a Room");
					R1.generateBill(room1.getRent());
                    i=select1; 
					break;
				case 2:
					System.out.println("You Have Enter (2)---> For Rent a Furnished Room");
					R1.generateBill(Froom1.getFrent());
					 i=select1;
					break;
				case 3:
					System.out.println("You Have Enter (3)---> For Rent a Luxurious Room");
					R1.generateBill(Lroom1.getLrent());
					 i=select1;
					break;
				default:
					System.out.println("Enter number between ( 1-3 )"
							+"\n____________________\n"
							+  "      AGAIN Enter   \n"
							+  "--------------------- "	);
					System.out
					.println("\n***************************\n"
							+ "*********  Enter  *********\n"
							+ "***************************");
			System.out.println(
					  "1: to Buy Room\n"
					+ "2: to Buy Furnished Room\n"
					+ "3: to Buy Luxurious Room\n"
					+ "0: To recheck Rooms Info\n\n"
					+ "---------------------------");
					 i=select1;
					break;

				}
				

			} while (i>3);

	        z=select;
			break;

		// ROOM Info

		case 2:
			System.out.println("You Have Choose --->  "
					+ "<< Room information. >>\n");
			System.out.println("*******************************************************");
			System.out.println("*****************  Room Information   *****************");
			System.out.println("*******************************************************");
			System.out.println(room1.toString());
			System.out.println("-------------------------------------------------------");
			System.out.println(Froom1.toString());
			System.out.println("-------------------------------------------------------");
			System.out.println(Lroom1.toString());
			System.out.println("-------------------------------------------------------");
            z=select;
			break;

		//

		case 3:
			
			int j = 0;
			
		
			
				System.out.println("You Have Choose --->  "
					+ "<< Restaurant (For food Order). >>");
			System.out.println(
					"\n**************************************\n"
					+ "**************   Menu   **************\n"
					+ "**************************************");
			System.out.println("\nSelect Your Order ... \n");

			java.util.ArrayList<ItemsMENU> Menulist = new java.util.ArrayList<ItemsMENU>();
			Menulist.add(0, new ItemsMENU("RegularDrink 'Coke , Fanta ,7up'", 30));
			Menulist.add(1, new ItemsMENU("Pizza", 900));
			Menulist.add(2, new ItemsMENU("Zinger Burger", 300));
			Menulist.add(3, new ItemsMENU("Prawns", 1500));
			Menulist.add(4, new ItemsMENU("Fried Fish", 1000));
			Menulist.add(5, new ItemsMENU("Macroni", 500));
			Menulist.add(6, new ItemsMENU("Spagheti", 400));
			Menulist.add(7, new ItemsMENU("Ice Cream", 150));
			Menulist.add(8, new ItemsMENU("Brownie", 200));
			Menulist.add(9, new ItemsMENU("Chicken Sajji", 800));
			Menulist.add(10, new ItemsMENU("Chicken Manchurian", 500));
			Menulist.add(11, new ItemsMENU("Chicken Steaks", 700));
		
	

			
			for (ItemsMENU Menu : Menulist) {

				System.out.print(++j + " : " + Menu + "\n");
			}
	
			do {
			int select2 = input.nextInt();
		    j = select2 ;
			double menuprice = 0;
			switch (select2) {
			case 1:
				System.out.println("You Have Choose ---> "
			+ Menulist.get(select2-1 ));
				menuprice = 30;
				System.out.println("\nYour Bill = " 
			+ menuprice);
				j=select2;
				break;
			case 2:
				System.out.println("You Have Choose ---> " 
			+ Menulist.get(select2-1 ));
				menuprice = 900;
				System.out.println("\nYour Bill = " 
			+ menuprice);
				j=select2;
				break;
			case 3:
				System.out.println("You Have Choose ---> " 
			+ Menulist.get(select2-1 ));
				menuprice = 300;
				System.out.println("\nYour Bill = "
			+ menuprice);
				j=select2;
				break;
			case 4:
				System.out.println("You Have Choose ---> " 
			+ Menulist.get(select2-1 ));
				menuprice = 1500;
				System.out.println("\nYour Bill = "
			+ menuprice);
				j=select2;
				break;
				
			case 5:
				System.out.println("You Have Choose ---> " 
			+ Menulist.get(select2-1 ));
				menuprice = 1000;
				System.out.println("\nYour Bill = "
			+ menuprice);
				j=select2;
				break;
			case 6:
				System.out.println("You Have Choose ---> " 
			+ Menulist.get(select2-1 ));
				menuprice = 500;
				System.out.println("\nYour Bill = "
			+ menuprice);
				j=select2;
				break;
			case 7:
				System.out.println("You Have Choose ---> " 
			+ Menulist.get(select2-1 ));
				menuprice = 400;
				System.out.println("\nYour Bill = "
			+ menuprice);
				j=select2;
				break;
			case 8:
				System.out.println("You Have Choose ---> " 
			+ Menulist.get(select2-1 ));
				menuprice = 150;
				System.out.println("\nYour Bill = "
			+ menuprice);
				j=select2;
				break;
			case 9:
				System.out.println("You Have Choose ---> " 
			+ Menulist.get(select2-1 ));
				menuprice = 200;
				System.out.println("\nYour Bill = "
			+ menuprice);
				j=select2;
				break;
			case 10:
				System.out.println("You Have Choose ---> " 
			+ Menulist.get(select2-1 ));
				menuprice = 800;
				System.out.println("\nYour Bill = "
			+ menuprice);
				j=select2;
				break;
			case 11:
				System.out.println("You Have Choose ---> " 
			+ Menulist.get(select2-1 ));
				menuprice = 500;
				System.out.println("\nYour Bill = "
			+ menuprice);
				j=select2;
				break;

			case 12:
				System.out.println("You Have Choose ---> " 
			+ Menulist.get(select2-1 ));
				menuprice = 700;
				System.out.println("\nYour Bill = "
			+ menuprice);
				j=select2;
				break;
			default:
				System.out.println("Enter number between ( 1-12 )"
						+"\n____________________\n"
						+  "      AGAIN Select  \n"
						+  "--------------------"	);
					
				j=select2;
				
		
			}
			} while (j>12);
			
			z=select;
			break;

		// Feedback user
			

		case 4:
			System.out.println("You Have Choose --->  "
					+ "<< Hotel Leaving Feedback >>\n"
					+ "Give your Feedback");
			input.nextLine();
			H.setFeedback(input.next());
            z=select;
			break;
		
		// program Exit
			
		case 5:
			System.out.println("You Have Choose --->"
					+ "  << Exit. >>");
			System.out.println(
					"\n**************************************\n"
					+ "* <<  Program Has been Terminated >> *\n"
					+ "**************************************\n");
			System.exit(0);
			z=select;
			break;
		default:
			System.out.println("Enter number between ( 1-5 )"
					+"\n____________________\n"
					+  "      AGAIN Select  \n"
					+  "--------------------- "	);
			
			System.out.println(
					"\n**************************************\n"
					+ "Select options Below  :              *\n"
					+ "**************************************\n"
					+ "1: Room Booking .                    *\n"
					+ "2: Room information .                *\n"
					+ "3: Restaurant(For food Order).       *\n"
					+ "4: Hotel Leaving Feedbacks.          *\n"
					+ "5: Exit .                            *\n"
		            + "**************************************");
			 z=select;
			break;
	 }
    } 
while (z>5);	
  }
}
