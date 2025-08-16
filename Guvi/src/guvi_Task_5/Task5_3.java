package guvi_Task_5;

import java.util.Scanner;

public class Task5_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		
		int Num = sc.nextInt();
		int Num1 =1;
		
		for(int i=1; i<=Num ; i++) {
			for(int j= 1; j<=i ; j++) {
				System.out.print(Num1 + " ");
				Num1++;
			}
			System.out.println();
		}
		sc.close();
	}

}
