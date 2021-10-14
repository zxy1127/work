package ComputeChange;

import java.util.Scanner;

public class ComputeChange {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print(
		"Enter an amount in double, for example 11.56: "); 
		double amount = input.nextDouble();
		int remainingAmount = (int) (amount * 100);
		int number0fOneDollars = remainingAmount/100; 
		remainingAmount = remainingAmount % 100 ;
		int numberOfQuarters=remainingAmount / 25;
		remainingAmount=remainingAmount % 25;
		int numberOfDimes=remainingAmount/10;
		remainingAmount=remainingAmount % 10;
		int number0fNicke1s=remainingAmount /5;
		remainingAmount=remainingAmount % 5;
		int number0fPennies=remainingAmount;
		System.out.println("Your amount " + amount+"consists of");
		System.out.println(" " + number0fOneDollars + " dollars");
		System.out.println(" "+numberOfQuarters + " quarters ") ;
		System.out.println(" "+numberOfDimes + " dimes") ;
		System.out.println(" " + number0fNicke1s+ " nickels") ; 
		System.out.println("" + number0fPennies + " pennies");

	}

}
