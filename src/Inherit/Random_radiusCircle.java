package Inherit;

public class Random_radiusCircle 
{

	public static void main(String[] args) 
	{
		final int num=10;
		System.out.println("radius of 10 circle");
		
		for(int i=0;i<10;i++)
		{
			double radius = 1 + Math.random()*10;
			double circle = Math.PI*radius*radius;
			
			System.out.println("circle "+ (i+1)+":" +radius);
			System.out.println("Area of the circles: "+ circle);
			
		}

	}

}
