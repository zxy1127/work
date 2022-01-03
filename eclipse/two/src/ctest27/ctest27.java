package ctest27;

import java.util.Scanner;

public class ctest27 {
    public static void main(String[] args) {
        System.out.println("Enter a point's x- and y-coordinates:");
        Scanner input = new Scanner(System.in);
        double x = input.nextDouble();
        double y = input.nextDouble();
        if (x > 200 || x < 0 || y < 0 || y > 100){
            System.out.println("The point is not in the triangle");
        }else if(y <= -0.5*x + 100){
            System.out.println("The point is in the triangle");
        }else{
            System.out.println("The point is not in the triangle");
        }
    }
}
