package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		// 1. make an array of 5 Strings
		String[] a = { "qh", "wk", "h", "k", "z" };
		int small = 50;
		int large = 0;
		// 2. print the third element in the array
		System.out.println(a[2]);
		// 3. set the third element to a different value
		a[2] = "B";
		// 4. print the third element again
		System.out.println(a[2]);
		// 5. use a for loop to print all the values in the array
		// BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		// 6. make an array of 50 integers
		int[] u = new int[50];
		// 7. use a for loop to make every value of the integer array a random number
		Random numb = new Random();
		for (int i = 0; i < u.length; i++) {

			u[i] = numb.nextInt(50);
			System.out.println(u[i]);

		}
		// 8. without printing the entire array, print only the smallest number in the
		// array
		for (int i = 0; i < u.length; i++) {
			if (u[i] < small) {
				small = u[i];
			}
		}
		//largest numb:
		for (int i = 0; i < u.length; i++) {
			if (u[i] > large) {
				large = u[i];
			}
		}
		System.out.println("smallest = " + small);
		// 9 print the entire array to see if step 8 was correct
		for (int i = 0; i < u.length; i++) {
			System.out.println(u[i]);
		}
		// 10. print the largest number in the array.
		System.out.println("biggest = " + large);
	}
}
