public class SecondLarge{
    public static void main(String[]a){
        int arr[]={5,9,3,8},m1=0,m2=0;
        for(int x:arr)
            if(x>m1){
                m2=m1;
                m1=x;
            }
            else if(x>m2)
                m2=x;
                System.out.println(m2);
    }
}

