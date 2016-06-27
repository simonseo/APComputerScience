import java.util.Scanner;

public class brilliance01_aackermann 
{
	public static void main(String args[])
	{
		Scanner brilliant = new Scanner(System.in);
		double x = brilliant.nextInt();
		double y = brilliant.nextInt();
		
		double z = brilliant2.brilliance(x,y);
		System.out.println(z);
		
	}
}

class brilliant2
{
	public static double brilliance(double x, double y) 
	{
		double z=0;
		if (x==0)
		{
			z= y+1;
		}
		else if (x>0 && y==0)
		{
			z= brilliance(x-1, 1);
		}
		else if (x>0 && y>0)
		{
			z= brilliance(x-1, brilliance(x, y-1));
		}
		return z;
	}
}