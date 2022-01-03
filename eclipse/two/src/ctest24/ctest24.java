package ctest24;

import java.util.Scanner;

public class ctest24 {
    public static void main(String[] args) {
        String[] color = new String[]{"Clubs","Diamonds","Hearts","Spades"};
        String[] number = new String[]{"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
        Scanner input = new Scanner(System.in);
        System.out.println("请输入你想抽的牌的号码1-52：");
        for(int i = 0; i <52; i ++){
            int pick = input.nextInt();
            System.out.println("The card you picked is " + number[(pick-1)%13] + " of " + color[(pick -1)/13]);
        }
    }
}

