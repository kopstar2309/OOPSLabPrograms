/*
Create a Java class called Complex with the following details as member variables within it. 
(i) Real  (ii) Imaginary
Develop a Java program to perform addition and subtraction of two complex numbers by using the method add() and subtract( ) 
respectively, by passing object as parameter and display result using method display(). Initialize the real and imaginary values 
of the complex number using parameterized constructor. Also demonstrate overloading constructors and methods.
*/

package com.company;

import java.util.Scanner;

class Complex {
    private int real,imag;

    Complex(){

    }

    Complex(int real,int imag){
        this.real=real;
        this.imag=imag;
    }

    void add_complex(Complex c1,Complex c2){
        this.real=c1.real+c2.real;
        this.imag=c1.imag+c2.imag;
    }

    void display(){
        if(this.imag >= 0)
            System.out.println(this.real + " + " +this.imag + "i");
        else
            System.out.println(this.real + " " +this.imag + "i");
    }

    void sub_complex(Complex c1,Complex c2){
        this.real=c1.real-c2.real;
        this.imag=c1.imag-c2.imag;
    }
}


public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the real and imaginary parts of first and second number respectively:");

        //int r1 = scanner.nextInt(),co1=scanner.nextInt(),r2=scanner.nextInt(),co2=scanner.nextInt();

        Complex c1=new Complex(scanner.nextInt(),scanner.nextInt());
        Complex c2=new Complex(scanner.nextInt(),scanner.nextInt());
        Complex c3 = new Complex();
        Complex c4 = new Complex();


        System.out.println("The Given numbers are:");
        c1.display();
        c2.display();


        c3.add_complex(c1,c2);
        System.out.print("The Sum is as follows:");
        c3.display();

        c4.sub_complex(c1,c2);
        System.out.print("The Difference is as follows:");
        c4.display();

    }
}
