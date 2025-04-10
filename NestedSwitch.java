package controlstatements;

public class NestedSwitch {

	public static void main(String[] args) {
		int day=1;
		int shift=2;
		switch(day){
		case 1:
			switch(shift){
			case 1:
				System.out.println("Morning");
			    break;
			case 2:
				System.out.println("Evening");
				break;
				}
			break;
			default:
				System.out.println("OtherDay");
				}
	}
}