package etest38;

import java.util.Scanner;

public class etest38 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入一个十进制数：");
        int number = input.nextInt();
        int[] array = new int[32];
        int i = 0;
        while (number != 0) {
            array[i] = (number % 8);
            number /= 8;
            i++;
        }
        System.out.println("转换为八进制的数为：");
        for (i -= 1; i >= 0; i--) {
            System.out.print(array[i]);
        }
    }
}

