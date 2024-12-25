package BasicCode;
import java.lang.*;

public class Order extends Product{
	private String stattus;
	public double total;
	private String orderDate;
	private String shippedDate;
	
	
	
	public Order()
	{
		System.out.println();
	}
	public Order(String pro_Name,String pro_Category,double pro_Price,String stattus,double total,String orderDate,String shippedDate)
	{
		super(pro_Name,pro_Category,pro_Price);
		this.stattus=stattus;
		this.total=total;
		this.orderDate=orderDate;
		this.shippedDate=shippedDate;
	}
	public void setStattus(String stattus)
	{
		this.stattus=stattus;
	}
	public String getStattus()
	{
		return stattus;
	}
	public void setTotal(double total)
	{
		this.total=total;
	}
	public double getTotal()
	{
		return total;
	}
	public void setOrderDate(String orderDate)
	{
		this.orderDate=orderDate;
	}
	public String getOrderDate()
	{
		return orderDate;
	}
	public void setShippedDate(String shippedDate)
	{
		this.shippedDate=shippedDate;
	}
	public String getShippedDate()
	{
		return shippedDate;
	}
	public void OrderInfo()
	{
		super.ShowProductInfo();
		System.out.println("Stattus:"+stattus);
		System.out.println("Total:"+total);
		System.out.println("Order Date:"+orderDate);
		System.out.println("Shipped Date"+shippedDate);
	}
	
	
	public void ShowOnlineResource()
	{
		int O=0;
		System.out.println("1.Bkash");
		System.out.println("2.Nogod");
		System.out.println("3.Rocket");
	}
	public void OrderProduct()
	{
		System.out.println("1. Iphone");
		System.out.println("2. Xiomi");
		System.out.println("3. TV");
		System.out.println("4. Laptop");
		System.out.println("5. Mouse");
		System.out.println("6. Keyboard");
		System.out.println("7. Payment Method");
}
}