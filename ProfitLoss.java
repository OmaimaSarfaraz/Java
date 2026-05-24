package Practice;
import java.util.Scanner;

public class ProfitLoss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double totalProfit=0,totalLoss=0;
		for(int i=1;i<=4;i++){
			System.out.print("Enter the cost price of item "+i+": ");
			double costPrice=sc.nextDouble();
			System.out.print("Enter the selling price of item "+i+": ");
			double sellingPrice=sc.nextDouble();
			if(sellingPrice>costPrice){
				double profit=sellingPrice-costPrice;
				totalProfit+=profit;
				System.out.println("Item "+i+" resulted in a profit of: "+profit);
				}
			else if(sellingPrice<costPrice){
				double loss=costPrice-sellingPrice;
				totalLoss+=loss;
				System.out.println("Item "+i+" resulted in a loss of: "+loss);
				}
			else{
				System.out.println("Item "+i+" resulted in no profit or loss.");
				}
			}
		if(totalProfit>totalLoss){
			System.out.println("\nOverall Profit: "+totalProfit);
			}
		else if(totalLoss>totalProfit){
			System.out.println("\nOverall Loss: "+totalLoss);
			}
		else{
			System.out.println("\nOverall, there was no profit or loss.");
			}
	}
}