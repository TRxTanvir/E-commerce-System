import BasicCode.*;
import Registration.*;
import Abstract.*;
import Interface.*;
import java.lang.*;
import java.util.*;
import FileCode.*; 
public class Start{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("                E-commerce Management System.");
		
		User u=new User();
        u.getReg();
        System.out.println("");
        u.showInfo();
        System.out.println("");
        u.getLogin();
		FileReadWriteDemo file=new FileReadWriteDemo();
		System.out.println("\n");
		
		System.out.println("                Welcome to E-commerce Management System.");
		System.out.println("\n");
		
		Management manage = new Management(5);
		manage.ShowDetails();
		Customer cus1 = new Customer();
		
		AvailableProduct pro1 = new AvailableProduct("IPhone","Iphone-X",30000,200);
		AvailableProduct pro2 = new AvailableProduct("Xiomi","mi-note10",15000,500);
		AvailableProduct pro3 = new AvailableProduct("TV","Walton   ",25000,700);
		AvailableProduct pro4 = new AvailableProduct("Laptop","Asus     ",45000,150);
		AvailableProduct pro5 = new AvailableProduct("Mouse","Metalic  ",1500,50);
		AvailableProduct pro6 = new AvailableProduct("Keybo","Metalic  ",2000,120);
		
		
		
		Order ord = new Order();
		
		Contact cont = new Contact("www.e-commerce.com","e-commerce123@gmail.com","01810001500");
		
		int option=1;
		
		do{
			System.out.print("\nEnter your Entity: ");
			option=sc.nextInt();
			switch(option)
			{
				case 1: 
				cus1.getCustomer();
				cus1.showInfo();
				file.writeInFile(cus1);
				file.readFromFile();
				System.out.println("\n");
				manage.ShowDetails();
				break;
				
				case 2: System.out.print("Product Name\t\tProduct Category\t\tPrice\t\t\tQuantity\t\t\n");
                pro1.ShowInfo();
				System.out.println("");
                pro2.ShowInfo();
                System.out.println("");				
                pro3.ShowInfo();
                System.out.println("");				
                pro4.ShowInfo();
                System.out.println("");				
                pro5.ShowInfo();
                System.out.println("");				
                pro6.ShowInfo();
				System.out.println("\n");
                manage.ShowDetails();				
				break;
				
				case 3: ord.OrderProduct();
				int or=1;
				do{
					System.out.println("Choose product");
					or=sc.nextInt();
					switch(or)
					{
						case 1: pro1.ShowProductInfo();
						
						break;
						
						case 2: pro2.ShowProductInfo();
						
						break;
						
						case 3: pro3.ShowProductInfo();
						
						break;
						
						case 4: pro4.ShowProductInfo();
						
						break;
						
						case 5: pro5.ShowProductInfo();
						
						break;
						
						case 6: pro6.ShowProductInfo();
						
						break;
						
						case 7: 
				
				ord.ShowOnlineResource();
				int O=1;
				
		do{
			System.out.println("Enter your entity.");
			O=sc.nextInt();
			switch(O)
			{
				case 1: ord.getProdPrice();
				
				ord.Bkash();
				break;
				
				case 2: ord.getProdPrice();
				ord.Nogod();
			    break;
				
				case 3: ord.getProdPrice();
			    ord.Rocket();
			    break;
				
				case 4: System.out.println("  ");
				break;
				default : System.out.println("INvalid Billing process! Please try again");
				break;
			}
		}while(O!=1 && O!=2 && O!=3 && O!=4); 
				
				break;
				
				default : System.out.println("Product does not ordered");
				break;
					}
				}while(or!=7);
				System.out.println("\n");
				manage.ShowDetails();
				break;
				
				
				
				
				case 4: int OP=1;
				manage.AddInfo();
				do{
					System.out.println("Enter your Entity.");
			        OP=sc.nextInt();
					switch(OP)
					{
						case 1: pro1.AddProductQuantity();
						manage.AddInfo();
			            break;
						
						
						
						case 2: pro2.AddProductQuantity();
						manage.AddInfo();
						break;
				        
						
						
						case 3: pro3.AddProductQuantity();
						manage.AddInfo();
						break;
				        
						
						
						case 4: pro4.AddProductQuantity();
						manage.AddInfo();
						break;
				        
						
						
						case 5: pro5.AddProductQuantity();
						manage.AddInfo();
						break;
				        
						
						
						case 6: 
						
						
						pro6.AddProductQuantity();
						manage.AddInfo();
						break;
				        
						
						
						case 7: System.out.println("After added IPhone:"+pro1.getAvailableQuantity());
						System.out.println("After added Xiomi:"+pro2.getAvailableQuantity());
						System.out.println("After added Nokia:"+pro3.getAvailableQuantity());
						System.out.println("After added I-pad:"+pro4.getAvailableQuantity());
						System.out.println("After added Oppo:"+pro5.getAvailableQuantity());
						System.out.println("After added Realme:"+pro6.getAvailableQuantity());
						break;
						
						
						default : System.out.println("Invalid added");
						break;
					}
				}while(OP!=7);
				System.out.println("\n");
				manage.ShowDetails();
				break;
				
				case 5: int p=1;
				manage.SalesInfo();
				        
					do{
					        System.out.println("Enter your Entity.");
			                p=sc.nextInt();
					        switch(p)
					        {
						        case 1: pro1.SalesProduct();
								manage.SalesInfo();
			                    break;
						
						
						
						        case 2: pro2.SalesProduct();
								manage.SalesInfo();
						        break;
				        
						
						 
						        case 3: pro3.SalesProduct();
								manage.SalesInfo();
						        break;
				        
						
						
						        case 4: pro4.SalesProduct();
								manage.SalesInfo();
						        break;
				        
						
						
						        case 5: pro5.SalesProduct();
								manage.SalesInfo();
						        break;
				        
						
						
						        case 6: pro6.SalesProduct();
								manage.SalesInfo();
						        break;
						        
						        case 7: System.out.println("After sales IPhone:"+pro1.getAvailableQuantity());
						        System.out.println("After sales Xiomi:"+pro2.getAvailableQuantity());
						        System.out.println("After sales Nokia:"+pro3.getAvailableQuantity());
						        System.out.println("After sales I-pad:"+pro4.getAvailableQuantity());
						        System.out.println("After sales Oppo:"+pro5.getAvailableQuantity());
						        System.out.println("After sales Realme:"+pro6.getAvailableQuantity());
						        break;
						
						
						        default : System.out.println("Invalid sales");
						        break;
					        }
				        }while(p!=7);
						System.out.println("\n");
						manage.ShowDetails();
						break;
						
						case 6: pro1.DeleteProduct();
						pro2.DeleteProduct();
						pro3.DeleteProduct();
						pro4.DeleteProduct();
						pro5.DeleteProduct();
						pro6.DeleteProduct();
						
						
						System.out.println("Stock over! ");
						System.out.println("\n");
						manage.ShowDetails();
						break;
						
						
                 	    
				        case 7:cont.ShowInfo();
						System.out.println("\n");
						manage.ShowDetails();
				        break; 
						
						case 8: System.out.println(" ");
						break;
						default: System.out.println("Invalid! Please try again");
						break;
			}
		}while(option!=8);
		System.out.println("Thank you for visiting our System Managemant.");
	}
}