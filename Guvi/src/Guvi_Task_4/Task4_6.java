package Guvi_Task_4;

import java.util.Scanner;

public class Task4_6 {

	public static void main(String[] args) {

		Scanner num = new Scanner(System.in);
		
		System.out.println("Enter the value:");
		
		int No  = num.nextInt();
		int temp = 1;
		
		for(int i=1; i<=No ;i++ ) {
			temp = i * temp;
		}
		
		System.out.println("Factorial value is: " + temp);
		
		num.close();
		
	}

}
