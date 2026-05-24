package Practice;
import java.util.HashMap;
import java.util.Scanner;

public class MorseCode {
    public static void main(String[] args) {
        HashMap<Character, String> morse = new HashMap<>();
        morse.put('A', ".-"); morse.put('B', "-..."); morse.put('C', "-.-.");
        morse.put('D', "-.."); morse.put('E', "."); morse.put('F', "..-.");
        morse.put('G', "--."); morse.put('H', "...."); morse.put('I', "..");
        morse.put('J', ".---"); morse.put('K', "-.-"); morse.put('L', ".-..");
        morse.put('M', "--"); morse.put('N', "-."); morse.put('O', "---");
        morse.put('P', ".--."); morse.put('Q', "--.-"); morse.put('R', ".-.");
        morse.put('S', "..."); morse.put('T', "-"); morse.put('U', "..-");
        morse.put('V', "...-"); morse.put('W', ".--"); morse.put('X', "-..-");
        morse.put('Y', "-.--"); morse.put('Z', "--..");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine().toUpperCase();

        for (char c : text.toCharArray()) {
            if (morse.containsKey(c))
                System.out.print(morse.get(c) + " ");
            else
                System.out.print(" ");
        }
    }
}