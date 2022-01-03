package ctest9;

import java.util.Scanner;

public class ctest9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first 9 digits of an ISBN as integer:");
        int number1 = input.nextInt();
        int number = number1;
        int d9 = number % 10;
        number/=10;
        int d8 = number % 10;
        number/=10;
        int d7 = number % 10;
        number/=10;
        int d6 = number % 10;
        number/=10;
        int d5 = number % 10;
        number/=10;
        int d4 = number % 10;
        number/=10;
        int d3 = number % 10;
        number/=10;
        int d2 = number % 10;
        number/=10;
        int d1 = number % 10;
        int d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9)%11;
        if(d10 == 10){
            if(d1 == 0){
                System.out.print("0" +number1 + "X");
            }else{
                System.out.println(number1 + "X");
            }

        }else{
            if (d1 ==0){
                System.out.println("0" + number1 + "" + d10);
            }else{
                System.out.println(number + "" + d10);
            }

        }
    }
}


