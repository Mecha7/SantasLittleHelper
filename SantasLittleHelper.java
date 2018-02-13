/**
 *This program helps input a childs name, age, and two toys along with prices to calculate a total cost
 *12/05/2017 Casey Thompson
 */
 
 import java.util.*;
 import java.text.*;
 
 public class SantasLittleHelper {
 	
 	//Global Definitions
 	
 	static String iData, iFName, iLName, iAge, iToy1, iToy2, oTax, oSubtotal, oTotal;
 	static double iPrice1, iPrice2, cSubtotal, cTax, cTotal, cDiscountT, Discount = .2;
 	
 	static Scanner scanner;
 	static DecimalFormat dfTax, dfTotal, dfSubtotal;
 	
 	public static void main(String[] args) {
 		init();
 		input();
 		calcs();
 		output();
 		
 		
 		
 		
 	}
 		//Init Method
 		public static void init() {
 			scanner = new Scanner(System.in);
 			scanner.useDelimiter("\r\n");
 			dfSubtotal = new DecimalFormat ("####.00");
 			dfTax = new DecimalFormat ("####.00");
 			dfTotal = new DecimalFormat ("####.00");
 			dfDiscount = new DecimalFormat ("####.00");
 		
 	}
 		//Input Method
 		public static void input() {
 			System.out.println("Please enter your first name.");
 			iFName = scanner.next();
 			
 			
 			System.out.println("Please enter your last name.");
 			iLName = scanner.next();
 			
 			
 			System.out.println("Please enter your age.");
 			iAge = scanner.next();
 			
 			
 			System.out.println("Please enter the name of a toy.");
 			iToy1 = scanner.next();
 			
 			
 			System.out.println("Please enter the price of the toy.");
 			iData = scanner.next();
 			
 			try{
 				iPrice1 = Double.parseDouble(iData);
 				
 			}
 			catch(Exception e) {
 				System.out.println("Invalid price entry. Price assigned a value of 0");
 				iPrice1 = 0;
 				
 			}
 			
 			
 			
 			System.out.println("Please enter the name of another toy.");
 			iToy2 = scanner.next();
 			
 			
 			System.out.println("Please enter the price of the other toy.");
 			iData = scanner.next();
 			
 			try{
 				iPrice2 = Double.parseDouble(iData);
 				
 			}
 			catch(Exception e) {
 				System.out.println("Invalid price entry. Price assigned a value of 0");
 				iPrice2 = 0;
 				
 			}
 			

 			
 			
 		
 	}
 		//Calcs Method
 		public static void calcs() {
 			cSubtotal = iPrice1 + iPrice2;
 			cTax = cSubtotal * .07;
 			cDiscountT = cSubtotal * Discount;
 			cTotal = (cSubtotal + cTax) - cDiscountT;
 			
 			
 		
 		
 	}
 		//Output Method - the object sdf only worked for some reason when i put it in output tried init and didn't work
 		public static void output() {
 			
 			Date today;
 			SimpleDateFormat sdf;
 			
 			today = new Date();
 			sdf = new SimpleDateFormat("MM/dd/YYYY");
 			
 			oSubtotal = dfSubtotal.format(cSubtotal);
 			oTax = dfTax.format(cTax);
 			oTotal = dfTotal.format(cTotal);
 			oDiscount = dfDiscont.format(cDiscountT)
 			
 			
 			System.out.println("\n\nHello, " + iFName + " " + iLName);
 			System.out.println(sdf.format(today));
 			System.out.println("Toy 1:" + iToy1);
 			System.out.println("Toy 1 costed: $" + iPrice1);
 			System.out.println("Toy 2:" + iToy2);
 			System.out.println("Toy 2 costed: $" + iPrice2);
 			System.out.println("Subtotal Price: $" + oSubtotal);
 			System.out.println("Tax: $" + oTax);
 			System.out.println("Discount: $" + oDiscount);
 			System.out.println("Total Price: $" + oTotal);
 			System.out.println("Merry Christmas! Enter a key to end.");
 		
 		
 		
 		
 	}
 	
 	
 	
 	
 }