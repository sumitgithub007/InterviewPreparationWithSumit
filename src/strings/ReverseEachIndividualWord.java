package strings;

public class ReverseEachIndividualWord {

	//Reverse Each Individual word of a given string in Java
	
	public static String reverse(String str)
	{
		String revStr="";
		for(int i=str.length()-1;i>=0;--i)
		{
			revStr=revStr+str.charAt(i);
		}
		return revStr;
		
	}
	
	public static void main(String[] args) {
		
	String str = "Follow Sumit On Linkedin"; //output : wolloF timuS nO nidekniL

	String finalStr ="";
	
	String[] arr = str.split(" ");
	
	int counter = 0 ;
	for(int i=0;i<arr.length;++i)
	{
		++counter;
		if(counter<arr.length)
		{
			finalStr = finalStr + reverse(arr[i]) + " ";
		}
		else {
			finalStr = finalStr + reverse(arr[i]);
		}
		
	}
		
	System.out.println(finalStr);	
		
		
		
	}
	
}
