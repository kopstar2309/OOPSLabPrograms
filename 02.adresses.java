/*
 Design an Address class with member variables Street num, city, state and country and appropriate constructor. Design a Student class
 with constructor (Student (String USN, String Name, and Address addr)), College class with constructor (College (String Name, Address 
 addr)) and Employee class with constructor (Employee (String EmpID, String Name, Address addr)). Write a Java program to create ‘n’ 
 Student objects, College Objects and Employee objects and print the student, college and employee addresses respectively and 
 demonstrate passing of object as a parameter to the constructor.
*/

package Address;

import java.util.Scanner;

class address {
    public String city, state, country;
    public int st_num;
    address(){}
    address(int st_num, String city, String state, String country){
        this.st_num = st_num;
        this.city = city;
        this.state = state;
        this.country = country;
    }
    public void display(address addr){
        System.out.print(" and lives at "+addr.st_num+", "+addr.city+", "+addr.state+
                ", "+addr.country+".");
    }
}

class student extends address{
    address addr;
    String usn, name;
    student(String name, String usn, address addr){
        this.addr = addr;
        this.usn = usn;
        this.name = name;
    }
    public void display(){
        System.out.println(name+" has USN "+usn+" and lives at "+addr.st_num+", "+addr.city+", "
                +addr.state+", "+addr.country+".");
    }
}

class college extends address{
    String name;
    address addr;
    college(String name, address addr){
        this.name = name;
        this.addr = addr;
    }
    public void display(){
        System.out.println(name+" College is at "+addr.st_num+", "+addr.city+", "+addr.state
                +", "+addr.country+".");
    }
}

class employee extends address{
    String emp_id, name;
    address addr;
    employee(String name, String emp_id, address addr){
        this.name = name;
        this.emp_id = emp_id;
        this.addr = addr;
    }
    public void display(){
        System.out.println(name+" has id "+emp_id+" and lives at "+addr.st_num+", "+addr.city+", "
                +addr.state+", "+addr.country+".");
    }
}
public class Addr{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
    	System.out.println("Enter the number of entry::");
        int n = in.nextInt();
        student[] students = new student[n];
        college[] colleges = new college[n];
        employee[] employees = new employee[n];
        in.nextLine();

        for(int i=0; i<n; i++){
        	System.out.println("Enter the USN, Name, Street no., City, State and Country of the student");
            String usn = in.nextLine();
            String name = in.nextLine();
            int st_num = in.nextInt();
            in.nextLine();
            String city = in.nextLine();
            String state = in.nextLine();
            String country = in.nextLine();
            address stu_addr = new address(st_num, city, state, country);
            students[i] = new student(name, usn, stu_addr);

        	System.out.println("Enter the Name, Street no., City, State and Country of the College");
            name = in.nextLine();
            st_num = in.nextInt();
            in.nextLine();
            city = in.nextLine();
            state = in.nextLine();
            country = in.nextLine();
            address college_addr = new address(st_num, city, state, country);
            colleges[i] = new college(name, college_addr);

        	System.out.println("Enter the Name, Emp_ID, Street no., City, State and Country of the Employee");
            name = in.nextLine();
            String emp_id = in.nextLine();
            st_num = in.nextInt();
            in.nextLine();
            city = in.nextLine();
            state = in.nextLine();
            country = in.nextLine();
            address emp_addr = new address(st_num, city, state, country);
            employees[i] = new employee(name, emp_id, emp_addr);
        }
        
        for(int i = 0; i<n; i++) {
	        students[i].display();
	        System.out.println();
	        colleges[i].display();
	        System.out.println();
	        employees[i].display();
	        System.out.println();System.out.println();
        }
    }
}
