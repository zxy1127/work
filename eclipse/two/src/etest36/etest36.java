package etest36;

import java.util.Scanner;

public class etest36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first 9 digits of an ISBN as integer:");
        int number = input.nextInt();
        int number1 = number;
        int dlast = 0;//d10µÄ³õÖµ
        for (int i = 9; i > 0; i--) {
            int d = number % 10;
            dlast += (d * i);
            number /= 10;
        }
        String isbn = "";
        if (dlast % 11 == 10) {
            if (number1 / 100000000 == 0) {
                isbn = "0" + number1 + "X";
            } else {
                isbn = number1 + "X";
            }
        } else {
            if (number1 / 100000000 == 0) {
                isbn = "0" + number1 + dlast%11 + "";
            } else {
                isbn = number1 + dlast%11 + "";
            }

        }
        System.out.println("The ISBN-10 number is " + isbn);
    }
}

