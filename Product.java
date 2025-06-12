package Java;
import java.util.*;

public class Product {
	int id; 
	String name; 
	double price;
    Product(int id,String name,double price){
        this.id=id; 
        this.name=name; 
        this.price=price;
    }
}
class Cart {
    List<Product> items=new ArrayList<>();
    void addProduct(Product p){
        items.add(p);
        System.out.println(p.name+" added to cart.");
    }
    void showCart(){
        if(items.isEmpty()){
            System.out.println("Cart is empty."); return;
        }
        System.out.println("\nItems in Cart:");
        double total=0;
        for(Product p:items){
            System.out.println(p.name+" - $"+p.price);
            total+=p.price;
        }
        System.out.println("Total Amount: $"+total);
    }
}