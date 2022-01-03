package itest10;


import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    public double getRoot1() {
        if (getDiscriminant() >= 0)
            return (-1 * b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        else
            return 0;
    }

    public double getRoot2() {
        if (getDiscriminant() >= 0)
            return (-1 * b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        else
            return 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a b c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        
        if (quadraticEquation.getDiscriminant() < 0)
            System.out.println("The equation has no roots.");
        else if (quadraticEquation.getDiscriminant() == 0)
            System.out.println("One root " + quadraticEquation.getRoot1());
        else
            System.out.println("Two roots " + quadraticEquation.getRoot1() + " " + quadraticEquation.getRoot2());
    }


}
