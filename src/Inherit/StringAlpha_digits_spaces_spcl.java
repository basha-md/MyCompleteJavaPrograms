package Inherit;

public class StringAlpha_digits_spaces_spcl {

	public static void main(String[] args) {
		
		String name = "harish12@#$";
		
		int alpha = 0;
		int digits = 0;
		int spaces = 0;
		int others = 0;
		
		
		 for(char c1: name.toCharArray())
				 {
			 if(Character.isAlphabetic(c1))
			 { alpha++;
				 
			 } else if(Character.isDigit(c1))
			 
			 { digits++;
				 
			 } else if(Character.isSpaceChar(c1))
			 { spaces++;
				 
			 } else
			 { others++;
				 
			 }
			 
				 }	 
				
		 System.out.println("no.of alpha " + alpha);
		 System.out.println("no.of digits " + digits);
		 System.out.println("no.of spaces " + spaces);
		 System.out.println("no.of spcl " + others);
	}

}
