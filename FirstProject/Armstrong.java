import java.util.*;
import java.lang.Math; 
public class Armstrong 
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number: ");
		int a= sc.nextInt();
		int temp=a;
		double rem,count=0,num=0;
		while(temp>0)
		{
			count++;
			temp=temp/10;
		}
		temp=a;
		while(temp>0)
		{
			rem=temp%10;
			num=num + Math.pow(rem,count);
			temp=temp/10;
		}
		if(num==a)
			System.out.print(a +" is an armstrong number");
		else
			System.out.print(a +" is not an armstrong number");
	}

}
