package etest45;

import java.util.Scanner;


public class etest45 {
    public static void main(String[] args) {
        System.out.print("Enter 10 numbers:");
        Scanner input = new Scanner(System.in);
        int count = 0;
        double total = 0.0;//记录10个数字的和
        double totalOfSquare = 0.0;//记录10个数字的平方和
        double squareOfTotal = 0.0;//记录10个数字和的平方
        while (count < 10) {
            double value = input.nextDouble();
            total += value;
            totalOfSquare += Math.pow(value, 2);
            count++;
        }
        squareOfTotal = Math.pow(total, 2);
        double mean = total / 10;
        double standardDeviation = Math.sqrt((totalOfSquare - (squareOfTotal / 10)) / 9);
        System.out.printf("The mean is %.2f\n", mean);
        System.out.printf("The standard deviation is %.5f\n", standardDeviation);
    }
}

