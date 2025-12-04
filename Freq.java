public class Freq{
    public static void main(String[]a){
        String s="banana";
        char c='a';
        int f=0;
        for(char x:s.toCharArray())
            if(x==c)
                f++;
        System.out.println(f);
    }
}