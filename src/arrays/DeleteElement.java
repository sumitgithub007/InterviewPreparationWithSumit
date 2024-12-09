package arrays;

public class DeleteElement {

	//delete an element in array
	public static void main(String[] args) {
	
		boolean check = false; //to check element deleted or not
		int arr[] =new int[] {10,20,30,40,50,60,70};
		int delete =7;
		for(int i=0;i<arr.length;++i)
	 {
		 if(delete==arr[i])
		 {
			 for(int j=i;j<arr.length-1;++j)
			 {
				 arr[j]=arr[j+1];
			 }
			 check=true;//element deleted
			 arr[arr.length-1]=0; //set last element to zero
			 //if you want
			 break; //for loop should not run once we delete element
		 }
	 }
		if(check)
		{
			System.out.println("Element got deleted");
			//below loop we run till arr.length-1 because array cannot
			//decrease size once we delete element 
			//if we run till arr.length last element will also
			//print which is of no use
			for(int i=0;i<arr.length-1;++i)
			{
				System.out.print(arr[i]+" ");
			}
		}
		else {
			System.out.println("Element which you entered"
					+ " is not present"
					+ " in array so it is not deleted");
		}
		
	}
	
}
