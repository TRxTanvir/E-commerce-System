package BasicCode;
import java.lang.*;
import java.util.*;
public class AvailableProduct extends Product{
	private int availableQuantity;
	Scanner sc = new Scanner(System.in);
	public AvailableProduct()
	{
		System.out.println(" ");
	}
	public AvailableProduct(String pro_Name,String pro_Category,double pro_Price,int availableQuantity)
	{
		super(pro_Name,pro_Category,pro_Price);
		this.availableQuantity=availableQuantity;
	}
	public void setAvailableQuantity(int availableQuantity)
	{
		this.availableQuantity=availableQuantity;
	}
	public int getAvailableQuantity()
	{
		return availableQuantity;
	}
	public void AddProductQuantity()
	{
		int quantity;
		System.out.print("Enter Adding Product quantity:");
		quantity=sc.nextInt();
		if(quantity!=0){
		availableQuantity+=quantity;}
		else { System.out.println("Your product does not added");} 
	}
	public void SalesProduct()
	{
		int quan;
		System.out.print("Enter Sales product quantity:");
		quan=sc.nextInt();
		if(quan!=0 && availableQuantity>quan)
		{
			availableQuantity-=quan;
		}
		else{
			System.out.println("This product doesn't sales.");
		}
	}
	
	public void ShowInfo()
	{
		super.ShowProductInfo();
		System.out.print(availableQuantity);
	}
	
	public void DeleteProduct()
	{
		availableQuantity=0;
	}
		
	
	
}