package etest26;

import java.util.Scanner;

public class etest26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("ÇëÊäÈëÒ»¸önumber£º");
        int number = input.nextInt();
        double valueOfE = 1.0;
        double item = 1;
        for (int i = 1; i <= number; i++) {
            item = item * 1.0 / i;
            valueOfE += item;
        }
        System.out.println(valueOfE);
    }
}

