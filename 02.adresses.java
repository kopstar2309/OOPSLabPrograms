/*
 Design an Address class with member variables Street num, city, state and country and appropriate constructor. Design a Student class
 with constructor (Student (String USN, String Name, and Address addr)), College class with constructor (College (String Name, Address 
 addr)) and Employee class with constructor (Employee (String EmpID, String Name, Address addr)). Write a Java program to create ‘n’ 
 Student objects, College Objects and Employee objects and print the student, college and employee addresses respectively and 
 demonstrate passing of object as a parameter to the constructor.
*/

import java.util.*;

class address{
      int street_no;
      String city,state,country;
      address(int a,String b,String c,String d){
            street_no=a;
            city=b;
            state=c;
            country=d;
      }
}

class student{
      String usn,name;
      address a;
      student(String x,String b,address c){
            a=c;
            usn=x;
            name=b;
      }
}

class college{
      String name;
      address a;
      college(String x,address y){
            a=y;
            name=x;
      }
}

class employee{
      String emp_id,emp_name;
      address a;
      employee(String x,String y,address z){
            emp_id=x;
            emp_name=y;
            a=z;
      }
}

class prog2{
      public static void main(String[] args){
            Scanner in=new Scanner(System.in);
            System.out.println("Enter the number of students/employees/colleges: ");
            int n=in.nextInt();
            student[] s=new student[n];
            employee[] e=new employee[n];
            college[] c=new college[n];
            System.out.println("Input Student details:");
            for(int i=0;i<n;i++){
                  String name,usn,city,state,country;
                  int street;
                  System.out.println("Enter the student name: ");
                  name=in.next();
                  System.out.println("Enter the USN: ");
                  usn = in.next();
                  System.out.println("Enter the city: ");
                  city = in.next();
                  System.out.println("Enter the street: ");
                  street = in.nextInt();
                  System.out.println("Enter the state: ");
                  state = in.next();
                  System.out.println("Enter the country: ");
                  country = in.next();
                  address a=new address(street,city,state,country);
                  s[i]=new student(usn,name,a);
            }
            System.out.println("Input Employee details: ");
            for (int i = 0; i < n; i++) {
                  String name, id, city, state, country;
                  int street;
                  System.out.println("Enter the employee name: ");
                  name = in.next();
                  System.out.println("Enter the employee ID: ");
                  id = in.next();
                  System.out.println("Enter the city: ");
                  city = in.next();
                  System.out.println("Enter the street: ");
                  street = in.nextInt();
                  System.out.println("Enter the state: ");
                  state = in.next();
                  System.out.println("Enter the country: ");
                  country = in.next();
                  address a = new address(street, city, state, country);
                  e[i] = new employee(id, name, a);
            }
            System.out.println("Input college details: ");
            for (int i = 0; i < n; i++) {
                  String name, city, state, country;
                  int street;
                  System.out.println("Enter the college name: ");
                  name = in.next();
                  System.out.println("Enter the city: ");
                  city = in.next();
                  System.out.println("Enter the street: ");
                  street = in.nextInt();
                  System.out.println("Enter the state: ");
                  state = in.next();
                  System.out.println("Enter the country: ");
                  country = in.next();
                  address a = new address(street, city, state, country);
                  c[i] = new college(name,a);
            }
            System.out.print("\n\n\n");
            System.out.println("Students:");
            for(int i=0;i<n;i++){
                  System.out.println("Name: "+s[i].name);
                  System.out.println("USN: " + s[i].usn);
                  System.out.println("Street: " + s[i].a.street_no);
                  System.out.println("City: " + s[i].a.city);
                  System.out.println("State: " + s[i].a.state);
                  System.out.println("Country: " + s[i].a.country);
            }
            System.out.println("\n\nColleges:");
            for (int i = 0; i < n; i++) {
                  System.out.println("Name: " + c[i].name);
                  System.out.println("Street: " + s[i].a.street_no);
                  System.out.println("City: " + s[i].a.city);
                  System.out.println("State: " + s[i].a.state);
                  System.out.println("Country: " + s[i].a.country);
            }
            System.out.println("\n\nEmployees:");
            for (int i = 0; i < n; i++) {
                  System.out.println("Name: " + e[i].emp_name);
                  System.out.println("ID: " + e[i].emp_id);
                  System.out.println("Street: " + e[i].a.street_no);
                  System.out.println("City: " + e[i].a.city);
                  System.out.println("State: " + e[i].a.state);
                  System.out.println("Country: " + e[i].a.country);
            }
      }
}
