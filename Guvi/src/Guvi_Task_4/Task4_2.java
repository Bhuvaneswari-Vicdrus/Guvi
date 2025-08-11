package Guvi_Task_4;

import java.util.Scanner;

public class Task4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner num = new Scanner(System.in);
		
		System.out.println("Enter the value:");
		
		int value  = num.nextInt();
		
		if (value%2==0) {
			System.out.println("Entered value is an even number");
		}
		else {
			System.out.println("Entered value is a odd number");
		}
		num.close();
	}

}
