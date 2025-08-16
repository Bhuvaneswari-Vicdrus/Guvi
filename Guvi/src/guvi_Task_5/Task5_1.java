package guvi_Task_5;

import java.util.Scanner;

public class Task5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word to check if it is a palindrome:");
		String str = sc.nextLine();
		
		String rev = new StringBuilder(str).reverse().toString();
		
		System.out.println(str.equalsIgnoreCase(rev) ? "Palindrome":"Not Palindrome");
		
		sc.close();
	}

}
