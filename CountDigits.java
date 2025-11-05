public class CountDigits{
    public static void main(String[]a){
        int n=12345,c=0;
        while(n>0){
            c++;n/=10;
        }
        System.out.println(c);
    }
}