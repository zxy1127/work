package etest37;

import java.util.Scanner;

public class etest37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入一个十进制的数字：");
        int number = input.nextInt();
        int[] array = new int[32];
        int i = 0;
        while (number != 0) {
            array[i] = number % 2;
            number /= 2;
            i++;
        }
        for (i -= 1; i >= 0; i--) {
            System.out.print(array[i]);
        }
    }
}

