package ctest4;

import java.util.Random;
public class ctest4 {
    public static void main(String[] args) {
        Random r = new Random();
        int number = r.nextInt(12) + 1;
        System.out.println(number);
        switch (number){
            case 1:
                System.out.println("1��");
                break;
            case 2:
                System.out.println("2��");
                break;
            case 3:
                System.out.println("3��");
                break;
            case 4:
                System.out.println("4��");
                break;
            case 5:
                System.out.println("5��");
                break;
            case 6:
                System.out.println("6��");
                break;
            case 7:
                System.out.println("7��");
                break;
            case 8:
                System.out.println("8��");
                break;
            case 9:
                System.out.println("9��");
                break;
            case 10:
                System.out.println("10��");
                break;
            case 11:
                System.out.println("11��");
                break;
            case 12:
                System.out.println("12��");
                break;
            default:
                System.out.println("��֪����ʲô��");
        }
    }
}

