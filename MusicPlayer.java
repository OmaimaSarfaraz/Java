package polymorphism;

public class MusicPlayer {
	void play(String song) {
        System.out.println("Playing song: "+song);
    }

    void play(String song, int volume) {
        System.out.println("Playing "+song+" at volume "+volume);
    }

    void play(String song, int volume, boolean loop) {
        System.out.println("Playing "+song+" at volume "+volume+(loop?" in loop mode":" once"));
    }
}