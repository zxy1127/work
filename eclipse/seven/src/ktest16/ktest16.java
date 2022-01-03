package ktest16;


import java.util.ArrayList;
import java.util.Scanner;

public class ktest16 {
    public static void main(String[] args) {
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("What is " + number1 + " + " + number2 + "? ");
        int answer = input.nextInt();
        list.add(answer);
        while (number1 + number2 != answer) {
            System.out.print("Wrong answer. Try again. What is " + number1 + " + " + number2 + "? ");
            answer = input.nextInt();
            list.add(answer);
            if (list.indexOf(answer) != -1) {
                System.out.println("You already entered " + answer);
            }
        }
        System.out.println("You got it!");
    }
}