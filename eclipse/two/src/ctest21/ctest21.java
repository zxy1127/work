package ctest21;

import java.util.Scanner;

public class ctest21 {
    public static void main(String[] args) {
        String[] week = new String[]{"Saturday" ,"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday"};
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year:");
        int year = input.nextInt();

        System.out.print("Enter month:");
        int m = input.nextInt();

        System.out.print("Enter the day of the month:");
        int q = input.nextInt();

        if (m == 1 || m ==2) {
            m = m + 12;
            year = year - 1;
            int k = year % 100;
            int j = year / 100;
            int h = (q + 26*(m+1)/10 + k + k/4 + j/4 + 5*j)%7;
            System.out.println("Day of the week is " + week[h]);
        }else{
            int k = year % 100;
            int j = year / 100;
            int h = (q + 26*(m+1)/10 + k + k/4 + j/4 + 5*j)%7;
            System.out.println("Day of the week is " + week[h]);
        }
    }
}

