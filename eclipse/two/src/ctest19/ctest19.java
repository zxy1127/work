package ctest19;

import java.util.Scanner;

public class ctest19 {
    public static void main(String[] args) {
        System.out.println("�����������ε����߳�");
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("the circumference is:" + (a + b + c));
        }else {
            System.out.println("invalid input");
        }
    }
}

