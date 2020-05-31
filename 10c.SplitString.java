/*Write a program that splits a string into a number of substrings with the help of string split() method 
and then prints the substrings.*/

package stringHandling

import java.util.*;

public class substring {
	public static void main(String[] args) {
		System.out.println("Enter the sentence: ");

		Scanner in = new Scanner(System.in);

		String inp = in.nextLine();
		
		System.out.println("Enter the character/s by which the sentence must be divided to substrings: ");

		String ch = in.next();

		String[] subs = inp.split(ch);

		System.out.println("The resulting substrings are: ");

		for (String a : subs)
			System.out.print(a + " ");
	}
}
