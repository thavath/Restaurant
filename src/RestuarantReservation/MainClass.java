package RestuarantReservation;

import java.util.Scanner;

	public class MainClass{
		public static void menu() {
			System.out.println("================================================================");
			System.out.println("================================================================");
			System.out.println("	========  (1)==New--Table		========");
			System.out.println("	========  (2)==List--of--Tables		========");
			System.out.println("	========  (3)==New--Food		========");
			System.out.println("	========  (4)==List--of--Foods		========");
			System.out.println("	========  (5)==Take--Reservation	========");
			System.out.println("	========  (6)==List--of--Reservations	========");
			System.out.println("	========  (7)==Take--Order		========");
			System.out.println("	========  (8)==List--of--Orders		========");
			System.out.println("	========  (9)==Exit--the--Program	========");
			System.out.println("================================================================");
			
	}
	public static void main(String[] args) {
		
		Table ta= new Table();
		Food f = new Food();
		
		Scanner input = new Scanner(System.in);
		
		try {
			do {
				menu();
				System.out.println("\t\t---------------------- Please--Input--Your--Choice : ");
			
				while (!input.hasNextInt()) {
		             System.out.print("You must enter a valid number! Try again: ");
		             input.next();
		       } 
				int choice;
				choice = input.nextInt();
		
				switch(choice) {
			
				case 1:	
					ta.createTable();
					break;
				case 2:
					System.out.println(ta.toString());
					break;
				case 3:
					f.createFood();
					break;
				case 4:
					System.out.println(f.toString());
					break;
				case 5:
					break;
				case 6:
					break;
				case 7:
					break;
				case 8:
					break;
				case 9:
					System.exit(0);
					break;
				default:
					System.out.println("Invalid Number");                    
		                break;
				}
				System.out.println("Do you want to continue to menu form?[Y/N]");
				input.nextLine().trim();
			 } while (input.nextLine().equalsIgnoreCase("y"));
		
		}finally {
	          input.close();
	    }	
	}
}
