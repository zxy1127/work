package ctest22;

import java.util.Scanner;

public class ctest22 {
    public static void main(String[] args) {
        System.out.println("Enter a point with two coordinates:");
        Scanner input = new Scanner(System.in);
        double x = input.nextDouble();
        double y = input.nextDouble();
        double distance = Math.pow(x * x + y * y, 0.5);
        if(distance <= 10){
            System.out.println("Point (" + x + "," + y + ") is in the circle" );
        }else{
            System.out.println("Point (" + x + "," + y + ") is not in the circle" );
        }
    }
}

