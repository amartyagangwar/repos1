package eclipsepro1;

import java.util.Scanner;

public class awesome {

	public static void main(String[] args) {
		int num1,num2,num3,answer1,answer2,answer3,answer4;
		Scanner myScanner = new Scanner(System.in);
		System.out.println("This program will allow you to add,subtract,multiply and divide.");
		System.out.print("please enter your first number:");
		num1 = myScanner.nextInt();
		System.out.print("please enter your second number:");
		num2 = myScanner.nextInt();
		System.out.print("please enter your third number:");
		num3 = myScanner.nextInt();
		answer1 = num1 + num2 + num3;
		System.out.println("The sum of the numbers is: " + answer1  );
		answer2 = num1 - num2 - num3;
		System.out.println("The difference of the numbers is:" + answer2 );
		answer3 = num1 * num2 * num3;
		System.out.println("The product of the numbers is:" + answer3);
		answer4 = num1 / num2 / num3;
		System.out.println("The quotient of the numbers is:" + answer4);
		
				
				
				
				
		

	}

}
