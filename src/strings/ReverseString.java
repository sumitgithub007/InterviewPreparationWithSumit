package strings;

public class ReverseString {

	//Given a string reverse the string 
	
	public static void main(String[] args) {
	
		
		String str = "sumit goyal";
		String revStr = "";
		
		for(int i=str.length()-1;i>=0;--i)
		{
			revStr=revStr+str.charAt(i);
		}
		System.out.println(revStr);
		
		
	}
	
}
