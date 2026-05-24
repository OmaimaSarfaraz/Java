public class Armstrong {
    public static void main(String[]a){
        int n=153,t=n,s=0;
        while(n>0){
            int d=n%10;
            s+=d*d*d;
            n/=10;
        }
        System.out.println(s==t?"Armstrong":"Not");
    }
}