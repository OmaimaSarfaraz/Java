package Practice;

public class HackerTerminal {
    public static void main(String[] args) throws InterruptedException {
        String[] logins = {
            "Connecting to NASA.gov...",
            "Bypassing firewall...",
            "Decrypting access keys...",
            "Access granted!",
            "Downloading top secret files...",
            "System breach successful ✅"
        };

        for (String line : logins) {
            System.out.println("> " + line);
            Thread.sleep(1000);
        }
    }
}