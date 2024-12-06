package arrays;

import java.util.Arrays;

public class MoveZeroesLeft {

	// Move zeroes to left and ones to right side of array

	public static void main(String[] args) {

		int arr[] = new int[] { 1, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0 };

		int j = 0;
		int temp;
		for (int i = 0; i < arr.length; ++i) {
			if (arr[i] == 0) {
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
