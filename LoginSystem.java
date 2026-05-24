package polymorphism;

public class LoginSystem {
	static void login(String username){
		System.out.println("Logging in user: "+username);
		}
	static void login(String username,String password){
		System.out.println("Authenticating user: "+username+" with password.");
	}
}