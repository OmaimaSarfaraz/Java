public class Pal{
    public static void main(String[]a){
        int n=121,t=n,r=0;
        while(n>0){
            r=r*10+n%10;
            n/=10;
        }
        if(t==r)
            System.out.println("Palindrome");
        else 
            System.out.println("Not");
    }
}