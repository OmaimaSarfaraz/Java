public class SumDigits{
    public static void main(String[]a){
        int n=1234,s=0;
        while(n>0){
            s+=n%10;n/=10;
        }
        System.out.println(s);
    }
}