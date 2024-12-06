package arrays;

import java.util.Arrays;

public class MoveEvenLeft {

	public static void main(String[] args) {

		// Move Even Number to Left of array and Odd to Right,order doesn't matter

		int arr[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		int j = 0;
		for (int i = 0; i < arr.length; ++i) {
			if (arr[i] % 2 == 0) // even condition
			{
				if (i != j) { // swapping logic
					int temp;
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
				++j;

			}
		}
		System.out.println(Arrays.toString(arr));
		// The condition if (i != j) in your code is used to ensure that when swapping
		// elements in the array, you don't swap the element with itself.

	}

}
