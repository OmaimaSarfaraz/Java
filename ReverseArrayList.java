package Lab09;
import java.util.*;

public class ReverseArrayList{
	public static void main(String[] args){
		Scanner a=new Scanner(System.in);
		ArrayList<Integer> list=new ArrayList<>();
		System.out.println("Enter 5 integers:");
		for(int i=0;i<5;i++)
		{
			list.add(a.nextInt());
			}
		System.out.println("Original List: "+list);
		ArrayList<Integer> reversed=new ArrayList<>();
		for(int i=list.size()-1;i>=0;i--)
		{
			reversed.add(list.get(i));
			}
		System.out.println("Reversed List: "+reversed);
	}
}