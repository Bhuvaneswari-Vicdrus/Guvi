package guvi_Task_5;

import java.util.Scanner;

public class Task5_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the values of a, b, c");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a>=b && a>=c) {
			System.out.println("a is the largest number among three numbers");
		}
		else if(b>=a && b>= c) {
			System.out.println("b is the largest number among three numbers");
		}
		else {
			System.out.println("c is the largest number among three numbers");
		}
		
		sc.close();
		
	}

}

