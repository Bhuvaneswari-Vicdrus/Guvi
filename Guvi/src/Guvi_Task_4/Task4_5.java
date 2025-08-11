package Guvi_Task_4;

import java.util.Scanner;

public class Task4_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner num = new Scanner(System.in);
		
		System.out.println("Enter the value:");
		
		int No  = num.nextInt();
		
		if(No == 1 ){
			System.out.println( No + " is a prime number");
		}
		else
		{
		int count = 0;
		
		for(int i=1; i<=No ; i++) {
			
			if(No%i == 0) {
				count++;
			}
		}
		
		if(count==2) {
			System.out.println( No + " is a prime number");
		}
		else {
			System.out.println( No + " is not a prime number");
		}
		}
		
		num.close();
	}

}
