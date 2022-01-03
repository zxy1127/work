package ctest29;

import java.util.Scanner;

public class ctest29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter r1's center x-.y-coordinates, and radius:");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double r1 = input.nextDouble();

        System.out.println("Enter r2's center x-.y-coordinates, and radius:");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double r2 = input.nextDouble();

        double distance = Math.pow(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2), 0.5);
        if(distance <= Math.abs(r1 - r2)){
            if(r1 == r2){
                System.out.println("circle2 competely overlaps circle1");
            }else if(r1 > r2){
                System.out.println("circle2 is inside circle1");
            }else{
                System.out.println("circle1 is inside circle2");
            }
        }else if(distance <= r1 + r2){
            System.out.println("circle2 overlaps circle1");
        }else{
            System.out.println("circle2 does not overlap circle1");
        }
    }
}

