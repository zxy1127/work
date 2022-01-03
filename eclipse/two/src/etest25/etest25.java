package etest25;

import java.util.Scanner;

public class etest25 {
    public static void main(String[] args) {
        double valueOfPi = 0.0;
        int x = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number:");
        int number = input.nextInt();
        for (int i = 1; i <= number; i++) {
            valueOfPi += (x * 1.0) / (2 * i - 1);
            x *= -1;
        }
        valueOfPi = 4 * valueOfPi;
        System.out.println(valueOfPi);

    }
}

