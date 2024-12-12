package arrays;

import java.util.Arrays;

public class Sort_Array_Order_N_Time {

	//Given an array of 0,1,2 your task is to sort array in O(n) Time complexity
	//Like most of times we use two for loops one inside other to sort array
	//This question was asked in Adobe
	
	public static void main(String[] args) {
	
		int arr[]= {0,1,1,0,0,2,2,1,0,1,0};
	
		int zeroes_count =0;
		int ones_count = 0; 
		int twos_count  = 0;
	
		for(int i=0;i<arr.length;++i)
		{                                    //Lets count 0,1,2
			if(arr[i]==0)
				++zeroes_count;
			
			if(arr[i]==1)
				++ones_count;
			
			if(arr[i]==2)
				++twos_count;
		}
		
		//now filling the array
		for(int i=0;i<arr.length;++i)
		{
			if(zeroes_count>0)
			{
				arr[i]=0;
				--zeroes_count;
				
			}
			
			else if(ones_count>0)
			{
				arr[i]=1;
				--ones_count;
			}
			
			else if(twos_count>0)
			{
				arr[i]=2;
				--twos_count;
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
		//Here first for loop will run O(n) time 
		//Second for loop will run O(n) time
		//Time complexity =	O(n) + O(n) = O(n) // n = length of array
		
		
		
		
	}
	
}
