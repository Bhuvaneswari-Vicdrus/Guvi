package guvi_Task_5;

import java.util.Scanner;

public class Task5_6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the month");
		int month = sc.nextInt();
		System.out.println("Enter the Rent");
		double Rent = sc.nextDouble();
		System.out.println("Enter the values of Days");
		int Days = sc.nextInt();

		double total;
	
		switch(month) {
		case 1:
		case 2:
		case 3:
		case 7:
		case 8:
		case 9:
		case 10:
		total = Rent * Days ;
		System.out.println("Hotel tariff: " + total);
		break;
		
		case 4:
		case 5:
		case 6:
		case 11:
		case 12:
			Rent = Rent + (Rent * 0.2);
			total = Rent * Days ;
			System.out.println("Hotel tariff: " + total);
			break;
			
		default:
            System.out.println("Invalid month entered");
		}
		
		sc.close();
		
	}

}
