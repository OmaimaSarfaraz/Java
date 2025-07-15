package Practice;

public class Personality {
    public static void main(String[] args) {
        String[] traits = {"Curious", "Chill", "Adventurous", "Creative", "Loyal", "Funny", "Deep Thinker"};
        String[] quirks = {"Loves frogs", "Hates elevators", "Talks to plants", "Winks too much", "Collects spoons"};

        int t = (int)(Math.random() * traits.length);
        int q = (int)(Math.random() * quirks.length);

        System.out.println("🧬 You are: " + traits[t] + " — and " + quirks[q]);
    }
}