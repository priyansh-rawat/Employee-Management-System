import java.util.*;

public class employee extends company
{	
	Scanner sc= new Scanner(System.in);
	
	int login()
	{
		String pass;
		int count=0;
		
		while(count<3)
		{
			System.out.println("COMPANY ID: ");
			while(true)
			{
				try		
				{
					id=sc.nextInt();
					break;
				}
				catch (java.util.InputMismatchException e)
				{
					System.out.println("Wrong input. Please enter an integer");
					sc.nextLine();
				}
			}System.out.println("PASSWORD  : ");
			pass=sc.next();
			if(id!=1 && pass.equals(password))
			{	
				return id;
			}
			else count++;
				System.out.println("Wrong Password");
		}
		return -1;
	}
	
	void feedback() 
	{
		System.out.println("Hello. Please provide us with your feedback.");
		sc.nextLine();
		sc.nextLine();
		System.out.println("\nYour feedback has been noted. Thank you");		
	}
	
	void update() 
	{	
		System.out.println("Press enter key to get started (IGNORE IF PROCESS READY)");
		sc.nextLine();
		System.out.println("Enter your name:");
		name=sc.nextLine();
		System.out.println("Enter your phone no: ");
		phone=sc.nextLine();
		System.out.println("Enter your date of birth: ");
		dob=sc.nextLine();	
		System.out.println("Profile Updated. (Note it may take a few hours to update changes in your profile.)");
	}
	
	void profile() 
	{
		System.out.println("\n  MY PROFILE");
		int randomInt=(int)(10*Math.random());
		System.out.println("NAME          : "+names[randomInt]);
		System.out.println("ID            : "+id);
		long no = (long)(1000000000*Math.random());
		System.out.println("PHONE NUMBER  : 9"+no);
		int d=(int)(10*Math.random());		
		int m=(int)(10*Math.random());				
		System.out.println("DATE OF BIRTH : "+d+"/"+m+"/2000");	
	
	}
}
