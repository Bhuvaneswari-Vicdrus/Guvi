package Guvi_Task_4;

import java.util.Scanner;

public class Task4_4 {

	public static void main(String[] args) {
		
		Scanner num = new Scanner(System.in);
		
		System.out.println("Enter the value:");
		
		int num1  = num.nextInt();
		int num2 = num.nextInt();
		
		System.out.println("Before swapping: num1 = " + num1 + " num2 = " + num2);
		
		int Temp = num1;
		num1 = num2;
		num2 = Temp;
		
		System.out.println("After swapping: num1 = " + num1 + " num2 = " + num2);
		
		num.close();
	}
	

}
