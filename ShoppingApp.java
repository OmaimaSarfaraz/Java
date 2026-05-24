package Java;
import java.util.*;

public class ShoppingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
        Product laptop=new Product(1,"Laptop",1000);
        Product phone=new Product(2,"Phone",500);
        Product headphones=new Product(3,"Headphones",100);
        Cart myCart=new Cart();
        int choice;
        do{
            System.out.println("\n--- Shopping Menu ---");
            System.out.println("1. Buy Laptop\n2. Buy Phone\n3. Buy Headphones\n4. Show Cart\n5. Exit");
            System.out.print("Enter your choice: ");
            choice=input.nextInt();
            switch(choice){
                case 1: 
                	myCart.addProduct(laptop); 
                	break;
                case 2: 
                	myCart.addProduct(phone); 
                	break;
                case 3: 
                	myCart.addProduct(headphones); 
                	break;
                case 4: 
                	myCart.showCart(); 
                	break;
                case 5: 
                	System.out.println("Thanks for shopping!"); 
                	break;
                default: 
                	System.out.println("Invalid choice!");
            }
        }while(choice!=5);
	}
}