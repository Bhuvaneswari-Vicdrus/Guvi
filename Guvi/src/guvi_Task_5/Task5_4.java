package guvi_Task_5;

import java.util.Scanner;

public class Task5_4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		
		int Num = sc.nextInt();
				
		for(int i=0; i<Num ; i++) {
			for(int j= 0; j<Num ; j++) {
				if(i==j || j==(Num-1-i)) {
				System.out.print("*");
				}
				else {
				System.out.print(" ");
				}
			}
			System.out.println();
		}
		sc.close();
	}

}
