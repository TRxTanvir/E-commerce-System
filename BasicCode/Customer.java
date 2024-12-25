package BasicCode;
import Abstract.*;
import java.lang.*;
import java.util.*;
import FileCode.*;
public class Customer extends Service{
	String cus_name;
	String cus_Id;
	String alldemo=" ";
	Scanner sc = new Scanner(System.in);
	FileReadWriteDemo file =new FileReadWriteDemo();
	
	public void getCustomer()
	{
		System.out.print("Enter customer name:");
		
		cus_name=sc.nextLine();
		System.out.print("Enter cutomer id:");
		
		cus_Id=sc.nextLine();
	}
	public String getName()
	{
		return cus_name;
	}
	public String getId()
	{
		return cus_Id;
	}
	
	public void showInfo()
	{
		System.out.println("Customer Name:"+cus_name);
		System.out.println("Customer id:"+cus_Id);
		
	}
	public String SaveData()
	{
		//System.out.println("Customer Name:"+cus_name);
		 //return cus_name;
		 alldemo+=getName();
		 alldemo+=getId();
		 return alldemo;
	}
	
}