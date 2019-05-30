import java.util.*;

public class testMenuList {
	private static Scanner input;

	public static void main(String[] args) {

		input = new Scanner(System.in);
		double menuprice = 0;
        WASHROOM wr = new WASHROOM(true);
        WIFI wifi = new WIFI();
        teatable T = new teatable(true);
       
     
        LuxuriousRoom LR1 = new LuxuriousRoom(false,true,true,true,wr,true,true,wifi,true,T,true,true,true,true,true,true,true);
        System.out.println(LR1.toString());
        
		System.out.println("\n name of food.... \n");

		java.util.ArrayList<ItemsMENU> Menulist = new java.util.ArrayList<ItemsMENU>();
		Menulist.add(0, new ItemsMENU("Coke", 30));
		Menulist.add(1, new ItemsMENU("papsi", 30));
		Menulist.add(2, new ItemsMENU("fanta", 30));
		int j = 0;
		for (ItemsMENU Menu : Menulist) {

			System.out.print(++j + " : " + Menu + "\n");
		}
		String S1 = new String();
		int select = input.nextInt();

		switch (select) {
		case 1:
			System.out.println("You Have Choose ---> " + Menulist.get(select - 1));
			menuprice = 30;
			System.out.println("\nYour Bill = " + menuprice);
			break;
		case 2:
			System.out.println("You Have Choose ---> " + Menulist.get(select - 1));
			menuprice = 30;
			System.out.println("\nYour Bill = " + menuprice);
			break;
		case 3:
			System.out.println("You Have Choose ---> " + Menulist.get(select - 1));
			menuprice = 30;
			System.out.println("\nYour Bill = " + menuprice);
			break;

		}

	}

}
