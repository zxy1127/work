package etest21;

import java.util.Scanner;


public class etest21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Loan Amount:");
        double loanAmount = input.nextDouble();
        System.out.print("Number of Years:");
        int years = input.nextInt();
        System.out.println("Interest Rate\t\tMonthly Payment\t\tTotal Payment");
        for(int i = 0; i < 25; i++){
            double rate = (0.125*i+5)/1200;
            double monthMoney = loanAmount*rate/(1-1/Math.pow(1+rate, years*12));
            System.out.printf("%-4.3f%%\t\t\t\t%-5.2f\t\t\t\t%-7.2f\n",0.125*i+5,monthMoney,monthMoney*12*years);
        }

    }
}

