package arrays;

import java.util.Arrays;

public class MovePositiveLeft {

	// Move Positive numbers to left and positive to right order doesn't matter

	public static void main(String[] args) {

		int arr[] = new int[] { 1, 2, -3, 4, -5, 6, -7, 8, -9, 10 };

		int j = 0;
		int temp;
		for (int i = 0; i < arr.length; ++i) {
			if (arr[i] > 0) {
				if (i != j) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				++j;
			}

		}

		System.out.println(Arrays.toString(arr));

	}

}
