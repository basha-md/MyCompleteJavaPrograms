package Inherit;

public class String_reverse 
{

	public static void main(String[] args) 
	{
		String input = "radan";
		String reverse = " ";
		
		for(int i=input.length()-1;i>=0;i--)
		{
			  char op=input.charAt(i);
			  reverse = reverse + op;
					  
		}		 
		System.out.println(reverse);
					  
		

	}

}
