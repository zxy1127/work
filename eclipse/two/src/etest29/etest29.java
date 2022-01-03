package etest29;

import java.util.Scanner;

public class etest29 {
    public static void main(String[] args) {
        String[] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        String[] week = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        int[] Days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = input.nextInt();
        System.out.print("Enter the day:  ");
        int day = input.nextInt();

        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {   //�ж�year�Ƿ�Ϊ����
            Days[1] = 29;
        }

        //ѭ����ӡ12���µ�����
        for (int i = 0; i < 12; i++) {
            //�ȴ�ӡ�����ı�ͷ
            System.out.println("              " + month[i] + " " + year);
            System.out.println("---------------------------------------");
            System.out.println("Sun   Mon   Tue   Wed   Thu   Fri   Sat");

            //���жϵ�һ���ǲ���7�������գ��������ǽ�day��Ϊ0
            if (day == 7) {
                day = 0;
            }

            //���ݵ�һ�����ܼ����Ǵ�ӡ�ո��������Ƹ�ʽ��
            for (int j = 0; j < day; j++) {
                System.out.print("      ");
            }

            //���ÿ���¡�
            for (int k = 1; k <= Days[i]; k++) {
                if ((k + day) % 7 == 0) {
                    System.out.printf("%3d\n", k);
                } else {
                    System.out.printf("%3d   ", k);
                }
            }

            //ÿ��ӡһ���½���һ�λ���
            System.out.println();

            //����¸��µ�һ�����ܼ�
            day = (day + Days[i]) % 7;
        }

    }
}

