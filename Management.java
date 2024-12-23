package BasicCode;
import java.lang.*;
public class Management{
	Product product[];
	public Management()
	{
		
	}
	public Management(int psize)
	{
		product=new Product[psize];
	}
	public void OrderProduct(Product p)
	{
		int Order=0;
		for(int i=0;i<product.length;i++)
		{
			if(product[i]==null)
			{
				product[i]=p;
				Order=1;
				break;
			}
		}
		if(Order==0)
		{
			System.out.println("Product could not be ordered");
		}
		else{
			System.out.println("Your product could be ordered");
		}
	}
	public Product SearchProduct(String pro_Name)
	{
		int F=0;
		int S=0;
		for(int i=0;i<product.length;i++)
		{
			if(product[i]!=null)
			{
				if(product[i].getProdName().equals(pro_Name))
				{
					F=1;
					S=i;
				}
			}
		}
		if(F==0)
		{
			System.out.println("Product could not be exist");
		}
		else {
			System.out.println("Product could be exist");
			
			
		} return null;
	}
	public void RemoveProduct(Product p)
	{
		int r=0;
		for(int i=0;i<product.length;i++)
		{
			if(product[i]==p)
			{
				product[i]=null;
				r=1;
				break;
			}
		}
		if(r==0)
		{
			System.out.println("Product could not removed");
		}
		else
		{
			System.out.println("product could be removed");
		}
		
	}
	public void showAllProduct()
	{
		for(int i=0;i<product.length;i++)
		{
			if(product[i]!=null)
			{
				
				System.out.println("product Name:"+product[i].getProdName());
		        System.out.println("product category:"+product[i].getProdCategory());
		        System.out.println("product Price:"+product[i].getProdPrice());
			}
		}
	}
	public void ShowDetails()
	{
		int option=0;
		System.out.println("1.  Customer Details.");
		System.out.println("2.  Product Details.");
		System.out.println("3.  Order Product & Payment Method.");
		System.out.println("4.  Add Product.");
		System.out.println("5.  Sales Product.");
		System.out.println("6.  Remove product quantity.");
		System.out.println("7.  Contact.");
		System.out.println("8.  Logout.");
		
		
	}
	public void SalesInfo()
	{
		
		                System.out.println("1. sales IPhone.");
		                System.out.println("2. sales Xiomi.");
				        System.out.println("3. sales TV.");
				        System.out.println("4. sales Laptop.");
				        System.out.println("5. sales Mouse.");
				        System.out.println("6. sales Keyboard.");
				        System.out.println("7. Salling all Product details");
	}
	public void AddInfo()
	{
		        System.out.println("1. Added IPhone.");
		        System.out.println("2. Added Xiomi.");
				System.out.println("3. Added TV.");
				System.out.println("4. Added Laptop.");
				System.out.println("5. Added Mouse.");
				System.out.println("6. Added Keyboard.");
				System.out.println("7. Adding all Product");
	}
}