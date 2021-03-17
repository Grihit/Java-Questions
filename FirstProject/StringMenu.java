import java.util.Scanner;
public class StringMenu {
	
	public static void main(String[] args) 
	{
		Scanner sc1= new Scanner(System.in);
		int choice=1;
		do {
			System.out.println("1.Insert a string");
			System.out.println("2.Append a string");
			System.out.println("3.Delete a string");
			System.out.println("4.Exit");
			System.out.println("Enter Choice: ");
			choice=sc1.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Inserting string Grihit");
				StringBuffer str1 = new StringBuffer("Grihit ");
				System.out.println("Current string: " + str1);
				break;
			case 2:
				str1 = new StringBuffer("Grihit ");
				System.out.println("Appending 19BCE2141 to the current string");
				str1.insert(7, "19BCE2141");	
				System.out.println("Current string: " + str1);
				break;
			case 3:
				str1 = new StringBuffer("Grihit ");
				System.out.println("Deleting 19BCE2141 from the current string");
				str1.delete(7,14);
				System.out.println("Current string: " + str1);
				break;
			case 4:
				break;
			default:
				System.out.println("Wrong Choice");
			}
		}while(choice!=4);	
	}

}

