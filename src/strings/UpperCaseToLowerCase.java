package strings;

public class UpperCaseToLowerCase {

	public static void main(String[] args) {
		
		//Given a string of characters in Uppercase convert that string to Lowercase
		//without using inbuilt methods
		
		//ASCII Value of a-z = 97 to 122
		//ASCII Value of A-Z = 65 to 90
		
		String str = "SUMITGOYAL";
		char[]c = str.toCharArray();
		
		for(int i=0;i<c.length;++i)
		{
			c[i] =  (char)(c[i]+32);
		}
		
		System.out.println(String.valueOf(c));
		
	}
	
}
