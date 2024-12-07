package strings;

public class LowerCaseToUpperCase {

	public static void main(String[] args) {
		
		//Given a string of characters in lowercase convert that string to uppercase
		//without using inbuilt methods
		
		//ASCII Value of a-z = 97 to 122
		//ASCII Value of A-Z = 65 to 90
		
		String str = "sumitgoyal";
		char[]c = str.toCharArray();
		
		for(int i=0;i<c.length;++i)
		{
			c[i] =  (char)(c[i]-32);
		}
		
		System.out.println(String.valueOf(c));
		
	}
	
}
