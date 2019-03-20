import java.util.Scanner;
public class CUI {
	public static void main(String[] args) {
		String userName;
		String password;
		int count=0;
		Scanner input=new Scanner(System.in);
		while(count<3)
		{
			System.out.println("Enter Username");
			userName = input.nextLine();
			System.out.println("Enter Password");
			password = input.nextLine();
			if(userName.equals("lahari") && password.equals("ammu"))
			{
				System.out.println("Welcome " +userName);
				break;
			}
			else
			{
				++count;
				System.out.println("Attempts Left"+(3-count));
			
			}
		}
		if(count==3)
		{
			System.out.println("Contact Admin");
		}
		input.close();
	}
}
