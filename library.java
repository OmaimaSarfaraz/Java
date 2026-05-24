package Encap;

public class library {
	private String title="Namal",author="Nemrah Ahmed";
	private boolean isissued;
	void issueBook()
	{
		isissued=true;
		return;
	}
	void returnBook()
	{
		isissued=false;
		return;
	}
	void showStatus()
	{
		if(isissued)
			System.out.println("Issued");
		else
			System.out.println("Available");
	}

}
