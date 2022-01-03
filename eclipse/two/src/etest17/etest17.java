package etest17;

import java.util.Scanner;

public class etest17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int number = input.nextInt();
        for (int i = 0; i < number; i++)    //一行一行的输出
        {
            for (int j = 0; j < number - i - 1; j++)    //输出空格
                System.out.printf("    ");
            for (int j = number - i - 1;j < number; j++)    //输出1及其左边的数字
                System.out.printf("%4d",number - j );
            for (int j = number; j < number + i; j++)   //输出1（不含）其右边的数字
                System.out.printf("%4d",j - number + 2);
            for (int j = number + i; j < 2 * number -1; j++)
                System.out.print("    ");
            System.out.println();
        }

    }
}

