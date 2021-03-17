import java.util.*;
public class Factorial 
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number: ");
		int a= sc.nextInt(); 
		int f=1;
		if(a==1 || a==0)
			System.out.println("The Factorial of "+ a +" is 1");
		else
		{
			for(int i=2;i<=a;i++)
				f=f*i;
			System.out.println("The Factorial of "+ a +" is "+ f);
		}
	}

}
