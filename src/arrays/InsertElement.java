package arrays;

import java.util.Arrays;

public class InsertElement {

	//insert an element in array
	public static void main(String[] args) {
	
		int arr[] =new int[] {10,20,30,40,50,60,70};
		int element =98;
		int position =2 ;
		
		if(position>arr.length || position<0)
		{
			System.out.println("Invalid position");
		}
		
		else {
			
			for(int i=arr.length-1;i>position-1;--i)
			{
				arr[i]=arr[i-1];
			}
			arr[position-1]=element;
			System.out.println(Arrays.toString(arr));
		}
	
		
		
		
		
		
		
	}
	
}
