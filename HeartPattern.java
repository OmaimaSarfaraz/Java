package Practice;

public class HeartPattern {
    public static void main(String[]args) {
        for(int i=0;i<6;i++) {
            for(int j=0;j<7;j++) {
                if((i==0&&(j==1||j==5))||(i==1&&(j==0||j==2||j==4||j==6))||
                   (i==2)||(i==3&&j>0&&j<6)||(i==4&&(j==2||j==3||j==4))||
                   (i==5&&j==3)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}