public class Rev{
    public static void main(String[]a){
        int n=1234,r=0;
        while(n>0){
            r=r*10+n%10;
            n/=10;
        }
        System.out.println("Rev = "+r);
    }
}