package Guvi_Task_4;

import java.util.Scanner;

public class Task4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner integer = new Scanner(System.in);
		
		System.out.println("Enter the values of a, b, c, d");
		
		int a = integer.nextInt();
		int b = integer.nextInt();
		int c = integer.nextInt();
		int d = integer.nextInt();
		
		if ((a+b)>(c+d)) {
			System.out.println("Sum of a+b is greater than c+d");
		}
		else
		{
			System.out.println("Sum of c+d is greater than a+b");
		}
		integer.close();
		
	}

}
