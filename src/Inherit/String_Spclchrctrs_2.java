package Inherit;

public class String_Spclchrctrs_2 
{

	public static void main(String[] args) 
	{
		String name = "rahul123 @#";
		
		int specialcharacters = 0;
		
		for(int i=0;i<name.length();i++)
		{   char c1     =name.charAt(i);
		
		    if(!Character.isLetterOrDigit(c1))
		    { specialcharacters++;
		    	
		    }
			
		}
	     System.out.println("no. of special characters :" + specialcharacters);

	}

}
