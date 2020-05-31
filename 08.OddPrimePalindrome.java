/*Write the following methods that return a lambda expression performing a specified action:
(i) PerformOperation isOdd(): The lambda expression must return true if a number is odd
or false if it is even.
(ii) PerformOperation isPrime(): The lambda expression must return true if a number is
prime or false if it is composite.
(iii) PerformOperation isPalindrome(): The lambda expression must return true if a
number is a palindrome or false if it is not.
Write a JAVA program using above lambda expressions to take 2 integers as input where the first integer specifies the 
condition to check for (case 1 for Odd/Even, case 2 for
Prime/Composite, or case 3 for Palindrome). The second integer denotes the number to be
checked.*/

import java.util.Scanner;

@FunctionalInterface
interface PerformOperation{
    boolean operate(int number);
}

public class Main {
    public static void main(String args[]) {
        int choice,givenNumber;
        Scanner scanner = new Scanner(System.in);
        PerformOperation performOperation;
        while (true){
            System.out.print("Press \n 1 for isOdd \n 2 for isPrime \n 3 for isPalindrome \n 4 for Exit \n :");
            choice = scanner.nextInt();
            System.out.print("Enter the number:");
            givenNumber = scanner.nextInt();
            switch(choice) {
                case 1:
                    performOperation = number -> number%2==1;
                    if(performOperation.operate(givenNumber))
                        System.out.println("The number " + givenNumber + " is Odd.");
                    else
                        System.out.println("The number " + givenNumber + " is Even.");
                    break;
                case 2:
                    performOperation = number -> {
                        int s = (int) Math.sqrt(number);

                        for(int i=2;i<=s;i++)
                            if(number%i == 0)
                                return false;
                        return true;
                    };
                    if(givenNumber == 1) {
                        System.out.println("The number " + givenNumber + " is Neither Prime nor Composite.");
                        break;
                    }
                    if(performOperation.operate(givenNumber))
                        System.out.println("The number " + givenNumber + " is Prime.");
                    else
                        System.out.println("The number " + givenNumber + " is Composite.");
                    break;
                case 3:
                    performOperation = number -> {
                        String num = Integer.toString(number);
                        for (int i=0;i<num.length()/2;i++)
                            if(num.charAt(i)!=num.charAt(num.length()-i-1))
                                return false;
                        return true;
                    };
                    if(performOperation.operate(givenNumber))
                        System.out.println("The number " + givenNumber + " is Palindrome.");
                    else
                        System.out.println("The number " + givenNumber + " is not Palindrome.");
                    break;
                default:
                    System.exit(0);

            }
        }
    }
}
