package Practice;

public class OverloadDisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		display("Hello");
		display("Age",25);
		}
	static void display(String msg){
		System.out.println(msg);
		}
	static void display(String msg,int num){
		System.out.println(msg+": "+num);
	}
}