package etest22;

import java.util.Scanner;

public class etest22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Loan Amount:");
        double loanAmount = input.nextDouble();
        System.out.print("Number of Years:");
        int years = input.nextInt();
        System.out.print("Annual Interest Rate:");
        double annualRate = input.nextDouble();
        double monthRate = annualRate / 1200;
        double monthlyPayment = loanAmount * monthRate / (1 - 1 / Math.pow(1 + monthRate, years * 12));
        double totalPayment = monthlyPayment * years * 12;
        System.out.printf("Monthly Payment: %.2f", monthlyPayment);
        System.out.printf("Total Payment: %.2f", totalPayment);
        System.out.println("Payment#\t\tInterest\t\tPrincipal\t\tBalance");
        double balance = loanAmount;
        for (int i = 1; i <= years * 12; i++) {
            double interest = monthRate * balance;
            double principal = monthlyPayment - interest;
            balance = balance - principal;
            System.out.printf("%d\t\t\t%.2f\t\t%.2f\t\t%.2f\n", i, interest, principal, balance);
        }

    }
}

