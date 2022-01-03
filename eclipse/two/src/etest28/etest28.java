package etest28;

import java.util.Scanner;

public class etest28 {
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

        for (int i = 0; i < 12; i++) {
            System.out.println(month[i] + " 1, " + year + " is " + week[day - 1]);
            day = (day + Days[i]) % 7;
            if (day == 0) {  //这天正好是周日，令day=7
                day = 7;
            }
        }


    }
}

