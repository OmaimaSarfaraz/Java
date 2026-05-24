public class Prime{
    public static void main(String[]a){
        int n=7,flag=1;
        for(int i=2;i<n;i++)
            if(n%i==0)
                flag=0;
                System.out.println(flag==1?"Prime":"Not");
    }
}