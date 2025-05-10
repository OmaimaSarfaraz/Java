package Lab09;

import java.util.*;
public class BookStack{
	public static void main(String[] args){
		Stack<String> book=new Stack<>();
		book.push("Jannat K Patty");
		book.push("Namal");
		book.push("Peere Kamil");
		book.push("Usri Yusra");
		book.push("Haalim");
		System.out.println("Removed: "+book.pop());
		System.out.println("Removed: "+book.pop());
		System.out.println("Remaining Books: "+book);
	}
}