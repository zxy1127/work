package etest17;

import java.util.Scanner;

public class etest17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("������һ��������");
        int number = input.nextInt();
        for (int i = 0; i < number; i++)    //һ��һ�е����
        {
            for (int j = 0; j < number - i - 1; j++)    //����ո�
                System.out.printf("    ");
            for (int j = number - i - 1;j < number; j++)    //���1������ߵ�����
                System.out.printf("%4d",number - j );
            for (int j = number; j < number + i; j++)   //���1�����������ұߵ�����
                System.out.printf("%4d",j - number + 2);
            for (int j = number + i; j < 2 * number -1; j++)
                System.out.print("    ");
            System.out.println();
        }

    }
}

