package Practice;

public class HiddenMessage {
    public static void main(String[] args) {
        String hidden = "Hello";
        StringBuilder encoded = new StringBuilder();

        for (char ch : hidden.toCharArray()) {
            encoded.append((char) (ch + 100)); // shift char
            encoded.append(' '); // add space to confuse
        }

        System.out.println("Encoded Message (invisible):");
        System.out.println(encoded.toString().replaceAll(".", " ")); // just whitespace
        System.out.println("Decoding...");
        
        StringBuilder decoded = new StringBuilder();
        for (int i = 0; i < encoded.length(); i += 2) {
            decoded.append((char) (encoded.charAt(i) - 100));
        }

        System.out.println("Hidden Message: " + decoded);
    }
}