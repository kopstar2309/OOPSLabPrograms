/*
  Design a base class Circle with member variables (radius and color) of type double, methods (getRadius(), getArea()) 
  and constructors (Circle(radius), Circle(radius, color)). Derive subclass called Cylinder from the superclass Circle 
  with member variable (height) of type double, public methods (getHeight(), getVolume(), getArea()) and its constructors
  (Cylinder(height, radius), Cylinder(height, radius,color)). Create the two instances of cylinder and print similar cylinders 
  if the area, volume and color of cylinders are same. Demonstrate the code reuse and polymorphism properties of Object 
  oriented programming by inheriting the constructors and methods of the base class.
*/

package com.company;

import java.util.Scanner;

class Circle{
    protected double radius;

    protected String color;

    Circle(){
        this.radius=1.0;
        this.color="red";

    }

    Circle(double radius){
        this.radius=radius;
        this.color="red";
    }

    Circle(double radius,String color){
        this.radius=radius;
        this.color=color;
    }

    protected double getRadius(){
        return this.radius;
    }

    protected double getArea(){
        return Math.PI*radius*radius;
    }

    String getColor(){
        return this.color;
    }
}

class Cylinder extends Circle{
    protected double height;

    Cylinder(){
        super();
        this.height=1.0;

    }

    Cylinder(double height,double radius){
        super(radius);
        this.height=height;
    }

    Cylinder(double height,double radius,String color){
        super(radius,color);
        this.height=height;
    }

    protected double getHeight(){
        return this.height;
    }

    double getVolume(){
        return this.height*super.getArea();
    }

    @Override
    protected double getArea(){
        return 2*super.getArea()+2*Math.PI*this.radius*this.height;
    }

    void checkSimilar(Cylinder cylinder){
        if(this.getArea() == cylinder.getArea() && this.getVolume() == cylinder.getVolume() && this.color.equalsIgnoreCase(cylinder.color))
            System.out.println("\nThe two cylinders are similar\n");
        else
            System.out.println("\nThe two cylinders are not similar\n");
    }
}
public class Main {

    public static void main(String[] args) {
	// write your code here
        Cylinder c1,c2;
        String color;
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter the height and radius of first cylinder");
        Double height=scanner.nextDouble(),radius=scanner.nextDouble();
        boolean hasColor;
        System.out.println("\nDo you want to give color? Y/N ");
        hasColor= (scanner.next().equalsIgnoreCase("Y")) ? true : false;
        if (hasColor){
            System.out.print("\nEnter the color:");
            color=scanner.next();
            c1 = new Cylinder(height,radius,color);
        }
        else
            c1 = new Cylinder(height,radius);

        System.out.println("\nEnter the height  and radius of second cylinder");
        height=scanner.nextDouble();
        radius=scanner.nextDouble();

        System.out.println("\nDo you want to give color? Y/N ");
        hasColor= (scanner.next().equalsIgnoreCase("Y")) ? true : false;
        if (hasColor){
            System.out.print("\nEnter the color:");
            color=scanner.next();
            c2 = new Cylinder(height,radius,color);
        }
        else
            c2 = new Cylinder(height,radius);

        System.out.println(c1.getColor());
        System.out.println(c2.getColor());

        c1.checkSimilar(c2);
    }


}
