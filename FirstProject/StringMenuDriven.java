import java.util.Scanner;
public class StringMenuDriven {

	public static void main(String[] args) {
		int choice=1;
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		do
		{
		System.out.println("1.Compare two strings");
		System.out.println("2.Get the character in the specified position");
		System.out.println("3.Extract a substring");
		System.out.println("4.Replace a character with the given character");
		System.out.println("5.Get the position of a specified substring/character");
		System.out.println("6.Exit");
		choice = sc1.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("Enter the first string: ");
			String str1 = sc.nextLine();
			System.out.println("Enter the second string: ");
			String str2 = sc.nextLine();
			System.out.println(str1.equals(str2));
			break;
		case 2:
			System.out.println("Enter a string: ");
			String str = sc.nextLine();
			System.out.println("Enter the position to get character from: ");
			int index = sc.nextInt();
			System.out.println(str.charAt(index));
			break;
		case 3:
			Scanner sc3 = new Scanner(System.in);
			System.out.println("Enter a string: ");
			String newstr = sc.nextLine();
			System.out.println("Enter the start index substring to be extracted: ");
			int newstr1 = sc3.nextInt();
			System.out.println("Enter the end index substring to be extracted: ");
			int newstr2 = sc.nextInt();
			System.out.println(newstr.substring(newstr1, newstr2));
			break;
		case 4:
			System.out.println("\nEnter a string: ");
			String strreplace = sc.nextLine();
			System.out.println("Enter the character to replace: ");
			String strreplace1 = sc.nextLine();
			System.out.println("Enter the character to replace with: ");
			String strreplace2 = sc.nextLine();
			System.out.println(strreplace.replace(strreplace1, strreplace2));
			break;
		case 5:
			System.out.println("\nEnter a string: ");
			String strpos = sc.nextLine();
			System.out.println("Enter the substring or character to find: ");
			String strpos1 = sc.nextLine();
			System.out.println(strpos.indexOf(strpos1));
			break;
	    default: System.out.println("Wrong choice!!");
	    			break;
			
		}
		}while(choice!=6);
	}

}
