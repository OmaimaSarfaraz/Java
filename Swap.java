public class Swap{
    public static void main(String[]a){
        int x=5,y=9;
        System.out.println("Before Swapping: "+x+" "+y);
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("After Swapping: "+x+" "+y);
    }
}