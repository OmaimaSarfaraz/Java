package polymorphism;

public class MessageOverload {
	static void message(){
		System.out.println("No message.");
		}
	static void message(String msg){
		System.out.println("Message: "+msg);
		}
	static void message(String msg,int times){
		for(int i=1;i<=times;i++){
			System.out.println("Message "+i+": "+msg);        
	}
	}
}