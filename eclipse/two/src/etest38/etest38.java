package etest38;

import java.util.Scanner;

public class etest38 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("������һ��ʮ��������");
        int number = input.nextInt();
        int[] array = new int[32];
        int i = 0;
        while (number != 0) {
            array[i] = (number % 8);
            number /= 8;
            i++;
        }
        System.out.println("ת��Ϊ�˽��Ƶ���Ϊ��");
        for (i -= 1; i >= 0; i--) {
            System.out.print(array[i]);
        }
    }
}

