/*
 Design an Address class with member variables Street num, city, state and country and appropriate constructor. Design a Student class
 with constructor (Student (String USN, String Name, and Address addr)), College class with constructor (College (String Name, Address 
 addr)) and Employee class with constructor (Employee (String EmpID, String Name, Address addr)). Write a Java program to create ‘n’ 
 Student objects, College Objects and Employee objects and print the student, college and employee addresses respectively and 
 demonstrate passing of object as a parameter to the constructor.
*/

import java.util.Scanner;

import static java.lang.Integer.parseInt;

class Address {
    public int streetNum;
    public String city,state,country;

    Address() {

    }

    Address(Address address){
        this.streetNum = address.streetNum;
        this.city = address.city;
        this.state = address.state;
        this.country = address.country;
    }

}

class Student {
    public String USN,name;
    Address address ;

    Student(String USN,String name,Address address){
        this.USN = USN;
        this.name = name;
        this.address = new Address(address);
    }
}

class College {
    public String name;
    Address address;

    College(String name,Address address) {
        this.name = name;
        this.address = new Address(address);
    }
}

class Employee {
    public String empId,name;
    Address address;

    Employee(String empId,String name,Address address){
        this.empId = empId;
        this.name = name;
        this.address = new Address(address);
    }
}


public class StudentCollegeEmployee {

    public static void main(String[] a){


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n=parseInt(scanner.nextLine());

        Student  students[]  = new Student[n];
        College[]  colleges  = new College[n];
        Employee[] employees = new Employee[n];

        StudentCollegeEmployee studentCollegeEmployee = new StudentCollegeEmployee();

        String name,USN,empId;
        Address address = new Address();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the USN and Name of Student-" + (i+1) + " with his/her address in the format: street-num city state country:");
            USN = scanner.nextLine();
            name = scanner.nextLine();
            studentCollegeEmployee.getAddr(address);

            students[i] = new Student(name,USN,address);

            System.out.print("Enter Name of College-" + (i+1) + " with address in the format: street-num city state country:");
            name = scanner.nextLine();
            studentCollegeEmployee.getAddr(address);

            colleges[i] = new College(name,address);

            System.out.print("Enter Employee ID and Name of Employee-" + (i+1) + " with his/her address in the format: street-num city state country:");

            empId = scanner.nextLine();
            name = scanner.nextLine();
            studentCollegeEmployee.getAddr(address);

            employees[i] = new Employee(empId,name,address);

        }



        System.out.println("Student addresses are:");

        for (int i = 0; i < n ; i++) {
            System.out.print("Student-" + (i+1) +":");
            studentCollegeEmployee.printAddr(students[i].address);
        }

        System.out.println("College addresses are:");

        for (int i = 0; i < n ; i++) {
            System.out.print("College-" + (i+1) +":");
            studentCollegeEmployee.printAddr(colleges[i].address);
        }

        System.out.println("Employee addresses are:");

        for (int i = 0; i < n ; i++) {
            System.out.print("Employee-" + (i+1) +":");
            studentCollegeEmployee.printAddr(employees[i].address);
        }
    }

    public void printAddr(Address address){
        System.out.println(address.streetNum + ", " + address.city + ", " + address.state + ", " + address.country+ ".");
    }

    public void getAddr (Address address){
        Scanner scanner = new Scanner(System.in);
        address.streetNum = parseInt(scanner.nextLine());
        address.city = scanner.nextLine();
        address.state = scanner.nextLine();
        address.country = scanner.nextLine();
    }
}
