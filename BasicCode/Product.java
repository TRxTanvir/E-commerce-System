package BasicCode;
import java.lang.*;
import java.util.*;
public class Product{
	private String pro_Name;
	
	
	private String pro_Category;
	public double pro_Price;
	Scanner input = new Scanner(System.in);
	public Product()
	{
		System.out.println(" ");
	}
	public Product(String pro_Name,String pro_Category,double pro_Price)
	{
		this.pro_Name=pro_Name;
		this.pro_Category=pro_Category;
		this.pro_Price=pro_Price;
	}
	public void setProdName(String pro_Name)
	{
		this.pro_Name=pro_Name;
	}
	public String getProdName()
	{
		return pro_Name;
	}
	public void setProdCategory(String pro_Category)
	{
		this.pro_Category=pro_Category;
	}
	public String getProdCategory()
	{
		return pro_Category;
	}
	public void setProdPrice(double pro_Price)
	{
		this.pro_Price=pro_Price;
	}
	public double getProdPrice()
	{
		return pro_Price;
	}
	
	public void ShowProductInfo()
	{
		System.out.print(pro_Name+"\t\t\t"+pro_Category+"\t\t\t"+pro_Price+"\t\t\t");
		//System.out.println("product category:"+pro_Category);
		//System.out.println("product Price:"+pro_Price);
	}
	 public double Price;
	public void Bkash()
	{
		long number;
		
		System.out.println("Enter Bkash number");
		number=input.nextLong();
		System.out.println("Enter Amount");
		Price=input.nextDouble();
	    
		if(Price==getProdPrice())
		{
			System.out.println("Payment Success");
		}
		 else {
			System.out.println("Invalid");
		}
		
		
		
	}
    public void Nogod()
	{
		long number;
		double Price;
		System.out.println("Enter Nogod number");
		number=input.nextLong();
		System.out.println("Enter Amount");
		Price=input.nextDouble();
		if(Price==getProdPrice()){
			System.out.println("Payment Success");
		}
		else {
			System.out.println("Invalid");
		}
	
	}
	public void Rocket()
	{
		long number;
		System.out.println("Enter Rocket number");
		number=input.nextLong();
		System.out.println("Enter Amount");
		Price=input.nextDouble();
		if(Price==getProdPrice()){
			System.out.println("Payment Success");
		}
		else {
			System.out.println("Invalid");
		}
		
	}
}