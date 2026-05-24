package Encap;

public class passwordmanager {
	private String pass="abc123";
	void changePass(String oldpass,String newpass) {
		if(oldpass==pass)
			pass=newpass;
		System.out.println("New Password: "+pass);
	}
	void validatePass(String password) {
		if(password==pass)
			System.out.println("Correct Password");
		else 
			System.out.println("Incorrect Password");
		
	}
}
