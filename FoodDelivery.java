package PRoject2;

import java.util.Scanner;

public class FoodDelivery {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		String Choice;
		do {
			
		System.out.println("Enter 1 for Pick up and 2 for Delivery. q to quit.");
		Choice= Scan.next();
		
		switch(Choice) {
		case "1": 
			System.out.println("You have chosen pick up.");
			System.out.println("Resturants in a 5 mile radius:\n 1. Olive Garden\n 2. Wendy's\n 3. Papa Johns \n 4. Domino's");
			int y;
			int food;
			int pay;
			y = Scan.nextInt();
			if(y==1) {
				System.out.println("Menu\n1. Pizza\n2. Chicken Alfredo\n3. Chicken Parmigiana\n4. Shrimp Alfredo\n5. Lasagna\n6. Meatballs\n7. Fettucine\n8. Mac and Cheese\n9. Ravioli\n10. Salmon\n11. Sirloin\n12. Seafood Alfredo\n13. Spaghetti\n14. Breadsitcks\n15. Salad");
				System.out.println("What would you like to buy?");
				food = Scan.nextInt();
				if(food<=15 && food>0) {
					System.out.println("Enter\n1:Cash\n2.Debit\n3.Credit");
					pay=Scan.nextInt();
					System.out.println("----------Total----------\n1 Item 8.99\nSubtotal: 8.99\nTax .48\nTOTAL $9.47");
				}
				else {
					System.out.println("Invalid!");
				}
			}
			else if(y==2){
				System.out.println("Menu\n1. Chicken nuggets\n2. Cheeseburger\n3. hamburger\n4. Fries\n5. Chili\n6. Baked potato\n7. Double cheeseburger\n7. Triple cheeseburger\n8. Bacon cheese burger\n9. double bacon cheeseburger\n10. triple bacon cheeseburger\n11. Spicey nuggets\n12. Loaded fries\n13. Baconator\n14. Kids meal\n15. Drink");
				System.out.println("What would you like to buy?");
				food = Scan.nextInt();
				if(food<=15 && food>0) {
					System.out.println("Enter\n1:Cash\n2.Debit\n3.Credit");
					pay=Scan.nextInt();
					System.out.println("----------Total----------\n1 Item 8.99\nSubtotal: 8.99\nTax .48\nTOTAL $9.47");
				}
				else {
					System.out.println("Invalid!");
				}
			}
			else if(y==3) {
				System.out.println("Menu\n1. Cheese\n2. Pepperoni\n3. Sausage\n4. Mushroom\n5. Pineapple\n6. Ham\n7. Green pepper\n8. Bannana pepper\n9. Meatball\n10. tomato\n11. spinach\n12. Chicken\n13. Cheese bread\n14. Pasta\n15. Chicken wings");
				System.out.println("What would you like to buy?");
				food = Scan.nextInt();
				if(food<=15 && food>0) {
					System.out.println("Enter\n1:Cash\n2.Debit\n3.Credit");
					pay=Scan.nextInt();
					System.out.println("----------Total----------\n1 Item 8.99\nSubtotal: 8.99\nTax .48\nTOTAL $9.47");
				}
				else {
					System.out.println("Invalid!");
				}
			}
			else if(y==4) {
				System.out.println("Menu\n1. Cheese\n2. Pepperoni\n3. Sausage\n4. Mushroom\n5. Pineapple\n6. Ham\n7. Green pepper\n8. Bannana pepper\n9. Meatball\n10. tomato\n11. spinach\n12. Chicken\n13. Cheese bread\n14. Pasta\n15. Chicken wings");
				System.out.println("What would you like to buy?");
				food = Scan.nextInt();
				if(food<=15 && food>0) {
					System.out.println("Enter\n1:Cash\n2.Debit\n3.Credit");
					pay=Scan.nextInt();
					System.out.println("----------Total----------\n1 Item 8.99\nSubtotal: 8.99\nTax .48\nTOTAL $9.47");
				}
				else {
					System.out.println("Invalid!");
				}
			}
			else
				System.out.println("Invalid!");
			break;
		case "2": 
			System.out.println("You have chosen delivery.");
			System.out.println("Resturants in a 5 mile radius:\n 1. Olive Garden\n 2. Wendy's\n 3. Papa Johns \n 4. Domino's");
			y = Scan.nextInt();
			if(y==1) {
				System.out.println("Menu\n1. Pizza\n2. Chicken Alfredo\n3. Chicken Parmigiana\n4. Shrimp Alfredo\n5. Lasagna\n6. Meatballs\n7. Fettucine\n8. Mac and Cheese\n9. Ravioli\n10. Salmon\n11. Sirloin\n12. Seafood Alfredo\n13. Spaghetti\n14. Breadsitcks\n15. Salad");
				System.out.println("What would you like to buy?");
				food = Scan.nextInt();
				if(food<=15 && food>0) {
					System.out.println("Enter\n1:Cash\n2.Debit\n3.Credit");
					pay=Scan.nextInt();
					System.out.println("----------Total----------\n1 Item 8.99\nSubtotal: 8.99\nTax .48\nTOTAL $9.47");
				}
			}
			else if(y==2){
				System.out.println("Menu\n1. Chicken nuggets\n2. Cheeseburger\n3. hamburger\n4. Fries\n5. Chili\n6. Baked potato\n7. Double cheeseburger\n7. Triple cheeseburger\n8. Bacon cheese burger\n9. double bacon cheeseburger\n10. triple bacon cheeseburger\n11. Spicey nuggets\n12. Loaded fries\n13. Baconator\n14. Bacon chicken sandwich\n15. Chicken sandwich");
				System.out.println("What would you like to buy?");
				food = Scan.nextInt();
				if(food<=15 && food>0) {
					System.out.println("Enter\n1:Cash\n2.Debit\n3.Credit");
					pay=Scan.nextInt();
					System.out.println("----------Total----------\n1 Item 8.99\nSubtotal: 8.99\nTax .48\nTOTAL $9.47");
				}
				else {
					System.out.println("Invalid!");
				}
			}
			else if(y==3) {
				System.out.println("Menu\n1. Cheese\n2. Pepperoni\n3. Sausage\n4. Mushroom\n5. Pineapple\n6. Ham\n7. Green pepper\n8. Bannana pepper\n9. Meatball\n10. tomato\n11. spinach\n12. Chicken\n13. Cheese bread\n14. Pasta\n15. Chicken wings");
				System.out.println("What would you like to buy?");
				food = Scan.nextInt();
				if(food<=15 && food>0) {
					System.out.println("Enter\n1:Cash\n2.Debit\n3.Credit");
					pay=Scan.nextInt();
					System.out.println("----------Total----------\n1 Item 8.99\nSubtotal: 8.99\nTax .48\nTOTAL $9.47");
				}
				else {
					System.out.println("Invalid!");
				}
			}
			else if(y==4) {
				System.out.println("Menu\n1. Cheese\n2. Pepperoni\n3. Sausage\n4. Mushroom\n5. Pineapple\n6. Ham\n7. Green pepper\n8. Bannana pepper\n9. Meatball\n10. tomato\n11. spinach\n12. Chicken\n13. Cheese bread\n14. Pasta\n15. Chicken wings");
				System.out.println("What would you like to buy?");
				food = Scan.nextInt();
				if(food<=15 && food>0) {
					System.out.println("Enter\n1:Cash\n2.Debit\n3.Credit");
					pay=Scan.nextInt();
					System.out.println("----------Total----------\n1 Item 8.99\nSubtotal: 8.99\nTax .48\nTOTAL $9.47");
				}
				else {
					System.out.println("Invalid!");
				}
			}
			else
				System.out.println("Invalid!");
			break;
		default:
			System.out.println("Invalid!");
			break;
			
		
		}
		}
		while(Choice!="q");
	}


}
