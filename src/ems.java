import java.util.*;

public class ems 
{	
	public static void main(String[] args) 
	{
		int choice1;
		char loop1='1',loop2='1';
	    Scanner sc= new Scanner(System.in);
		while(loop1=='1')
		{	
			loop1='0';
			System.out.println("\n  WELCOME TO PRIYANSH INC.");
			System.out.println("\n1.Manager Login");
			System.out.println("2.Employee Login");
			System.out.println("3.New Employee");
			System.out.println("4.About Us");
			System.out.print("\nEnter your choice");
			while(true)
			{
				try		
				{
					choice1=sc.nextInt();
					break;
				}
				catch (java.util.InputMismatchException e)
				{
					System.out.println("Wrong input. Please enter an integer");
					sc.nextLine();
				}
			}	
			switch(choice1)
			{
				case 1:	manager obj=new manager();
						int id2=obj.login();
						if(id2==-1)
							System.out.println("Login failed. You have exceeded maximum number of tries.");
						else
						{
							System.out.println("Login Successful");
							while(loop2=='1')
							{
								System.out.println("\nWelcome");
								System.out.println("\nHow would you like to proceed");
								System.out.println("1.Search as employee");
								System.out.println("2.View Profile");
								System.out.println("3.Update Profile");
								System.out.println("4.Give a feedback");
								System.out.println("\nEnter your choice");
								while(true)
								{
									try		
									{
										choice1=sc.nextInt();
										break;
									}
									catch (java.util.InputMismatchException e)
									{
										System.out.println("Wrong input. Please enter an integer");
										sc.nextLine();
									}
								}
								switch(choice1)
								{
									case 1: obj.search();                                  
											break;
									case 2: obj.profile();									
											break;
									case 3: obj.update();								
											break;
									case 4: obj.feedback();	
											break;
									default:System.out.println("\nWrong Option.");
								}
			
								System.out.println("Would you like to continue or logout? (Enter 1.to continue. Any other key to logout.)");
								loop2=sc.next().charAt(0);
								if(loop2!='1')
									System.out.println("Logout Successful");
							}		
						}
						break;
				
				case 2:	employee obj1= new employee();
						int id3=obj1.login();
						if(id3==-1)
							System.out.println("Login failed. You have exceeded maximum number of tries.");
						else
						{	
							System.out.println("Login Successful");
							while(loop2=='1')
							{
								System.out.println("\nWelcome");
								System.out.println("\nHow would you like to proceed");
								System.out.println("1.View Profile");
								System.out.println("2.Update Profile");
								System.out.println("3.Add a feedback");
								System.out.print("\nEnter your choice");	
								while(true)
								{
									try		
									{
										choice1=sc.nextInt();
										break;
									}
									catch (java.util.InputMismatchException e)
									{
										System.out.println("Wrong input. Please enter an integer");
										sc.nextLine();
									}
								}
								switch(choice1)
								{
									case 1: obj1.profile();                                 
											break;
									case 2: obj1.update();									
											break;
									case 3: obj1.feedback();									
											break;
									default:System.out.println("\nWrong Option.");
								}
								System.out.println("Would you like to continue or logout? (Enter 1.to continue. Any other key to logout.)");
								loop2=sc.next().charAt(0);
								if(loop2!='1')
									System.out.println("Logout Successful");
							}
						}	
						break;
				
				case 3:	employee obj2= new employee();
						obj2.update();
						int newid=(int)(1000*Math.random());
						System.out.println("Your ID number is "+newid);
						break;                                                  
				
				case 4:	System.out.println("\nPriyansh Inc. is a new startup aiming to make java projects.");
						break;											
				default:	System.out.println("\nWrong Option. Try again");
							loop1='1';
			}			 	
		}
		sc.close();
	}
	
}
