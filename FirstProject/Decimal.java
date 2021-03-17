import java.util.Scanner;
class Convert
{
	Scanner sc= new Scanner(System.in);
	int num;
	void get()
	{
		sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		num = Integer.parseInt(sc.nextLine());
	}
	void convert()
	{
		String hexa = Integer.toHexString(num);
		System.out.println("Hexadecimal Value is : " + hexa);
		String octal = Integer.toOctalString(num);
		System.out.println("Octal Value is : " + octal);
        String binary = Integer.toBinaryString(num);
        System.out.println("Binary Value is : " + binary);
	}
}
public class Decimal {

	public static void main(String[] args) {
		Convert obj = new Convert();
		obj.get();
		obj.convert();

	}

}

