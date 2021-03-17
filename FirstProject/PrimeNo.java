import java.util.*;
import java.lang.Math;
public class PrimeNo 
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number: ");
		double a= sc.nextInt();
		int flag=0;
		for(int i=2;i<Math.sqrt(a);i++)
		{
			if(a%i==0)
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
			System.out.print(a+" is prime");
		else
			System.out.print(a+" is not prime");

	}

}
