public class GCD{
    public static void main(String[]a){
        int a1=12,b1=8;
        while(b1!=0){
            int t=b1;
            b1=a1%b1;
            a1=t;
        }
        System.out.println(a1);
    }
}