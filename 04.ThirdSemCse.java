/* Create a class Thirdsem. Put this class into a package called CSE. Define a method Welcomemsg which prints a line 
   Welcome to CSE dept- 3rd sem young budding Engineers”.
   Create a class Csedept. Put this class into a package called RVCE.
   Inherit the class Thirdsem in CSE package to Csedept class in RVCE package and call Welcomemsg method to display 
   welcome message and also verify Public method Overriding, Private method overriding and default method overriding 
   from different packages in java with the same program
*/

// ThirdSem

package CSE;

public class ThirdSem {
//    ThirdSem(){}
    void Welcomemsg0(){
        System.out.println("Welcome to CSE department. Nothing makes an engineer more " +
                "productive than the last minute.");
    }
    private void Welcomemsg1(){
        System.out.println("Welcome to CSE department. Nothing makes an engineer more " +
                "productive than the last minute.");
    }
    protected void Welcomemsg2(){
        System.out.println("Welcome to CSE department. Nothing makes an engineer more " +
                "productive than the last minute.");
    }
    public void Welcomemsg3(){
        System.out.println("Welcome to CSE department. Nothing makes an engineer more " +
                "productive than the last minute.");
    }
}

//EXTENDED

package CSE;

public class extended extends ThirdSem{
    public void print(){
        ThirdSem ob1 = new ThirdSem();
        ob1.Welcomemsg0();
        ob1.Welcomemsg2();
        ob1.Welcomemsg3();
        super.Welcomemsg0();
//        super.Welcomemsg1();
        super.Welcomemsg2();
        super.Welcomemsg3();
    }
}

//CSE_deptt

package RVCE;
import CSE.*;

public class CSE_deptt extends extended{
    public static void main(String args[]){
        ThirdSem ob1 = new ThirdSem();
        extended ob2 = new extended();

        ob2.print();
//        ob1.Welcomemsg0();
//        ob1.Welcomemsg1();
//        ob1.Welcomemsg2();
        ob1.Welcomemsg3();
//        ob2.Welcomemsg0();
//        ob2.Welcomemsg1();
//        ob2.Welcomemsg2();
//        ob2.Welcomemsg3();

    }
}
