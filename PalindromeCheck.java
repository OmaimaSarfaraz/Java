package Lab09;
import java.util.*;

public class PalindromeCheck{
	public static void main(String[] args){
		Scanner a=new Scanner(System.in);
		System.out.print("Enter a word: ");
		String word=a.next();
		Stack<Character> stack=new Stack<>();
		for(int i=0;i<word.length();i++)
		{
			stack.push(word.charAt(i));
			}
		String reversed="";
		while(!stack.isEmpty())
		{
			reversed+=stack.pop();
			}
		if(word.equals(reversed))
		{
			System.out.println("Palindrome");
		}
		else 
		{
			System.out.println("Not a palindrome");
		}
	}
}