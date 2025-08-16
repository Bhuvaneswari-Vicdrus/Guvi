package guvi_Task_5;

import java.util.Scanner;

public class Task5_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String to reverse: ");
		
		String S = sc.nextLin	e();
		
		String rev = "";
		
		for(int i= S.length()-1; i>=0;i--) {
			rev +=  S.charAt(i);
		}
		
		System.out.println("Reversed String: "+ rev);
		sc.close();
	

	}

}
