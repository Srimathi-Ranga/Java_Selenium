import java.util.*;
class Swiggy 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) throws Exception
	{
		System.out.println("Welcome");
		System.out.println("Select the hotel");
		System.out.println("1.Buhari Hotel\n2.SS Hyderabad\n3.A2B\n4.Amma Canteen");
		int hotel=sc.nextInt();
		System.out.println("\t\t\t\tProcessing...");
		Thread.sleep(2000);
		switch(hotel)
		{
			case 1:
				{   System.out.println("Greetings from Buhari Hotel");
					System.out.println("Select your menu");
					System.out.println("1.Chicken Briyani\n2.Mutton Briyani\n3.Prawn Briyani\n4.Chicken-65");
					int food=sc.nextInt();
					Thread.sleep(1000);
					switch(food)
					{	
						case 1:
						{ double price=300;
						  System.out.println("Enter the quantity");
						  int qty=sc.nextInt();
						  double bill_amount=price*qty;
						  System.out.println("Bill amount: "+bill_amount);
						  System.out.println("Select payment method");
						  System.out.println("1.G-pay\n2.Phone-pay");
						  int pay=sc.nextInt();
						  switch(pay)
							{
								case 1:
								{ 
									System.out.println("Welcome to gpay");
									System.out.println("Enter the amount");
									int user_amt=sc.nextInt();
									if(bill_amount==user_amt)
									{
									  int sys_otp=(int)(Math.random()*9999+2345);
									  System.out.println("Enter the otp: "+sys_otp);
									  int user_otp=sc.nextInt();
									  if(user_otp==sys_otp)
									  {
										System.out.println("Order received!!!");
									  }	
									  else
									  {
										  System.out.println("Sorry! Order failed");
									  }
									}
									else
									{
										System.out.println("Sorry! Order failed");
									}	
						
									break;}
									case 2:
								{ 
									System.out.println("Welcome to phone-pay");
									System.out.println("Enter the amount");
									int user_amt=sc.nextInt();
									if(bill_amount==user_amt)
									{
									  int sys_otp=(int)(Math.random()*9999+2345);
									  System.out.println("Enter the otp: "+sys_otp);
									  int user_otp=sc.nextInt();
									  if(user_otp==sys_otp)
									  {
										System.out.println("Order received!!!");
									  }	
									  else
									  {
										  System.out.println("Sorry! Order failed");
									  }
									}
									else
									{
										System.out.println("Sorry! Order failed");
									}	
						
									break;}
								
								
								default:{System.out.println("Invalid option");
								         break;}
							   }	  
						
						break;}
						
						
						case 2:
						{ double price=400;
						  System.out.println("Enter the quantity");
						  int qty=sc.nextInt();
						  double bill_amount=price*qty;
						  System.out.println("Bill amount: "+bill_amount);
						  System.out.println("Select payment method");
						  System.out.println("1.G-pay\n2.Phone-pay");
						  int pay=sc.nextInt();
						  switch(pay)
							{
								case 1:
								{ 
									System.out.println("Welcome to gpay");
									System.out.println("Enter the amount");
									int user_amt=sc.nextInt();
									if(bill_amount==user_amt)
									{
									  int sys_otp=(int)(Math.random()*9999+2345);
									  System.out.println("Enter the otp: "+sys_otp);
									  int user_otp=sc.nextInt();
									  if(user_otp==sys_otp)
									  {
										System.out.println("Order received!!!");
									  }	
									  else
									  {
										  System.out.println("Sorry! Order failed");
									  }
									}
									else
									{
										System.out.println("Sorry! Order failed");
									}	
						
									break;}
									case 2:
								{ 
									System.out.println("Welcome to phone-pay");
									System.out.println("Enter the amount");
									int user_amt=sc.nextInt();
									if(bill_amount==user_amt)
									{
									  int sys_otp=(int)(Math.random()*9999+2345);
									  System.out.println("Enter the otp: "+sys_otp);
									  int user_otp=sc.nextInt();
									  if(user_otp==sys_otp)
									  {
										System.out.println("Order received!!!");
									  }	
									  else
									  {
										  System.out.println("Sorry! Order failed");
									  }
									}
									else
									{
										System.out.println("Sorry! Order failed");
									}	
						
									break;}
								
								
								default:{System.out.println("Invalid option");
								         break;}
							   }	  
						
						break;}
						case 3:
						{ double price=200;
						  System.out.println("Enter the quantity");
						  int qty=sc.nextInt();
						  double bill_amount=price*qty;
						  System.out.println("Bill amount: "+bill_amount);
						  System.out.println("Select payment method");
						  System.out.println("1.G-pay\n2.Phone-pay");
						  int pay=sc.nextInt();
						  switch(pay)
							{
								case 1:
								{ 
									System.out.println("Welcome to gpay");
									System.out.println("Enter the amount");
									int user_amt=sc.nextInt();
									if(bill_amount==user_amt)
									{
									  int sys_otp=(int)(Math.random()*9999+2345);
									  System.out.println("Enter the otp: "+sys_otp);
									  int user_otp=sc.nextInt();
									  if(user_otp==sys_otp)
									  {
										System.out.println("Order received!!!");
									  }	
									  else
									  {
										  System.out.println("Sorry! Order failed");
									  }
									}
									else
									{
										System.out.println("Sorry! Order failed");
									}	
						
									break;}
									case 2:
								{ 
									System.out.println("Welcome to phone-pay");
									System.out.println("Enter the amount");
									int user_amt=sc.nextInt();
									if(bill_amount==user_amt)
									{
									  int sys_otp=(int)(Math.random()*9999+2345);
									  System.out.println("Enter the otp: "+sys_otp);
									  int user_otp=sc.nextInt();
									  if(user_otp==sys_otp)
									  {
										System.out.println("Order received!!!");
									  }	
									  else
									  {
										  System.out.println("Sorry! Order failed");
									  }
									}
									else
									{
										System.out.println("Sorry! Order failed");
									}	
						
									break;}
								
								
								default:{System.out.println("Invalid option");
								         break;}
							   }	  
						
						break;}
						case 4:
						{ double price=300;
						  System.out.println("Enter the quantity");
						  int qty=sc.nextInt();
						  double bill_amount=price*qty;
						  System.out.println("Bill amount: "+bill_amount);
						  System.out.println("Select payment method");
						  System.out.println("1.G-pay\n2.Phone-pay");
						  int pay=sc.nextInt();
						  switch(pay)
							{
								case 1:
								{ 
									System.out.println("Welcome to gpay");
									System.out.println("Enter the amount");
									int user_amt=sc.nextInt();
									if(bill_amount==user_amt)
									{
									  int sys_otp=(int)(Math.random()*9999+2345);
									  System.out.println("Enter the otp: "+sys_otp);
									  int user_otp=sc.nextInt();
									  if(user_otp==sys_otp)
									  {
										System.out.println("Order received!!!");
									  }	
									  else
									  {
										  System.out.println("Sorry! Order failed");
									  }
									}
									else
									{
										System.out.println("Sorry! Order failed");
									}	
						
									break;}
									case 2:
								{ 
									System.out.println("Welcome to phone-pay");
									System.out.println("Enter the amount");
									int user_amt=sc.nextInt();
									if(bill_amount==user_amt)
									{
									  int sys_otp=(int)(Math.random()*9999+2345);
									  System.out.println("Enter the otp: "+sys_otp);
									  int user_otp=sc.nextInt();
									  if(user_otp==sys_otp)
									  {
										System.out.println("Order received!!!");
									  }	
									  else
									  {
										  System.out.println("Sorry! Order failed");
									  }
									}
									else
									{
										System.out.println("Sorry! Order failed");
									}	
						
									break;}
								
								
								default:{System.out.println("Invalid option");
								         break;}
							   }	  
						
						break;}
						
						default:{System.out.println("Invalid option");
								         break;}
				
					}
		               break;} 
					   case 2:
				{   System.out.println("Greetings from SS Hyderabad Hotel");
					System.out.println("Select your menu");
					System.out.println("1.Chicken Briyani\n2.Mutton Briyani\n3.Prawn Briyani\n4.Chicken-65");
					int food=sc.nextInt();
					Thread.sleep(1000);
					switch(food)
					{	
						case 1:
						{ double price=300;
						  System.out.println("Enter the quantity");
						  int qty=sc.nextInt();
						  double bill_amount=price*qty;
						  System.out.println("Bill amount: "+bill_amount);
						  System.out.println("Select payment method");
						  System.out.println("1.G-pay\n2.Phone-pay");
						  int pay=sc.nextInt();
						  switch(pay)
							{
								case 1:
								{ 
									System.out.println("Welcome to gpay");
									System.out.println("Enter the amount");
									int user_amt=sc.nextInt();
									if(bill_amount==user_amt)
									{
									  int sys_otp=(int)(Math.random()*9999+2345);
									  System.out.println("Enter the otp: "+sys_otp);
									  int user_otp=sc.nextInt();
									  if(user_otp==sys_otp)
									  {
										System.out.println("Order received!!!");
									  }	
									  else
									  {
										  System.out.println("Sorry! Order failed");
									  }
									}
									else
									{
										System.out.println("Sorry! Order failed");
									}	
						
									break;}
									case 2:
								{ 
									System.out.println("Welcome to phone-pay");
									System.out.println("Enter the amount");
									int user_amt=sc.nextInt();
									if(bill_amount==user_amt)
									{
									  int sys_otp=(int)(Math.random()*9999+2345);
									  System.out.println("Enter the otp: "+sys_otp);
									  int user_otp=sc.nextInt();
									  if(user_otp==sys_otp)
									  {
										System.out.println("Order received!!!");
									  }	
									  else
									  {
										  System.out.println("Sorry! Order failed");
									  }
									}
									else
									{
										System.out.println("Sorry! Order failed");
									}	
						
									break;}
								
								
								default:{System.out.println("Invalid option");
								         break;}
							   }	  
						
						break;}
						
						
						case 2:
						{ double price=400;
						  System.out.println("Enter the quantity");
						  int qty=sc.nextInt();
						  double bill_amount=price*qty;
						  System.out.println("Bill amount: "+bill_amount);
						  System.out.println("Select payment method");
						  System.out.println("1.G-pay\n2.Phone-pay");
						  int pay=sc.nextInt();
						  switch(pay)
							{
								case 1:
								{ 
									System.out.println("Welcome to gpay");
									System.out.println("Enter the amount");
									int user_amt=sc.nextInt();
									if(bill_amount==user_amt)
									{
									  int sys_otp=(int)(Math.random()*9999+2345);
									  System.out.println("Enter the otp: "+sys_otp);
									  int user_otp=sc.nextInt();
									  if(user_otp==sys_otp)
									  {
										System.out.println("Order received!!!");
									  }	
									  else
									  {
										  System.out.println("Sorry! Order failed");
									  }
									}
									else
									{
										System.out.println("Sorry! Order failed");
									}	
						
									break;}
									case 2:
								{ 
									System.out.println("Welcome to phone-pay");
									System.out.println("Enter the amount");
									int user_amt=sc.nextInt();
									if(bill_amount==user_amt)
									{
									  int sys_otp=(int)(Math.random()*9999+2345);
									  System.out.println("Enter the otp: "+sys_otp);
									  int user_otp=sc.nextInt();
									  if(user_otp==sys_otp)
									  {
										System.out.println("Order received!!!");
									  }	
									  else
									  {
										  System.out.println("Sorry! Order failed");
									  }
									}
									else
									{
										System.out.println("Sorry! Order failed");
									}	
						
									break;}
								
								
								default:{System.out.println("Invalid option");
								         break;}
							   }	  
						
						break;}
						case 3:
						{ double price=200;
						  System.out.println("Enter the quantity");
						  int qty=sc.nextInt();
						  double bill_amount=price*qty;
						  System.out.println("Bill amount: "+bill_amount);
						  System.out.println("Select payment method");
						  System.out.println("1.G-pay\n2.Phone-pay");
						  int pay=sc.nextInt();
						  switch(pay)
							{
								case 1:
								{ 
									System.out.println("Welcome to gpay");
									System.out.println("Enter the amount");
									int user_amt=sc.nextInt();
									if(bill_amount==user_amt)
									{
									  int sys_otp=(int)(Math.random()*9999+2345);
									  System.out.println("Enter the otp: "+sys_otp);
									  int user_otp=sc.nextInt();
									  if(user_otp==sys_otp)
									  {
										System.out.println("Order received!!!");
									  }	
									  else
									  {
										  System.out.println("Sorry! Order failed");
									  }
									}
									else
									{
										System.out.println("Sorry! Order failed");
									}	
						
									break;}
									case 2:
								{ 
									System.out.println("Welcome to phone-pay");
									System.out.println("Enter the amount");
									int user_amt=sc.nextInt();
									if(bill_amount==user_amt)
									{
									  int sys_otp=(int)(Math.random()*9999+2345);
									  System.out.println("Enter the otp: "+sys_otp);
									  int user_otp=sc.nextInt();
									  if(user_otp==sys_otp)
									  {
										System.out.println("Order received!!!");
									  }	
									  else
									  {
										  System.out.println("Sorry! Order failed");
									  }
									}
									else
									{
										System.out.println("Sorry! Order failed");
									}	
						
									break;}
								
								
								default:{System.out.println("Invalid option");
								         break;}
							   }	  
						
						break;}
						case 4:
						{ double price=300;
						  System.out.println("Enter the quantity");
						  int qty=sc.nextInt();
						  double bill_amount=price*qty;
						  System.out.println("Bill amount: "+bill_amount);
						  System.out.println("Select payment method");
						  System.out.println("1.G-pay\n2.Phone-pay");
						  int pay=sc.nextInt();
						  switch(pay)
							{
								case 1:
								{ 
									System.out.println("Welcome to gpay");
									System.out.println("Enter the amount");
									int user_amt=sc.nextInt();
									if(bill_amount==user_amt)
									{
									  int sys_otp=(int)(Math.random()*9999+2345);
									  System.out.println("Enter the otp: "+sys_otp);
									  int user_otp=sc.nextInt();
									  if(user_otp==sys_otp)
									  {
										System.out.println("Order received!!!");
									  }	
									  else
									  {
										  System.out.println("Sorry! Order failed");
									  }
									}
									else
									{
										System.out.println("Sorry! Order failed");
									}	
						
									break;}
									case 2:
								{ 
									System.out.println("Welcome to phone-pay");
									System.out.println("Enter the amount");
									int user_amt=sc.nextInt();
									if(bill_amount==user_amt)
									{
									  int sys_otp=(int)(Math.random()*9999+2345);
									  System.out.println("Enter the otp: "+sys_otp);
									  int user_otp=sc.nextInt();
									  if(user_otp==sys_otp)
									  {
										System.out.println("Order received!!!");
									  }	
									  else
									  {
										  System.out.println("Sorry! Order failed");
									  }
									}
									else
									{
										System.out.println("Sorry! Order failed");
									}	
						
									break;}
								
								
								default:{System.out.println("Invalid option");
								         break;}
							   }	  
						
						break;}
						
						default:{System.out.println("Invalid option");
								         break;}
				
					}
		               break;} 
					case 3:
				{   System.out.println("Greetings from A2B Hotel");
					System.out.println("Select your menu");
					System.out.println("1.Idli\n2.Masala dosa\n3.Paneer pualo\n4.Fried Rice");
					int food=sc.nextInt();
					Thread.sleep(1000);
					switch(food)
					{	
						case 1:
						{ double price=20;
						  System.out.println("Enter the quantity");
						  int qty=sc.nextInt();
						  double bill_amount=price*qty;
						  System.out.println("Bill amount: "+bill_amount);
						  System.out.println("Select payment method");
						  System.out.println("1.G-pay\n2.Phone-pay");
						  int pay=sc.nextInt();
						  switch(pay)
							{
								case 1:
								{ 
									System.out.println("Welcome to gpay");
									System.out.println("Enter the amount");
									int user_amt=sc.nextInt();
									if(bill_amount==user_amt)
									{
									  int sys_otp=(int)(Math.random()*9999+2345);
									  System.out.println("Enter the otp: "+sys_otp);
									  int user_otp=sc.nextInt();
									  if(user_otp==sys_otp)
									  {
										System.out.println("Order received!!!");
									  }	
									  else
									  {
										  System.out.println("Sorry! Order failed");
									  }
									}
									else
									{
										System.out.println("Sorry! Order failed");
									}	
						
									break;}
									case 2:
								{ 
									System.out.println("Welcome to phone-pay");
									System.out.println("Enter the amount");
									int user_amt=sc.nextInt();
									if(bill_amount==user_amt)
									{
									  int sys_otp=(int)(Math.random()*9999+2345);
									  System.out.println("Enter the otp: "+sys_otp);
									  int user_otp=sc.nextInt();
									  if(user_otp==sys_otp)
									  {
										System.out.println("Order received!!!");
									  }	
									  else
									  {
										  System.out.println("Sorry! Order failed");
									  }
									}
									else
									{
										System.out.println("Sorry! Order failed");
									}	
						
									break;}
								
								
								default:{System.out.println("Invalid option");
								         break;}
							   }	  
						
						break;}
						
						
						case 2:
						{ double price=70;
						  System.out.println("Enter the quantity");
						  int qty=sc.nextInt();
						  double bill_amount=price*qty;
						  System.out.println("Bill amount: "+bill_amount);
						  System.out.println("Select payment method");
						  System.out.println("1.G-pay\n2.Phone-pay");
						  int pay=sc.nextInt();
						  switch(pay)
							{
								case 1:
								{ 
									System.out.println("Welcome to gpay");
									System.out.println("Enter the amount");
									int user_amt=sc.nextInt();
									if(bill_amount==user_amt)
									{
									  int sys_otp=(int)(Math.random()*9999+2345);
									  System.out.println("Enter the otp: "+sys_otp);
									  int user_otp=sc.nextInt();
									  if(user_otp==sys_otp)
									  {
										System.out.println("Order received!!!");
									  }	
									  else
									  {
										  System.out.println("Sorry! Order failed");
									  }
									}
									else
									{
										System.out.println("Sorry! Order failed");
									}	
						
									break;}
									case 2:
								{ 
									System.out.println("Welcome to phone-pay");
									System.out.println("Enter the amount");
									int user_amt=sc.nextInt();
									if(bill_amount==user_amt)
									{
									  int sys_otp=(int)(Math.random()*9999+2345);
									  System.out.println("Enter the otp: "+sys_otp);
									  int user_otp=sc.nextInt();
									  if(user_otp==sys_otp)
									  {
										System.out.println("Order received!!!");
									  }	
									  else
									  {
										  System.out.println("Sorry! Order failed");
									  }
									}
									else
									{
										System.out.println("Sorry! Order failed");
									}	
						
									break;}
								
								
								default:{System.out.println("Invalid option");
								         break;}
							   }	  
						
						break;}
						case 3:
						{ double price=200;
						  System.out.println("Enter the quantity");
						  int qty=sc.nextInt();
						  double bill_amount=price*qty;
						  System.out.println("Bill amount: "+bill_amount);
						  System.out.println("Select payment method");
						  System.out.println("1.G-pay\n2.Phone-pay");
						  int pay=sc.nextInt();
						  switch(pay)
							{
								case 1:
								{ 
									System.out.println("Welcome to gpay");
									System.out.println("Enter the amount");
									int user_amt=sc.nextInt();
									if(bill_amount==user_amt)
									{
									  int sys_otp=(int)(Math.random()*9999+2345);
									  System.out.println("Enter the otp: "+sys_otp);
									  int user_otp=sc.nextInt();
									  if(user_otp==sys_otp)
									  {
										System.out.println("Order received!!!");
									  }	
									  else
									  {
										  System.out.println("Sorry! Order failed");
									  }
									}
									else
									{
										System.out.println("Sorry! Order failed");
									}	
						
									break;}
									case 2:
								{ 
									System.out.println("Welcome to phone-pay");
									System.out.println("Enter the amount");
									int user_amt=sc.nextInt();
									if(bill_amount==user_amt)
									{
									  int sys_otp=(int)(Math.random()*9999+2345);
									  System.out.println("Enter the otp: "+sys_otp);
									  int user_otp=sc.nextInt();
									  if(user_otp==sys_otp)
									  {
										System.out.println("Order received!!!");
									  }	
									  else
									  {
										  System.out.println("Sorry! Order failed");
									  }
									}
									else
									{
										System.out.println("Sorry! Order failed");
									}	
						
									break;}
								
								
								default:{System.out.println("Invalid option");
								         break;}
							   }	  
						
						break;}
						case 4:
						{ double price=150;
						  System.out.println("Enter the quantity");
						  int qty=sc.nextInt();
						  double bill_amount=price*qty;
						  System.out.println("Bill amount: "+bill_amount);
						  System.out.println("Select payment method");
						  System.out.println("1.G-pay\n2.Phone-pay");
						  int pay=sc.nextInt();
						  switch(pay)
							{
								case 1:
								{ 
									System.out.println("Welcome to gpay");
									System.out.println("Enter the amount");
									int user_amt=sc.nextInt();
									if(bill_amount==user_amt)
									{
									  int sys_otp=(int)(Math.random()*9999+2345);
									  System.out.println("Enter the otp: "+sys_otp);
									  int user_otp=sc.nextInt();
									  if(user_otp==sys_otp)
									  {
										System.out.println("Order received!!!");
									  }	
									  else
									  {
										  System.out.println("Sorry! Order failed");
									  }
									}
									else
									{
										System.out.println("Sorry! Order failed");
									}	
						
									break;}
									case 2:
								{ 
									System.out.println("Welcome to phone-pay");
									System.out.println("Enter the amount");
									int user_amt=sc.nextInt();
									if(bill_amount==user_amt)
									{
									  int sys_otp=(int)(Math.random()*9999+2345);
									  System.out.println("Enter the otp: "+sys_otp);
									  int user_otp=sc.nextInt();
									  if(user_otp==sys_otp)
									  {
										System.out.println("Order received!!!");
									  }	
									  else
									  {
										  System.out.println("Sorry! Order failed");
									  }
									}
									else
									{
										System.out.println("Sorry! Order failed");
									}	
						
									break;}
								
								
								default:{System.out.println("Invalid option");
								         break;}
							   }	  
						
						break;}
						
						default:{System.out.println("Invalid option");
								         break;}
				
					}
		               break;} 
					case 4:
				{   System.out.println("Greetings from Amma Canteen");
					System.out.println("Select your menu");
					System.out.println("1.Idli\n2.dosa\n3.Pongal\n4.Poori");
					int food=sc.nextInt();
					Thread.sleep(1000);
					switch(food)
					{	
						case 1:
						{ double price=5;
						  System.out.println("Enter the quantity");
						  int qty=sc.nextInt();
						  double bill_amount=price*qty;
						  System.out.println("Bill amount: "+bill_amount);
						  System.out.println("Select payment method");
						  System.out.println("1.G-pay\n2.Phone-pay");
						  int pay=sc.nextInt();
						  switch(pay)
							{
								case 1:
								{ 
									System.out.println("Welcome to gpay");
									System.out.println("Enter the amount");
									int user_amt=sc.nextInt();
									if(bill_amount==user_amt)
									{
									  int sys_otp=(int)(Math.random()*9999+2345);
									  System.out.println("Enter the otp: "+sys_otp);
									  int user_otp=sc.nextInt();
									  if(user_otp==sys_otp)
									  {
										System.out.println("Order received!!!");
									  }	
									  else
									  {
										  System.out.println("Sorry! Order failed");
									  }
									}
									else
									{
										System.out.println("Sorry! Order failed");
									}	
						
									break;}
									case 2:
								{ 
									System.out.println("Welcome to phone-pay");
									System.out.println("Enter the amount");
									int user_amt=sc.nextInt();
									if(bill_amount==user_amt)
									{
									  int sys_otp=(int)(Math.random()*9999+2345);
									  System.out.println("Enter the otp: "+sys_otp);
									  int user_otp=sc.nextInt();
									  if(user_otp==sys_otp)
									  {
										System.out.println("Order received!!!");
									  }	
									  else
									  {
										  System.out.println("Sorry! Order failed");
									  }
									}
									else
									{
										System.out.println("Sorry! Order failed");
									}	
						
									break;}
								
								
								default:{System.out.println("Invalid option");
								         break;}
							   }	  
						
						break;}
						
						
						case 2:
						{ double price=10;
						  System.out.println("Enter the quantity");
						  int qty=sc.nextInt();
						  double bill_amount=price*qty;
						  System.out.println("Bill amount: "+bill_amount);
						  System.out.println("Select payment method");
						  System.out.println("1.G-pay\n2.Phone-pay");
						  int pay=sc.nextInt();
						  switch(pay)
							{
								case 1:
								{ 
									System.out.println("Welcome to gpay");
									System.out.println("Enter the amount");
									int user_amt=sc.nextInt();
									if(bill_amount==user_amt)
									{
									  int sys_otp=(int)(Math.random()*9999+2345);
									  System.out.println("Enter the otp: "+sys_otp);
									  int user_otp=sc.nextInt();
									  if(user_otp==sys_otp)
									  {
										System.out.println("Order received!!!");
									  }	
									  else
									  {
										  System.out.println("Sorry! Order failed");
									  }
									}
									else
									{
										System.out.println("Sorry! Order failed");
									}	
						
									break;}
									case 2:
								{ 
									System.out.println("Welcome to phone-pay");
									System.out.println("Enter the amount");
									int user_amt=sc.nextInt();
									if(bill_amount==user_amt)
									{
									  int sys_otp=(int)(Math.random()*9999+2345);
									  System.out.println("Enter the otp: "+sys_otp);
									  int user_otp=sc.nextInt();
									  if(user_otp==sys_otp)
									  {
										System.out.println("Order received!!!");
									  }	
									  else
									  {
										  System.out.println("Sorry! Order failed");
									  }
									}
									else
									{
										System.out.println("Sorry! Order failed");
									}	
						
									break;}
								
								
								default:{System.out.println("Invalid option");
								         break;}
							   }	  
						
						break;}
						case 3:
						{ double price=20;
						  System.out.println("Enter the quantity");
						  int qty=sc.nextInt();
						  double bill_amount=price*qty;
						  System.out.println("Bill amount: "+bill_amount);
						  System.out.println("Select payment method");
						  System.out.println("1.G-pay\n2.Phone-pay");
						  int pay=sc.nextInt();
						  switch(pay)
							{
								case 1:
								{ 
									System.out.println("Welcome to gpay");
									System.out.println("Enter the amount");
									int user_amt=sc.nextInt();
									if(bill_amount==user_amt)
									{
									  int sys_otp=(int)(Math.random()*9999+2345);
									  System.out.println("Enter the otp: "+sys_otp);
									  int user_otp=sc.nextInt();
									  if(user_otp==sys_otp)
									  {
										System.out.println("Order received!!!");
									  }	
									  else
									  {
										  System.out.println("Sorry! Order failed");
									  }
									}
									else
									{
										System.out.println("Sorry! Order failed");
									}	
						
									break;}
									case 2:
								{ 
									System.out.println("Welcome to phone-pay");
									System.out.println("Enter the amount");
									int user_amt=sc.nextInt();
									if(bill_amount==user_amt)
									{
									  int sys_otp=(int)(Math.random()*9999+2345);
									  System.out.println("Enter the otp: "+sys_otp);
									  int user_otp=sc.nextInt();
									  if(user_otp==sys_otp)
									  {
										System.out.println("Order received!!!");
									  }	
									  else
									  {
										  System.out.println("Sorry! Order failed");
									  }
									}
									else
									{
										System.out.println("Sorry! Order failed");
									}	
						
									break;}
								
								
								default:{System.out.println("Invalid option");
								         break;}
							   }	  
						
						break;}
						case 4:
						{ double price=15;
						  System.out.println("Enter the quantity");
						  int qty=sc.nextInt();
						  double bill_amount=price*qty;
						  System.out.println("Bill amount: "+bill_amount);
						  System.out.println("Select payment method");
						  System.out.println("1.G-pay\n2.Phone-pay");
						  int pay=sc.nextInt();
						  switch(pay)
							{
								case 1:
								{ 
									System.out.println("Welcome to gpay");
									System.out.println("Enter the amount");
									int user_amt=sc.nextInt();
									if(bill_amount==user_amt)
									{
									  int sys_otp=(int)(Math.random()*9999+2345);
									  System.out.println("Enter the otp: "+sys_otp);
									  int user_otp=sc.nextInt();
									  if(user_otp==sys_otp)
									  {
										System.out.println("Order received!!!");
									  }	
									  else
									  {
										  System.out.println("Sorry! Order failed");
									  }
									}
									else
									{
										System.out.println("Sorry! Order failed");
									}	
						
									break;}
									case 2:
								{ 
									System.out.println("Welcome to phone-pay");
									System.out.println("Enter the amount");
									int user_amt=sc.nextInt();
									if(bill_amount==user_amt)
									{
									  int sys_otp=(int)(Math.random()*9999+2345);
									  System.out.println("Enter the otp: "+sys_otp);
									  int user_otp=sc.nextInt();
									  if(user_otp==sys_otp)
									  {
										System.out.println("Order received!!!");
									  }	
									  else
									  {
										  System.out.println("Sorry! Order failed");
									  }
									}
									else
									{
										System.out.println("Sorry! Order failed");
									}	
						
									break;}
								
								
								default:{System.out.println("Invalid option");
								         break;}
							   }	  
						
						break;}
						
						default:{System.out.println("Invalid option");
								         break;}
				
					}
		               break;} 
	                   default:{System.out.println("Invalid option");
								         break;}								
	}							
  }
 }
	