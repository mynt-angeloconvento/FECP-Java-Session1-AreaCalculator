package org.example;

import java.util.Scanner;
public class Main {
    static double calculateCircleArea (double radius){
        return (Math.PI * Math.pow(radius, 2));
    }
    static double calculateTriangleArea (double base, double height){
        return (0.5 * base * height);
    }
    static double calculateRectangleArea (double length, double width){
        return (length * width);
    }


    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("=== Area Calculator ===");
        System.out.println("1. Circle");
        System.out.println("2. Triangle");
        System.out.println("3. Rectangle");
        System.out.print("Choose a shape (1-3): ");
        int shapeNum = myObj.nextInt();

        switch (shapeNum){
            case 1:
                System.out.print("Enter the radius: ");
                double radius = myObj.nextDouble();
                System.out.printf("Area of the circle: %.2f", calculateCircleArea(radius));
                break;
            case 2:
                System.out.print("Enter the base: ");
                double base = myObj.nextDouble();
                System.out.print("Enter the height: ");
                double height = myObj.nextDouble();
                System.out.printf("Area of the triangle: %.2f", calculateTriangleArea(base, height));
                break;
            case 3:
                System.out.print("Enter the length: ");
                double length = myObj.nextDouble();
                System.out.print("Enter the width: ");
                double width = myObj.nextDouble();
                System.out.printf("Area of the rectangle: %.2f", calculateRectangleArea(length, width));
                break;
            default:
                break;
        }

    }
}