package ctest15;

import java.util.Scanner;

public class ctest15 {
    public static void main(String[] args) {
        int lottery = (int) (Math.random() * 1000);    //随机生成的获奖号码
        System.out.println("lottery is: " + lottery);
        int l1 = lottery / 100;
        int l2 = lottery % 100 / 10;
        int l3 = lottery % 10;

        Scanner input = new Scanner(System.in);
        int guess = input.nextInt();
        int g1 = guess / 100;
        int g2 = guess % 100 / 10;
        int g3 = guess % 10;

        if (guess == lottery) {
            System.out.println("奖励10000美金");
        } else if (g1 == l1 && g2 == l3 && g3 == l2) {
            System.out.println("奖励3000美金");
        } else if (g1 == l2 && g2 == l1 && g3 == l3) {
            System.out.println("奖励3000美金");
        } else if (g1 == l2 && g2 == l3 && g3 == l1) {
            System.out.println("奖励3000美金");
        } else if (g1 == l3 && g2 == l1 && g3 == l2) {
            System.out.println("奖励3000美金");
        } else if (g1 == l3 && g2 == l2 && g3 == l1) {
            System.out.println("奖励3000美金");
        } else if (g1 == l1 || g1 == l2 || g1 == l3) {
            System.out.println("奖励1000美金");
        }else if (g2 == l1 || g2 == l2 || g2 == l3){
            System.out.println("奖励1000美金");
        }else if (g3 == l1 || g3 == l2 || g3 == l3){
            System.out.println("奖励1000美金");
        }
    }
}

