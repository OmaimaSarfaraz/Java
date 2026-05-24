package Practice;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try {
        	int a=5,b=0,c=a/b;
        	System.out.println("The Result is "+c);
        }
        catch(Exception e){
        	System.out.println("The error is "+e.getMessage());
	    }
	}
}
