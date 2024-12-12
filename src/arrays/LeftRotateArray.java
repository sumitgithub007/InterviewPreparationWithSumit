package arrays;

import java.util.Arrays;

public class LeftRotateArray {

		//Given array rotate it to left by d places.
	
	public static void rotate_left(int arr[],int d , int n)
	{
		int p=1 ;
		d=d%n; // important condition if d is very large it will prevent loop running extra 
		while(p<=d)
		{
			int first_element = arr[0];
			for(int i=0;i<arr.length-1;++i)
			{
				arr[i]=arr[i+1];
			}
			++p;
			arr[n-1] = first_element;
			
			
		}
		System.out.println(Arrays.toString(arr));
		
	}
	
	
	public static void main(String[] args) {
		
		int d = 7 ; //means rotate it to left by 4 places change number accordingly
		int arr[] = new int[] {10,20,30,40,50,60,70};
		rotate_left(arr,d,arr.length);
		
		//debug program if you not getting logic. All the best
		
	}
	
}
