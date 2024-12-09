package arrays;

import java.util.Arrays;

public class Rearrange_Array_In_Order {

	//Rearrange an array in order – 
	//1st smallest, 1st largest, 2nd smallest, 2nd largest,
	//..3rd smallest 3rd largest and so on...
	public static void rearrange(int arr[],int n)
	{
		Arrays.sort(arr); 
		int temp []= arr.clone(); //clone array
		
		int small = 0;
		int large = n-1;
		boolean flag=true;
		
		for(int i=0;i<arr.length;++i)
		{
			if(flag)
			{
		        arr[i] = temp[small++];    
			}
			else
			{
				arr[i] = temp[large--];
			}
			flag = !flag;
			}
		
	}		
	public static void main(String[] args) {
		
		
		int arr[] = new int[] { 1, 2, 3, 4, 5, 6 ,7, 8 }; 

		System.out.println("Original Array "); 
		System.out.println(Arrays.toString(arr)); 

		rearrange(arr, arr.length); 

		System.out.println("Modified Array "); 
		System.out.println(Arrays.toString(arr)); 
		
		
		
		
		
		
	}
	
}
