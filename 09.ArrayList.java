/*
Collections
Write a Java program to create a new array list, add some colors (string) and perform the following operations:
(i)	  Add  elements of List to ArrayList			(list.add())
(ii)  Copy ArrayList to Array						((String[])list.toArray())
(iii) Reverse ArrayList content						(for loop)
(iv)  Get Sub list from an ArrayList.				(make a new list, with parameter as list.subList(start, end)
(v)	  To sort a given ArrayList						(Collections.sort(list))
(vi)  Clone an ArrayList to another ArrayList		((ArrayList<String>)(list.clone()))
*/

package Collections;

import java.util.*;

class Arrays {
	ArrayList<String> list = new ArrayList<> ();
	ArrayList<String> rev_list = new ArrayList<> ();

	public void add_items(String color) {
		list.add(color);
	}

	public void display_items() {
		System.out.println("The items in the list are: " + list);
	}

	public void toarray() {
		String[] arr = new String[list.size()];
		list.toArray(arr);
		System.out.println("The array contents are: ");

		for (String str : arr)
			System.out.println(str);
	}

	public void revlist() {
		ArrayList<String> rev = new ArrayList<> ();

		for (int i = list.size() - 1; i >= 0; i--)
			rev.add(list.get(i));

		for (int i = 0; i < rev.size(); i++)
			System.out.print(rev.get(i) + " ");

		System.out.print("\n");
	}

	public void getsubarr(int start, int end) {
		ArrayList<String> newlist = new ArrayList<String> (list.subList(start, end));

		System.out.println("Segment of the list from index " + start + " till index " + end + " is: " + newlist);
	}

	public void sortarray() {
		Collections.sort(list);
		System.out.println("The sorted array is: " + list);
	}

	@SuppressWarnings("unchecked")
	public void clonearray() {
		ArrayList<String> clone_list = (ArrayList<String>)list.clone();
		System.out.println("The cloned list is: " + clone_list);
	}
}

public class main {
	public static void main(String args[]) {
		int choice, start, end;
		String color;
		Scanner in = new Scanner(System.in);
		System.out.println("1. Add items to the list\t 2. Display items of the list\t 3. Convert list to array\t\n"
				+ "4. Reverse List\t 5. Print SubArray\t 6. Sort the List\t 7. Clone List");
		Arrays obj = new Arrays();

		while (true) {
			System.out.println("Enter the choice: ");
			choice = in.nextInt();

			switch (choice) {
				case 1:
					System.out.println("Enter the Color: ");
					color = in.next();
					obj.add_items(color);
					break;
				case 2:
					obj.display_items();
					break;
				case 3:
					obj.toarray();
					break;
				case 4:
					obj.revlist();
					break;
				case 5:
					System.out.println("Enter the start and end indices (0 based): ");
					start = in.nextInt();
					end = in.nextInt();
					obj.getsubarr(start, end);
					break;
				case 6:
					obj.sortarray();
					break;
				case 7:
					obj.clonearray();
					break;
				default:
					System.exit(0);
			}
		}
	}
}
