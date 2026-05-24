public class CountVowels{
    public static void main(String[]a){
        String s="hello";
        int c=0;
        for(char x:s.toCharArray())
            if("aeiou".indexOf(x)!=-1)
                c++;
        System.out.println(c);
    }
}