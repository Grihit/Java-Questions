import java.util.*;
public class PatternNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number: ");
		int a= sc.nextInt();
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(j+1);
			}
			System.out.println();
		}
	}
}
