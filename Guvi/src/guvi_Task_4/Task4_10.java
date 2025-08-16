package guvi_Task_4;

import java.util.Scanner;

public class Task4_10 {

	public static void main(String[] args) {
		

		Scanner Num = new Scanner(System.in);
		
		System.out.println("Enter the values");
		
		int a = Num.nextInt();
		a= Math.abs(a);
		int count = 0;
		
		
		while(a > 0) {
			a = a/10;
			count++;
		}
		
		System.out.println("Enter the values: " + count);
		
		Num.close();
	}
	
}
