package Practice;
import java.util.Random;

public class SuperheroGenerator {
    public static void main(String[] args) {
        String[] adjectives = {"Mighty", "Invisible", "Super", "Dark", "Iron", "Amazing"};
        String[] nouns = {"Panther", "Falcon", "Wolf", "Shadow", "Titan", "Storm"};
        Random rand = new Random();
        System.out.println("Your Superhero Name: " +
                adjectives[rand.nextInt(adjectives.length)] + " " +
                nouns[rand.nextInt(nouns.length)]);
    }
}