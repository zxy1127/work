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

        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {   //判断year是否为闰年
            Days[1] = 29;
        }

        //循环打印12个月的日历
        for (int i = 0; i < 12; i++) {
            //先打印日历的表头
            System.out.println("              " + month[i] + " " + year);
            System.out.println("---------------------------------------");
            System.out.println("Sun   Mon   Tue   Wed   Thu   Fri   Sat");

            //先判断第一天是不是7代表周日，若是我们将day变为0
            if (day == 7) {
                day = 0;
            }

            //根据第一天是周几我们打印空格数来控制格式话
            for (int j = 0; j < day; j++) {
                System.out.print("      ");
            }

            //输出每个月。
            for (int k = 1; k <= Days[i]; k++) {
                if ((k + day) % 7 == 0) {
                    System.out.printf("%3d\n", k);
                } else {
                    System.out.printf("%3d   ", k);
                }
            }

            //每打印一个月进行一次换行
            System.out.println();

            //求出下个月第一天是周几
            day = (day + Days[i]) % 7;
        }

    }
}

