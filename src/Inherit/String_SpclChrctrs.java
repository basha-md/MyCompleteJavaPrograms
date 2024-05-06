package Inherit;

public class String_SpclChrctrs 
{

	public static void main(String[] args) 
	{
		String name = "varun123@#";
		int letters =0;
		int digits =0;
		int spaces =0;
		int others =0;
		
		for(char c1 : name.toCharArray())
		{
			if(Character.isAlphabetic(c1))
			{ letters++;
				
			}else if (Character.isDigit(c1))
			{ digits++;
				
			}else if(Character.isSpaceChar(c1))
			{ spaces++;
				
			}else
			{ others++;
				
			}
		}
			System.out.println("no.of letters: "+ letters);
			System.out.println("no.of digits: "+ digits);
			System.out.println("no.of spaces: "+ spaces);
			System.out.println("no.of others: "+ others);
		}
		
	}


