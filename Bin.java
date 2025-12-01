public class Bin{
    public static void main(String[]a){
        int arr[]={1,2,3,4,5},l=0,r=4,k=3;
        while(l<=r){
            int m=(l+r)/2;
            if(arr[m]==k){
                System.out.println("Found");
                break;
            }
            if(arr[m]<k)
                l=m+1;
            else 
                r=m-1;
        }
    }    
}