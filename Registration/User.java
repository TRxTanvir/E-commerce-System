package Registration;
import java.lang.*;
import java.util.*;
public class User{
	String FName;
	String LName;
	String Email;
	String Pass;
    String PNum;
    String Country;
    String City;
    String Address;
    int Zipcode;

//For user input----------------------------------------------------------------
	Scanner sc = new Scanner(System.in);
	public void getReg()
	{
		System.out.println("<<<<<Register>>>>>");
		System.out.print("Enter First Name: ");
		FName=sc.nextLine();
		System.out.print("Enter Last Name: ");
		LName=sc.nextLine();
		System.out.print("Enter Your Email: ");
		Email=sc.nextLine();
		System.out.print("Enter Your Phone Number: ");
		PNum=sc.nextLine();
		System.out.print("Enter Your Password: ");
        Pass=sc.nextLine();
		System.out.print("Enter Country: ");
	    Country=sc.nextLine();
	    System.out.print("Enter City: ");
	    City=sc.nextLine();
	    System.out.print("Enter Address: ");
	    Address=sc.nextLine();
	    System.out.print("Enter Zipcode: ");
	    Zipcode=sc.nextInt();
		
	}

//For Show Info  ---------------------------------------------------------------

  public void showInfo()
	{
        if(!FName.equals("") )
	    {
			if(!LName.equals(""))
			{
				if(!Email.equals(""))
				{
					if(!Pass.equals(""))
					{
						if(!PNum.equals(""))
					    {
						    if(Country!=null)
	                        {
		                        if(City!=null)
		                        {
			                        if(Address!=null)
			                        {
				                        if(Zipcode!=0)
				                        {	
									         System.out.println("---Regestration Complete---");
					                    }
				                    }
			                    }
		                    }
	                    }
					}
				}
			}
		}
	
        else {System.out.println("Sorry.You are not Regestered");}
    }

//for login---------------------------------------------------------------------
String Em;
String Pa;
	public void getLogin()
	{
		System.out.println("Enter Your Email: ");
		sc.nextLine();
		Em=sc.nextLine();
		System.out.println("Password: ");
		Pa=sc.nextLine();

		if(Email.equals(Em) == Pass.equals(Pa) )
		{
			System.out.println("---Login Successfull--- ");
		}

		else
    {
      System.out.println("Password Or Email Is Incorrect! ");
    }

	}
	

}
