import java.util.Scanner;

interface Calc
{
	void add();
	void sub();
	void multiply();
	void divide();
}
class FloatValues implements Calc
{
	private float num1;
	private float num2;
	public void add() 
	{
		float sum = num1 + num2;
		System.out.println("Sum: "+sum);
	}
	public void sub() 
	{
		float diff = num1 - num2;
		System.out.println("Difference: "+diff);
	}

	public void multiply() 
	{
		float mul = num1 * num2;
		System.out.println("Multiplication: "+mul);
	}

	public void divide() 
	{
		float div = num1 / num2;
		System.out.println("Division: "+div);
	}
	public void get(float a,float b)
	{
		num1=a;
		num2=b;
	}
}
class IntegerValues implements Calc
{
	private int num1;
	private int num2;
	public void add() 
	{
		int sum = num1 + num2;
		System.out.println("Sum: "+sum);
	}
	public void sub() 
	{
		int diff = num1 - num2;
		System.out.println("Difference: "+diff);
	}

	public void multiply() 
	{
		int mul = num1 * num2;
		System.out.println("Multiplication: "+mul);
	}

	public void divide() 
	{
		int div = num1 / num2;
		System.out.println("Division: "+div);
	}
	
	public void get(int a,int b)
	{
		num1=a;
		num2=b;
	}
}
public class Calculator 
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Float Values(1) or Integer Values(2)? ");
		int choice= sc.nextInt();
		if(choice==1)
		{
			System.out.println("Enter the numbers: ");
			float num1= sc.nextFloat();
			float num2= sc.nextFloat();
			FloatValues obj=new FloatValues();
			obj.get(num1, num2);
			obj.add();
			obj.sub();
			obj.multiply();
			obj.divide();
		}
		else
		{
			System.out.println("Enter the numbers: ");
			int num1= sc.nextInt();
			int num2= sc.nextInt();
			IntegerValues obj=new IntegerValues();
			obj.get(num1, num2);
			obj.add();
			obj.sub();
			obj.multiply();
			obj.divide();
		}
	}

}
