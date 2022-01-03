package ctest23;

import java.util.Scanner;

public class ctest23 {
    public static void main(String[] args) {
        System.out.println("Enter a point with two coordinates:");
        Scanner input = new Scanner(System.in);
        double x = input.nextDouble();
        double y = input.nextDouble();
        double distancex = Math.abs(x);
        double distancey = Math.abs(y);
        if (x <= 5 && y <= 2.5) {
            System.out.println("Point (" + x + "," + y + ") is in the rectangle");
        } else {
            System.out.println("Point (" + x + "," + y + ") is not in the rectangle");
        }
    }
}

