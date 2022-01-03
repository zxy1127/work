package ctest28;

import java.util.Scanner;

public class ctest28 {
    public static void main(String[] args) {
        System.out.println("Enter r1's center x-.y-coordinates, width, and height:");
        System.out.println("Enter r2's center x-.y-coordinates, width, and height:");
        Scanner input = new Scanner(System.in);
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double width1 = input.nextDouble();
        double height1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double width2 = input.nextDouble();
        double height2 = input.nextDouble();
        double distancex = Math.abs(x1 - x2);
        double distancey = Math.abs(y1 - y2);
    }
}

