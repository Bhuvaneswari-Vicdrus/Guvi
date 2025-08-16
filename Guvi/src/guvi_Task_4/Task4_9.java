package guvi_Task_4;

import java.util.Scanner;

public class Task4_9 {

	public static void main(String[] args) {
	
		Scanner Num = new Scanner(System.in);
		
		System.out.println("Enter the person's age: ");
		
		int age = Num.nextInt();
		
		if(age>=60) {
			System.out.println("The person is a senior citizen");
		}
		else {
			System.out.println("The person is not a senior citizen");
		}
		
		Num.close();

	}

}
