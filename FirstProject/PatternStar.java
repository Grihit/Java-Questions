import java.util.Scanner;
public class PatternStar {
	public static void main(String args[])  
	{  
	int row, i, j, space = 1;  
	System.out.print("Enter the number of rows(odd number) you want to print: ");  
	Scanner sc = new Scanner(System.in);  
	row = sc.nextInt();  
	space = ((row+1)/2 ) - 1;  
	for (j = 1; j<= ((row+1)/2 ); j++)  
	{  
	for (i = 1; i<= space; i++)  
	{  
	System.out.print(" ");  
	}  
	space--;  
	for (i = 1; i <= 2 * j - 1; i++)  
	{  
	System.out.print("*");  
	}  
	System.out.println("");  
	}  
	space = 1;  
	for (j = 1; j<= ((row+1)/2 ) - 1; j++)  
	{  
	for (i = 1; i<= space; i++)  
	{  
	System.out.print(" ");  
	}  
	space++;  
	for (i = 1; i<= 2 * (((row+1)/2 ) - j) - 1; i++)  
	{  
	System.out.print("*");  
	}  
	System.out.println("");  
	}  
	}
}
