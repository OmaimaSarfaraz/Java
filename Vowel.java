public class Vowel{
    public static void main(String[]a){
        char c='e';
        if("aeiouAEIOU".indexOf(c)!=-1)
            System.out.println("Vowel");
        else 
            System.out.println("Consonant");
    }
}