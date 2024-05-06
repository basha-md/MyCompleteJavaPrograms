package Inherit;

import BasicKnowledge.Access_specifier_mthds;

public class One extends Access_specifier_mthds {
	
	void serf()
	{
		System.out.println("6");
	}
	 public static void main(String[] args) {
		
		 System.out.println("5");
		 One o1 = new One();
		 o1.serf();
		 o1.add();
		 //o1.sub();
		 o1.multi();
		 //o1.div();
	}

}
