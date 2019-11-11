package com.justin;

import java.util.Arrays;
import java.util.Scanner;
import java.io.IOException;
import java.lang.Math;
import java.io.File;
import java.text.*;
class Point{
    private double xValue = 0.0;
    private double yValue = 0.0;

    public Point(){
        
    }
    public Point(double x, double y){
        xValue = x;
        yValue = y;
    }
    public double getX(){
        return xValue;
    }
    public double getY(){
        return yValue;
    }
}

public final class Triangle
{   
    private double firstSide;
    private double secondSide;
    private double thirdSide;
    private double area = 0.0;
    private String type = "";

    public Triangle(double first, double second, double third){
        this.firstSide = first;
        this.secondSide = second;
        this.thirdSide = third;
    }
    public Triangle(){};
    //create Triangle class with 3 points
    public Triangle( Point p1, Point p2, Point p3){
        // formula  the distance AB between two points in a plane with Cartesian coordinates 
       // A(x1,y1) and B(x2,y2) is given by the following formula:
       // AB=sqrt((x2−x1)^2+(y2−y1)^2)
        firstSide = Math.sqrt(Math.pow(p2.getX() - p1.getY(),2) + Math.pow(p2.getY() -p1.getX(),2));
        secondSide = Math.sqrt(Math.pow(p3.getX() - p2.getY(),2) + Math.pow(p3.getY() -p2.getX(),2));
        thirdSide = Math.sqrt(Math.pow(p3.getX() - p1.getY(),2) + Math.pow(p3.getY() -p1.getX(),2));

    }
    // function to check valid of 3 sode of Triangle
    public boolean checkTriangle(){
        if (firstSide <= 0 || secondSide <= 0 || thirdSide <= 0 || firstSide + secondSide <= thirdSide || 
        firstSide + thirdSide <= secondSide || secondSide + thirdSide <= firstSide)
            return false;
        else
            return true;
    }
    //method1 checkTriangle (Equilateral , Isosceles, Scalene, Right, Invalid)
    public String setTriangleBySide()
    {   
        double[] arr = {this.firstSide, this.secondSide, this.thirdSide};
        Arrays.sort(arr);
        double plus = Math.pow(arr[0], 2) + Math.pow(arr[1], 2);
        if(plus == Math.pow(arr[2], 2))
            this.type = "Right and ";
        if (arr[0] == arr[1] && arr[1] == arr[2])
            return this.type = "Equilateral";
        else if (arr[0] == arr[1] || arr[1] == arr[2])
            return this.type = this.type + "Isosceles";
        else
            return this.type = this.type + "Scalene";
    }
    //method2 get type
    public String getTypeBySide()
    {
        return this.type;
    }

    public double getArea(){
        double s = (firstSide + secondSide + thirdSide) / 2;
        area = Math.sqrt( s * ( s - firstSide) * ( s - secondSide) * (s - thirdSide ));
        return area;

    }

    public void runTriangle(File fi) throws Exception{
       try{
        System.out.println("Program to create Triangle by:");
        System.out.println("Press 1 for using Length of three sides");
        System.out.println("Press 2 for using Three Points");
        System.out.print("");
        Scanner option = new Scanner(fi);
        String str = option.nextLine();
        switch (str) {

            case "1":
                double first = 0 ;
                double second = 0;
                double third = 0;
                double[] sides = {first, second, third};
                System.out.println("Input the length of three sides of Triangle: ");
               // Scanner sc = new Scanner(System.in);
                for(int i =0; i < 3; i++){
                    System.out.print("Enter your length of side " +  (i +1) + ": ");
                  //  if (option.hasNextDouble()){
                        sides[i] = option.nextDouble();
                        if (sides[i] <= 0){
                            System.out.println("Sorry, length must be greater than 0!");
                            return;    
                      //  }
                        }
                    // else{
                    //     System.out.println("Sorry, you must input number!");
                    //     return;
                    // }
                }
                
              //  sc.close();
                first = sides[0];
                second = sides[1];
                third = sides[2];
                
                
                Triangle num1 = new Triangle(first, second, third);
                // if (!num1.checkTriangle()){
                //         System.out.println("Invalid triangle");
                //         return;
                // }
        
                num1.setTriangleBySide();
        
                System.out.println("Triangle type is: " + num1.getTypeBySide()); 
                System.out.println("Triangle Area is: " + num1.getArea()); 
            break;

            case "2":

         
            Point p1 = new Point();
            Point p2 = new Point();
            Point p3 = new Point();
            Point [] arrayOfPoint = { p1 , p2 , p3};
            System.out.println("Input the x and y for three points of Triangle: ");
            
          // Scanner sc2 = new Scanner(System.in);
                double num3 = 0;
                double num2 =0;
                for(int i =0; i < 3; i++){
                    System.out.println("Enter your x and y of point " + (i+1));
                    System.out.print("X: ");
                   // if (option.hasNextDouble())
                        num3 = option.nextDouble();
                    // else{
                    //     System.out.println("Sorry, you must input number!");
                    //     return;
                    // }
                    System.out.print("Y: ");
                 //   if (option.hasNextDouble())
                        num2 = option.nextDouble();
                    // else{
                    //     System.out.println("Sorry, you must input number!");
                    //     return;
                    // }
                    arrayOfPoint[i] = new Point(num3, num2);
                }
           // sc2.close();
            Triangle tri = new Triangle(arrayOfPoint[0], arrayOfPoint[1],  arrayOfPoint[2]);
            
            // if(!tri.checkTriangle())
            // {
            //     System.out.println("Invalid triangle. Points must be diffferent");
            //     return; 
            // };
            
            tri.setTriangleBySide();
            System.out.println("Triangle type is: " + tri.getTypeBySide()); 
            System.out.println("Triangle Area is: " + tri.getArea()); 
            break;
            default:
            System.out.println("Invalid input. Must be #1 or #2");
            break;
        }
        
        
        option.close();
    }
    catch (Exception e){
        System.out.println("File not found");
    }
}
    // Your program begins with a call to main(). 
    // Prints "Hello, World" to the terminal window. 
    public static void main(String args[]) throws Exception 
   
    { 
        try {
        File fi = new File(args[0]);
        Triangle t = new Triangle();
        t.runTriangle(fi);
        }
        catch (Exception e){
            System.out.println("File not found");
        }
    }  
} 

