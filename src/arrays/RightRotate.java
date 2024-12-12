package arrays;

import java.util.Arrays;

public class RightRotate {

	//right rotate an array by d places
	
	public static void right_rotate(int arr[],int d , int n)
	{
		int p=1;
		d=d%n; // important condition if d is very large it will prevent loop running extra 
		while(p<=d)
		{
		  int last_element = arr[n-1];
		  for(int i=arr.length-1;i>0;--i)
		  {
			  arr[i]=arr[i-1];
		  }
		  arr[0]=last_element;
		  ++p;
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public static void main(String[] args) {
		
    int d = 4 ; //means rotate it to right by 4 places change number accordingly
	
    int arr[] = new int [] {10,20,30,40,50,60,70};
    
    right_rotate(arr,d,arr.length);
    
    
		
		
	}
	
}
